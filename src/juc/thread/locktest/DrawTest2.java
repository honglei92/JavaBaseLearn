package thread.locktest;

public class DrawTest2 {
	public static void main(String[] args) {
		AccountLock account = new AccountLock();
		new Thread(new DrawThread(account, 10000), "交行账户").start();
		new Thread(new DepositThread(account, 10000), "交行账户").start();
		new Thread(new DepositThread(account, 10000), "交行账户").start();
		new Thread(new DrawThread(account, 10000), "交行账户").start();
		new Thread(new DepositThread(account, 10000), "交行账户").start();
	}
}
