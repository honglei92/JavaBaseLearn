package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator List测试
 */
public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000000; i++) {
			list.add("王宏雷");
		}
		System.out.println(System.currentTimeMillis());
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000000; i++) {
			linkedList.add("王宏雷");
		}
		System.out.println(System.currentTimeMillis());
	}
}
