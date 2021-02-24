package designpattern.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Baoqiang baoqiang = new Baoqiang();
        // 创建静态代理对象 宋喆
        // Songdaili songdaili = new Songdaili(baoqiang);
        // songdaili.film();

        // 动态代理对象
        Iplayer proxy = (Iplayer) Proxy.newProxyInstance(baoqiang.getClass().getClassLoader(),
                new Class[] { Iplayer.class }, new InvocationHandler() {
                    @Override
                    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
                        System.out.println("经纪人公司派业务员A去处理暴强的新电影");
                        baoqiang.film();
                        return null;
                    }
                });
        proxy.film();
    }
}
