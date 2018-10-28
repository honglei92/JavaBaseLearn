package javawhl.jvm;

public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(ClassLoader.getSystemClassLoader());
        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
//        BootStrapClassLoader
//        AppletClassLoader appletClassLoader = new AppletClassLoader("");
    }
}
