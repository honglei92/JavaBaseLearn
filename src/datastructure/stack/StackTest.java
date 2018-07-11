package stack;

import java.util.Stack;

/**
 * @author Administrator stack ≤‚ ‘
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> mStack = new Stack<>();
		for (int i = 0; i < 10; i++) {
			mStack.add(i + "");
		}
		for (int i = 0; i < 10; i++) {
			mStack.remove(9 - i);
			String result = "";
			for (int j = 0; j < mStack.size(); j++) {
				result += mStack.get(j) + ",";
			}
			System.out.println(result);
		}
	}
}
