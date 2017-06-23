package extendstest.cla;

public abstract class Animal {
	public String type = "Animal";

	public Animal() {
	}

	public Animal(String home) {
		System.out.println("我们的家族是:" + home);
	}

	abstract void printDay();

	public int add(int a, int b) {
		return a + b;
	}

	public void eat() {
		System.out.println("我要吃食物");
	}

	protected void move() {

	}

	class Size {
		// 内部类
		public Size() {
		}

		private String width;
		private String height;

		public void show() {
			System.out.println("我的size是XXL");
		}
	}
}
