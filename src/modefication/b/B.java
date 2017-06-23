package modefication.b;

import modefication.a.A;

public class B extends A {
	static {
		System.out.println("静态代码块,我最先");
	}
	{
		System.out.println("构造语句块");
	}

	public B() {
		System.out.println("构造方法");
	}

	public static void main(String[] args) {
		A a = new A();
		a.password = "main方法";
		System.out.println(a.password);
		B b = new B();// 先进入构造代码块
		b.address = "chongqing";
		System.out.println(b.address);

	}
}
