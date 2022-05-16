package youtube;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		int num1 = 19332;
		int num2 = 78696;

		int big;
		int small;

		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			small = num1;
			big = num2;
		}

		// for문을 이용해서 풀기
		int gcf = 1;

		for (int i=1 ; i < small ; i++) {
			if (big % i == 0 && small % i == 0) {
				gcf = i;
			}
		}
		System.out.println("gcf = " + gcf);

		int smallTemp = 0;

		// 유클리드 호제법을 이용해서도 풀어보자
		while (big%small != 0) {
			smallTemp = big%small;
			big = small;
			small = smallTemp;
		}
		System.out.println("gcf = " + small);

	}
}
