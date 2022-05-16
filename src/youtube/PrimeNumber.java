package youtube;

public class PrimeNumber {

	public static boolean isPrime1(int num) {
		for(int i = 2; i < num; i++) {
			if(num%i == 0 ) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime2(int num) {
		for(int i = 2; i < num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime3(int num) {
		// 약수들의 곱을 봤을 때 루트를 씌운 값이 중간값이 된다.
		for(int i=2; i*i <= num; i++) {
			if(num % i ==0) return false;
		}
		return true;
	}

	public static boolean isPrime4(int num) {
		// 약수들의 곱을 봤을 때 루트를 씌운 값이 중간값이 된다.
		for(int i=2; i <= Math.sqrt(num); i++) {
			if(num % i ==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrime1(100));
		System.out.println(isPrime2(101));
		System.out.println(isPrime3(13));
		System.out.println(isPrime4(100));
	}
}
