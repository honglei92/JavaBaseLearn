package tool.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author honglei92
 * 
 */
public class LambdaTest {
	static String[] data = { "����", "����", "����" };
	static List<String> roles = Arrays.asList(data);

	public interface AddInterface {
		public abstract void test(int x, int y);
	}

	public static void main(String[] args) {

		// ����list����
		roles.forEach((role) -> System.out.println(role + ";"));
		roles.forEach(System.out::println);
		AddInterface f1 = (int a, int b) -> System.out.println(a + b);
		f1.test(3, 5);
		// �̼߳�д ���������
		new Thread(() -> System.out.println("In lambda")).start();
		mapTest();
	}

	/**
	 * lambda map
	 */
	private static void mapTest() {
		// without lambda
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		for (Integer cost : costBeforeTax) {
			double price = cost + .12 * cost;
			System.out.println(price);
		}
		// with lambda
		List<Integer> costBeforeTaxLa = Arrays.asList(100, 200, 300, 400, 500);
		costBeforeTaxLa.stream().map((cost) -> cost + cost * .12).forEach(System.out::println);

	}

}
