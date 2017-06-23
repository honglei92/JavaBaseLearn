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
	 * true标识没钱 false标识有钱
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
	 * 取钱
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
				System.out.println(Thread.currentThread().getName() + "取钱：" + drawAmount);
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
	 * 存钱
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
				System.out.println(Thread.currentThread().getName() + "存钱：" + depositAmount);
				balance = balance + depositAmount;
				System.out.println("账户余额为:" + balance);
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
