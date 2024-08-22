package hw1;
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class Hw1_2 {
	public static void main(String[] args) {

		int allE = 200, perDozen = 12;
		int dozens = allE / perDozen;
		int others = allE % perDozen;

		System.out.println("總共是" + dozens + "打" + others + "顆蛋");

	}

}
