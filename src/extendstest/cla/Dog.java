package extendstest.cla;

import extendstest.inter.StudyEnglish;

public class Dog extends Animal implements StudyEnglish {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.type);
		System.out.println(dog.add(1, 2));
		dog.eat();
		dog.printDay();
		dog.study();
		dog.studyEnglish();
		Size size = dog.new Size();
		size.show();
	}

	public Dog() {
		super("我们是动物");
	}

	public void eat() {
		System.out.println("狗狗吃狗娘");
	}

	@Override
	void printDay() {
		System.out.println("Today is ThursDay");
	}

	@Override
	public void study() {
		System.out.println("study  ");
	}

	@Override
	public void studyEnglish() {
		System.out.println("studyEnglish  ");
	}

	@Override
	protected void move() {
		super.move();
	}
}
