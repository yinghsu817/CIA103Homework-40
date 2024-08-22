package hw2;
//• 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100

public class Hw2_4 {
	public static void main(String[] args) {
		int i = 1;
		int d;
		do {
			d = i * i;
			System.out.print(d + " ");
			i++;
		} while (i <= 10);
	}
}
