package reflect;

import java.lang.reflect.Method;

public class ReflectCase {
	public static void main(String[] args) throws Exception {
		Proxy target = new Proxy();
		Method method = Proxy.class.getDeclaredMethod("run");
		method.invoke(target);
		Method method1 = Proxy.class.getDeclaredMethod("call");
		method1.invoke(target);
	}

	static class Proxy {
		public void run() {
			System.out.println("±º≈‹∞… family");
		}

		public void call() {
			System.out.println("¥ÚµÁª∞");
		}
	}
}
