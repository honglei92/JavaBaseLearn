package thread.locktest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountLock {
	private final Lock lock = new ReentrantLock();
	private final Condition con = lock.newCondition();
	private String accountNo;
	private double balance;
	/**
	 * true��ʶûǮ false��ʶ��Ǯ
	 */
	private boolean flag = false;

	public AccountLock() {
		super();
	}

	public AccountLock(String accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	/**
	 * ȡǮ
	 * 
	 * @param drawAmount
	 */
	public void draw(double drawAmount) {
		lock.lock();
		try {
			if (!flag) {
				// this.wait();
				con.await();
			} else {
				System.out.println(Thread.currentThread().getName() + "支出" + drawAmount);
				balance = balance - drawAmount;
				System.out.println("余额:" + balance);
				flag = false;
				// this.notifyAll();
				con.signalAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	/**
	 * ��Ǯ
	 * 
	 * @param depositAmount
	 */
	public void deposit(double depositAmount) {
		lock.lock();
		try {
			if (flag) {
				// this.wait();
				con.await();
			} else {
				System.out.println(Thread.currentThread().getName() + "收入" + depositAmount);
				balance = balance + depositAmount;
				System.out.println("余额:" + balance);
				flag = true;
				// this.notifyAll();
				con.signalAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
