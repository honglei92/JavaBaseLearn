package operator;

/**
 * @author Administrator return 语句
 */
public class ReturnTest {
	public static void main(String[] args) {
		int a = 50;
		System.out.println("等级: " + getLevel(a));
		String[] strs = new String[] { "Y", "Y", "N" };
		System.out.println("是否通过: " + getList(strs));
	}

	/**
	 * @param strs
	 * @return 判断是否通过
	 */
	private static String getList(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].equals("N")) {
				return "ERROR";
			}
		}
		return "OK";
	}

	/**
	 * @param a
	 * @return 获取成绩等级
	 */
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
