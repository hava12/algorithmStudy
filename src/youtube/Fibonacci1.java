package youtube;

import common.TimeChecker;

public class Fibonacci1 {

	// 피보나치 수열을 출력해라
	// An = An-1 + An-2
	// 1 1 2 3 5 8 13 21 34

	public static void main(String[] args) {
		TimeChecker checker = new TimeChecker();
		checker.start();
		// long[] arr = new long[100];
		//
		// arr[1] = 1;
		// arr[2] = 2;
		//
		// for (int i=3; i<100; i++) {
		// 	arr[i] = arr[i-1] + arr[i-2];
		// }
		//
		// for(int i=3; i<100; i++) {
		// 	System.out.print(arr[i] + " ");
		// }

		// StringBuffer buffer = new StringBuffer();
		int previousNum1 = 1;
		int previousNum2 = 1;
		int curnum = 1;
		for(int i=0; i<100; i++) {
			if(i > 1) {
				curnum = previousNum1 + previousNum2;
				previousNum2 = previousNum1;
				previousNum1 = curnum;
			}
			System.out.print(curnum + " ");
			// buffer.append( curnum + " ");
		}
		// System.out.println(buffer.toString());

		checker.end();
	}
}
