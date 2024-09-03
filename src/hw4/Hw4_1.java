package hw4;

import java.util.Arrays;

public class Hw4_1 {
	// • 有個一維陣列如下:
	// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	// (提示:陣列,length屬性)
	public static void main(String[] args) {

		int[] ar = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(ar);
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		int avg = sum / ar.length;
		System.out.println("此陣列平均值為:" + avg);
		System.out.println("大於平均值的元素有:");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > avg) {
				System.out.print(ar[i] + " ");
			}
		}
	}

	// • 請建立一個字串,經過程式執行後,輸入結果是反過來的
	// 例如String s = “Hello World”,執行結果即為dlroW olleH
	// (提示:String方法,陣列)
//	public static void main(String[] args) {
//		String s = "Hello World";
//		int i = s.length() - 1;
//		for (int c = i; c >= 0; c--) {
//			System.out.print(s.charAt(c));
//		}
//
//	}

	// • 有個字串陣列如下 (八大行星):
	// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”,
	// “neptune”}
	// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	// (提示:字元比對,String方法)

//	public static void main(String[] args) {
//		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		int a = 0;
//		int e = 0;
//		int i = 0;
//		int o = 0;
//		int u = 0;
//		for (int w = 0; w < planet.length; w++) {
//			for (int n = 0; n < planet[w].length(); n++) {
//				char c = planet[w].charAt(n);
//				switch (c) {
//				case 'a':
//					a += 1;
//					break;
//				case 'e':
//					e += 1;
//					break;
//				case 'i':
//					i += 1;
//					break;
//				case 'o':
//					o += 1;
//					break;
//				case 'u':
//					u += 1;
//					break;
//
//				}
//			}
//		}
//		int sum = a + e + i + o + u;
//		System.out.println("總共有" + sum + "個母音。");
//		System.out.println("a有" + a + "個;e有" + e + "個;i有" + i + "個;o有" + o + "個;u有" + u + "個。");
//	}
}