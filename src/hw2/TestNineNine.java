package hw2;
//請建立一個TestNineNine.java程式,可輸出九九乘法表

//• 一:使用for迴圈 + while迴圈
//public class TestNineNine {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;// 宣告放在哪決定它可生效之範圍
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//		}
//	}
//}

//• 二:使用for迴圈 + do while迴圈

//public class TestNineNine {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//		}
//	}
//}

//• 三:使用while迴圈 + do while迴圈

public class TestNineNine {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}
}
