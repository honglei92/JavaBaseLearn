package extendstest.cla;

import extendstest.inter.StudyEnglish;

public class Dog extends Animal implements StudyEnglish {
	// 抽象类可以实现接口不重写其方法
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.type);// 继承父类的属性
		System.out.println(dog.add(1, 2));// 继承父类的方法
		dog.eat();
		dog.printDay();
		dog.study();
		dog.studyEnglish();
		Size size = dog.new Size();// 内部类的使用
		size.show();
	}

	public Dog() {
		super("动物");// 调用父类构造方法
	}

	public void eat() {
		System.out.println("我要吃狗粮");// 覆盖父类的方法
	}

	@Override
	void printDay() {
		System.out.println("Today is ThursDay");// 实现父类抽象方法
	}

	@Override
	public void study() {
		System.out.println("study  学习");// 实现接口的父接口
	}

	@Override
	public void studyEnglish() {
		System.out.println("studyEnglish  学习英语");// 实现接口
	}

	@Override
	protected void move() {
		super.move();// 重写父类受保护的方法
	}
}
