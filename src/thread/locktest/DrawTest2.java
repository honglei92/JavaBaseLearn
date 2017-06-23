package thread.locktest;

public class DrawTest2 {
	public static void main(String[] args) {
		AccountLock account = new AccountLock();
		new Thread(new DrawThread(account, 10000), "È¡Ç®Õß").start();
		new Thread(new DepositThread(account, 10000), "´æÇ®Õß¼×").start();
//		new Thread(new DepositThread(account, 10000), "´æÇ®ÕßÒÒ").start();
//		new Thread(new DepositThread(account, 10000), "´æÇ®Õß±û").start();
	}
}
