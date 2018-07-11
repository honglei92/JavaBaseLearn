package thread.locktest;

public class DrawThread implements Runnable {
	private AccountLock account;
	private double drawAmount;

	public DrawThread(AccountLock account, double drawAmount) {
		this.account = account;
		this.drawAmount = drawAmount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			account.draw(drawAmount);
		}
	}

}
