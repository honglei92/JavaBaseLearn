package javawhl.juc.synchronizedtest;

/**
 * 存钱
 */
public class DepositThread implements Runnable {
    private Account account;
    private double depositAmount;

    public DepositThread(Account account, double depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit(depositAmount);
        }
    }

}
