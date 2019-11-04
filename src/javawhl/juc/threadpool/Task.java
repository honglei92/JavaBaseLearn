package javawhl.juc.threadpool;

public class Task implements Runnable {
    private int nov;

    public Task(int i) {
        this.nov = i;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("当前任务线程：" + Thread.currentThread());
        System.out.println("我是任务：" + nov);
    }
}