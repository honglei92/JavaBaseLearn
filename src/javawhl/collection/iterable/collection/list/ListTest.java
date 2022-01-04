package javawhl.collection.iterable.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator List测试
 */
public class ListTest {
	public static void main(String[] args) {
		listFun();
		arrayListFun();

	}

	private static void arrayListFun() {
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add("a");
		}
		arrayList.add("b");
	}

	private static void listFun() {
		// arraylist
		List<String> list = new ArrayList<String>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000000; i++) {
			list.add("王宏雷");
		}
		System.out.println(System.currentTimeMillis());
		// linkedlit
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000000; i++) {
			linkedList.add("王宏雷");
		}
		System.out.println(System.currentTimeMillis());
	}
}
