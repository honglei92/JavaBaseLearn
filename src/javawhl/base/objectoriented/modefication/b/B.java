package javawhl.base.objectoriented.modefication.b;

import javawhl.base.objectoriented.modefication.a.A;

public class B extends A {
	static {
		System.out.println("��̬�����,������");
	}
	{
		System.out.println("��������");
	}

	public B() {
		System.out.println("���췽��");
	}

	public static void main(String[] args) {
		A a = new A();
		a.password = "main����";
		System.out.println(a.password);
		B b = new B();// �Ƚ��빹������
		b.address = "chongqing";
		System.out.println(b.address);

	}
}
