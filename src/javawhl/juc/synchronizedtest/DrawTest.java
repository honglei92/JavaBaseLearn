package javawhl.juc.synchronizedtest;

/**
 * 存钱测试类
 */
public class DrawTest {
    public static void main(String[] args) {
        Account account = new Account();
        new Thread(new DrawThread(account, 10000), "draw1").start();
        new Thread(new DepositThread(account, 10000), "deposit1").start();
        new Thread(new DepositThread(account, 10000), "deposit2").start();
        new Thread(new DepositThread(account, 10000), "deposit3").start();
    }
}
