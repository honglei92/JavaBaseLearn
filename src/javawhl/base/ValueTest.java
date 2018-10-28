package javawhl.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator java传参是传值还是传地址
 * 基本类型传值 引用类型对地址的引用，引用可以更改，地址不能更改
 */
public class ValueTest {

	public static void main(String[] args) {
		int a = 5;
		String name = "杯子";
		List<String> list = new ArrayList<>();
		list.add("3");
		User user = new User();
		user.setUserName("王宏雷");
		new User().change(a, name, list, user);

		System.out.println("a：" + a);
		System.out.println("name:" + name);
		System.out.println("listSize:" + list.size());
		System.out.println("username:" + user.getUserName());
	}

}
