package jvm;

/**
 * @author Administrator jvm理解
 */
public class JvmTest {
    /**
     * 静态代码块
     */ {
        System.out.println("2static code block");
    }

    public JvmTest() {
        //构造方法
        System.out.println("3constructor method");
    }

    public static void main(String[] args) {
        System.out.println("1main");
        JvmTest jvmTest = new JvmTest();
        System.out.println("4." + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
    }
}
