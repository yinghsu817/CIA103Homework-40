package hw3;

import java.util.Scanner;

//• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷)

public class Hw3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數,第一個數字:");
		int n1 = sc.nextInt();
		System.out.println("第二個數字:");
		int n2 = sc.nextInt();
		System.out.println("第三個數字:");
		int n3 = sc.nextInt();

		if (n1 + n2 <= n3 || n1 + n3 <= n2 || n2 + n3 <= n1) {
			System.out.println("不是三角形");
		} else if (n1 == n2 && n2 == n3 && n1 > 0) {
			System.out.println("正三角形");
		} else if (n1 == n2 || n2 == n3 || n1 == n3) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");

		}
	}

}
