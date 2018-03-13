package jvm;

/**
 * @author Administrator jvm理解
 */
public class JvmTest {
	{
		System.out.println("static code block");
	}

	public JvmTest() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor method");
	}

	public static void main(String[] args) {
		System.out.println("main");
		JvmTest jvmTest = new JvmTest();
	}
}
