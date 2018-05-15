package thread.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SampleTest {
	private static Vector<Integer> lis1 = new Vector<Integer>();
	private static List<Integer> list = new ArrayList<Integer>();

	static class AddThread implements Runnable {
		int startNum = 0;

		public AddThread(int i) {
			startNum = i;
		}

		@Override
		public void run() {
			int count = 0;
			try {
				while (count < 1000) {
					list.add(startNum);
					startNum += 2;
					count++;
					// System.out.println(startNum);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// System.out.println("startNum:" + startNum);
				System.out.println("count:" + count);
				System.out.println("listSize:" + list.size());
			}
		}
	}

	public static void main(String[] args) {
		Thread addThread = new Thread(new AddThread(0));
		Thread addThread1 = new Thread(new AddThread(0));
		addThread.start();
		addThread1.start();
	}
}
