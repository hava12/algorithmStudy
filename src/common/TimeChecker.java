package common;

public class TimeChecker {

	long startTimeMillis = 0;
	long endTimeMillis = 0;

	public void start() {
		startTimeMillis = System.currentTimeMillis();
	}

	public void end() {
		endTimeMillis = System.currentTimeMillis();

		System.out.println("total time : " + (endTimeMillis - startTimeMillis) + "ms");
	}


}
