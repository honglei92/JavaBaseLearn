package javawhl.juc.chapter1;

public class test1_3 {
    public static void main(String[] args) {
        shawShank.get();
        shawShank.set("adele");
//        shawShank.get();

    }

    private static ThreadLocal<String> shawShank = ThreadLocal.withInitial(() -> {
        System.out.println("shawShank save himself");
        return null;
    });
}
