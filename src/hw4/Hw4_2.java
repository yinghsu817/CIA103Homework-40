package hw4;

import java.util.Scanner;

//• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
//(提示:Scanner,二維陣列)
public class Hw4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文:你想借多少錢?");
		int money = sc.nextInt();
		System.out.println("有錢可借的員工編號:");

		int[][] dad = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int sum = 0;
		for (int i = 0; i <= dad.length - 1; i++) {
			if (dad[i][1] >= money) {
				sum += 1;
				System.out.print(dad[i][0] + " ");
			}

		}
		System.out.println("共有" + sum + "個人可以借錢。");
	}
}
