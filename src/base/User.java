package base;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String userName;

	public User() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void change(int a, String name, List<String> list, User user) {
		a = 3;
		System.out.println("a变更后：" + a);
		name = "电脑";
		System.out.println("name变更后:" + name);
//		list = new ArrayList<String>();
		list.add("4");
		System.out.println("listSize变更后：" + list.size());
		user.setUserName("大头鬼");

		System.out.println("username变更后:" + user.getUserName());
	}
}
