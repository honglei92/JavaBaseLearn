package thread.synchronizedtest;

public class DrawTest {
	public static void main(String[] args) {
		Account account = new Account();
		new Thread(new DrawThread(account, 10000), "È¡Ç®Õß").start();
		new Thread(new DepositThread(account, 10000), "´æÇ®Õß¼×").start();
		new Thread(new DepositThread(account, 10000), "´æÇ®ÕßÒÒ").start();
		new Thread(new DepositThread(account, 10000), "´æÇ®Õß±û").start();
	}
}
