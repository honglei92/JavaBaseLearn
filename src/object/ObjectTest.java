package object;

import java.util.Date;

public class ObjectTest {
	public static void main(String[] args) {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println(new ObjectTest().toString() + "||"+new Date().toString());
		}
	}

	@Override
	public String toString() {
		return "小猪佩奇";
	}
}
