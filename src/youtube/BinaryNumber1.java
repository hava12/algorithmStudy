package youtube;

import common.TimeChecker;
import java.util.Stack;

public class BinaryNumber1 {

	public static void main(String[] args) {

		TimeChecker timeChecker = new TimeChecker();
		timeChecker.start();

		int inputNum = 123512421;
		int d = 2;
		Stack<Integer> st = new Stack<>();
		// StringBuffer result = new StringBuffer();

		while (true) {
			st.push(inputNum%d);
			// result.insert(0, inputNum % d);
			if (inputNum/d == 0) {
				break;
			}
			inputNum /= d;
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
		System.out.println("\n");

		// System.out.println("result.toString() = " + result.toString());
		timeChecker.end();
	}
}
