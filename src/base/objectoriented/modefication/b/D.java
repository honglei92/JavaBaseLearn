package modefication.b;

import modefication.a.A;

public class D {
	public static void main(String[] args) {
		A a = new A();
		a.password = "123";
		System.out.println(a.password);
	}
}
