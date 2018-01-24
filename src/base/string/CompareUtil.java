package base.string;

/**
 * @author Administrator 比较的工具类
 */
public class CompareUtil {
	public static int compareDouble(String d1, String d2) {
		if (d1 != null && d2 != null && !d1.equals("") && !d2.equals("")) {
			Double temp1 = Double.parseDouble(d1.replace("%", ""));
			Double temp2 = Double.parseDouble(d2.replace("%", ""));
			return temp1 - temp2 > 0 ? 1 : -1;
		}
		return 1;
	}
}
