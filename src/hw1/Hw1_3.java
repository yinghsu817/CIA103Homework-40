package hw1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class Hw1_3 {
	public static void main(String[] args) {
		int totalSecs = 256559;
		int min = 60;
		int hour = min * 60;
		int day = hour * 24;

		int day1 = totalSecs / day;
		int hour1 = totalSecs % day / hour;
		int min1 = totalSecs % day % hour / min;
		int sec1 = totalSecs % day % hour % min;

		System.out.println(totalSecs + "秒為" + day1 + "天" + hour1 + "小時" + min1 + "分" + sec1 + "秒。");

	}

}
