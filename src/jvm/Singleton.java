package jvm;

/**
 * @author Administrator 手写四种单例模式/其实有七种模式的单例模式写法
 */
public class Singleton {
	//构造方法私有化
	private Singleton() {
	}

	// 方法一 懒汉 线程不安全[不可用]
	/*private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/

	// 方法二 volatile synochronized 关键字,懒汉 线程安全
	/*private static volatile Singleton instance = null;

	public static Singleton getInstance() {
		synchronized (Singleton.class) {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}*/
	
	//方法三  饿汉式   静态常量
	/*private final static Singleton INSTANCE=new Singleton();
	public static Singleton getInstance(){
		return INSTANCE;
	}*/
	
	//方法四  饿汉式 静态代码块
	/*private static Singleton instance;
	static{
		instance=new Singleton();
	}
	public Singleton getInstance(){
		return instance;
	}*/
	
	//方法五 懒汉式  线程安全  同步方法[不推荐用]
	/*private static Singleton singleton;
	public synchronized  Singleton getInstance(){
		if (singleton==null) {
			singleton= new Singleton();
		}
		return singleton;
	}*/
	//方法六  懒汉式 (线程安全 同步代码块) 不可用
	/*private static Singleton singleton;
	public static Singleton getInstance(){
		if (singleton==null) {
			synchronized (Singleton.class) {
				singleton=new Singleton();
			}
		}
		return singleton;
	}*/
	
	//方法七   双重检查 推荐用
	/*private static volatile Singleton singleton;
	public static Singleton getInstance(){
		if(singleton==null){
			synchronized (Singleton.class) {
				if (singleton==null) {
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}*/
	
	//方法八  静态内部类  推荐用
	/*private static class SingletonInstance{
		private static final Singleton INSTANCE=new Singleton();
	}
	public static Singleton getInstance(){
		return SingletonInstance.INSTANCE;
	}*/
	//方法九 枚举 推荐用
	public enum SingletonEnum{
		INSTANCE;
		public void whateverMethod(){
			
		}
	}
	
}
