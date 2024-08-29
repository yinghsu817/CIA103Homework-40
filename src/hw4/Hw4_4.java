package hw4;

import java.util.Arrays;

//• 班上有8位同學,他們進行了6次考試結果如下:

//請算出每位同學考最高分的次數
//(提示:二維陣列)

public class Hw4_4 {
	public static void main(String[] args) {
		int[][] score = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] counts = new int[score[0].length];

		int i = 0, j = 0;
		for (i = 0; i < score.length; i++) {
			int high = 0;
			for (j = 0; j < score[i].length; j++) {
				if (score[i][j] > high) {
					high = score[i][j];
				}
			}
			for (j = 0; j < score[i].length; j++) {
				if (score[i][j] == high) {
					counts[j]++;
				}
			}
		}
		for (i = 0; i < counts.length; i++) {
			System.out.println("學生" + (i + 1) + "號得到最高分的次數是" + counts[i] + "次。");
		}

	}
}
