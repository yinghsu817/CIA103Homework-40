package hw4;

import java.util.Scanner;

//• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

public class Hw4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, date;
		System.out.println("請輸入西元年:");
		year = sc.nextInt();

		do {
			System.out.println("請輸入月份:");
			month = sc.nextInt();
			System.out.println("請輸入日期:");
			date = sc.nextInt();

			if (month == 2 && date > 29) {
				System.out.println("2月份日期不得超過29，請重新輸入:");
			}
		} while (month == 2 && date > 29);

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31 };
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			days[1] = 29;
		}
		int dayOfYear = 0;
		for (int i = 0; i < month - 1; i++) {
			dayOfYear += days[i];
		}

		dayOfYear += date;
		System.out.println(year + "年" + month + "月" + date + "日為該年第" + dayOfYear + "天。");
	}
}
