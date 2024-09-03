package hw5;
//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:

//本次亂數結果:
//平均值:

public class Hw5_2 {
	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {

		System.out.println("本次亂數結果:");
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 101);
			System.out.print (r + " ");
			sum += r;

		}
		int avg= sum /10;
		System.out.println("\n"+"平均值:"+ avg);
		
	}
}
