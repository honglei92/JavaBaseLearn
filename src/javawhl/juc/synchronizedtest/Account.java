package javawhl.juc.synchronizedtest;

import util.L;

/**
 * 账户类
 */
public class Account {
    private String accountNo;
    private double balance;
    /**
     * true��ʶ�]Ǯ false��ʶ��Ǯ
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
     * 取钱 同步方法
     *
     * @param drawAmount
     */
    public synchronized void draw(double drawAmount) {
        try {
            if (!flag) {
                this.wait();
            } else {
                L.p(Thread.currentThread().getName() + " draw " + drawAmount);
                balance = balance - drawAmount;
                L.p("balance:" + balance);
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
                L.p(Thread.currentThread().getName() + " deposit " + depositAmount);
                balance = balance + depositAmount;
                L.p("balance:" + balance);
                flag = true;
                this.notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
