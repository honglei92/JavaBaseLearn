package javawhl.juc.synchronizedtest;

/**
 * 取钱
 */
public class DrawThread implements Runnable {
    private Account account;
    private double drawAmount;

    public DrawThread(Account account, double drawAmount) {
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.draw(drawAmount);
        }
    }

}
