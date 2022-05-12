package youtube;

import common.TimeChecker;
import java.util.Scanner;

public class Mode1 {

	// 가장 많이 출현한 수를 출력하시오.
	// 1 2 2 3 1 4 2 2 4 3 5 3 2

	public static void main(String[] args) {
		TimeChecker checker = new TimeChecker();
		checker.start();

		Scanner scan = new Scanner("1 2 2 3 1 4 2 2 4 3 5 3 2");

		int[] inputNum = new int[10];
		while(scan.hasNextInt()) {
			int num = scan.nextInt();
			inputNum[num]++;
		}

		int cnt = 0;
		int mode = 0;

		for (int i = 0; i<10; i++) {
			if (cnt < inputNum[i]) {
				mode = i;
				cnt = inputNum[i];
			}
		}
		System.out.println(mode + " ("+cnt+"회)");
		checker.end();
	}
}
