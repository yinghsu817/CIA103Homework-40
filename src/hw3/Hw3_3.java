package hw3;

import java.util.Scanner;

//• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
//請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:(提示:Scanner)
//(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

public class Hw3_3 {
	public static void main(String[] args) {
		Scanner mode = new Scanner(System.in);

		int hate;
		do {
			System.out.println("阿文，請輸入你這次討厭的數字為(0-9):");
			hate = mode.nextInt();
			if (hate < 0 || hate > 9) {
				System.out.println("輸入錯誤，請輸入0-9之間的整數；");
			}
		} while (hate < 0 || hate > 9);

		int num;
		int sum = 0;
		for (num = 1; num <= 49; num++) {
			if (num / 10 != hate && num % 10 != hate) {
				System.out.print(num + " ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("總共有" + sum + "個數字可以選擇。");
	}
}
