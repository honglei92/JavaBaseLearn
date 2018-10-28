package javawhl.base.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator 泛型
 */
public class GenericTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("abc");
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}
		Box<String> name = new Box<String>("honglei92");
		Box<Integer> age = new Box<Integer>(24);
		getData(name);
		getStringData(age);
	}

	private static void getData(Box<?> name) {
		System.out.println("name:" + name.getData());
	}

	private static void getStringData(Box<? extends Number> name) {
		System.out.println("name:" + name.getData());
	}

	static class Box<T> {
		private T data;

		public Box(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
	}
}
