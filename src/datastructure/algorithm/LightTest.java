package datastructure.algorithm;

import java.util.Date;

public class LightTest {
	public static void main(String[] args) {
		int a = 200;
		int b = 10;
		System.out.println(new Date().toGMTString());
		for (int i = 0; i < a; i++) {
			boolean current = false;
			if (i % 2 == 0) {
				current = true;
			}
			for (int j = 3; j < b + 1; j++) {
				if (i % j == 0) {
					current = !current;
				}
			}
			if (current == true) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\n" + new Date().toGMTString());
	}
}
