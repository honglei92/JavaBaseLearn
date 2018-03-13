package jvm;

/**
 * @author Administrator 手写四种单例模式
 */
public class Singleton {
	private Singleton() {
	}

	// 方法一 懒汉 线程不安全
	private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	// 方法二 volatile synochronized 关键字,懒汉 线程安全
	// private static volatile Singleton instance = null;
	//
	// public static Singleton getInstance() {
	// synchronized (Singleton.class) {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }
	// }
	//

}
