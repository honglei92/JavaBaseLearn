package operator;

/**
 * @author Administrator return 语句
 */
public class ReturnTest {
	public static void main(String[] args) {
		int a = 50;
		String level = getLevel(a);
		System.out.println("成绩:" + level);
	}

	private static String getLevel(int a) {
		try {
			if (a > 90) {
				return "A";
			} else if (a > 80) {
				return "B";
			} else if (a > 70) {
				return "C";
			} else if (a >= 60) {
				return "D";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "成绩无效";
	}
}
