package base;

/**
 * @author Administrator hashcode测试
 */
public class HashTest {
	public static void main(String[] args) {
		String s = "honglei92";
		String s1 = "honglei92";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		Person person = new Person();
		Person person1 = new Person();
		Person person2 = new Person();
		person.age = 13;
		System.out.println(person.hashCode());
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
	}

	static class Person {
		private String name;
		private int age;
		private int height;

		public Person() {
		}
	}
}
