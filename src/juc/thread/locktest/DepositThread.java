package thread.locktest;

public class DepositThread implements Runnable {
	private AccountLock account;
	private double depositAmount;

	public DepositThread(AccountLock account, double depositAmount) {
		this.account = account;
		this.depositAmount = depositAmount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			account.deposit(depositAmount);
		}
	}

}
