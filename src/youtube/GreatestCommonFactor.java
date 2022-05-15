package youtube;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;

		int big;
		int small;

		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			small = num1;
			big = num2;
		}
		int gcf = 1;

		for (int i=1 ; i < small ; i++) {
			if (big % i == 0 && small % i == 0) {
				gcf = i;
			}
		}
		System.out.println("gcf = " + gcf);
		
		// 유클리드 호제법을 이용해서도 풀어보자
	}
}
