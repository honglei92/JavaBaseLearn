package thread.synchronizedtest;

public class Account {
	private String accountNo;
	private double balance;
	/**
	 * true标识沒钱 false标识有钱
	 */
	private boolean flag = false;

	public Account() {
		super();
	}

	public Account(String accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	/**
	 * 取钱
	 * 
	 * @param drawAmount
	 */
	public synchronized void draw(double drawAmount) {
		try {
			if (!flag) {
				this.wait();
			} else {
				System.out.println(Thread.currentThread().getName() + "取钱：" + drawAmount);
				balance = balance - drawAmount;
				System.out.println("余额:" + balance);
				flag = false;
				this.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 存钱
	 * 
	 * @param depositAmount
	 */
	public synchronized void deposit(double depositAmount) {
		try {
			if (flag) {
				this.wait();
			} else {
				System.out.println(Thread.currentThread().getName() + "存钱：" + depositAmount);
				balance = balance + depositAmount;
				System.out.println("账户余额为:" + balance);
				flag = true;
				this.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
