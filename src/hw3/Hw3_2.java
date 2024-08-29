package hw3;

import java.util.Scanner;

//• 請設計一隻程式,會亂數產生一個0~9的數字,
//然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//(提示:Scanner,亂數方法,無窮迴圈 break;)
//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

public class Hw3_2 {
	public static void main(String[] args) {
		int ans = (int) (Math.random() * 9);
		System.out.println(ans);
		System.out.println("=== === ===");

		Scanner num = new Scanner(System.in);
		System.out.println("開始猜數字吧!請從0-9中輸入一個數字:");
		int g = -1;

		while (g != ans) {
			if (num.hasNextInt()) {
				g = num.nextInt();
				if (g < 0 || g > 9) {
					System.out.println("請檢查範圍並重新輸入:");
				} else if (g != ans) {
					System.out.println("猜錯囉!");
				} else {
					System.out.println("答對了!答案就是:" + ans);
					break;

				}
			}
			// if(num.hasNextDouble()) {}

		}
	}
}
