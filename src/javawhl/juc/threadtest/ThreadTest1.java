package javawhl.juc.threadtest;

public class ThreadTest1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                }
            });
            thread.start();
        }
    }
}