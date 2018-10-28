package javawhl.base.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射
 */
public class ReflectCase {
    public static void main(String[] args) throws Exception {
        //实例化肖申克
        Proxy target = new Proxy();
        //通过肖申克实例化救赎方法
        Method method = Proxy.class.getDeclaredMethod("run");
        //方法反射到肖申克
        method.invoke(target);
        Method method1 = Proxy.class.getDeclaredMethod("call");
        method1.invoke(target);

        //实例化姓名field
        Field field = Proxy.class.getDeclaredField("name");
        //获取属性值
        System.out.println(field.get(target));

    }

    static class Proxy {
        public String name = "Shawshank";

        public void run() {
            System.out.println("成都国际马拉松");
        }

        public void call() {
            System.out.println("维达纸巾");
        }
    }
}
