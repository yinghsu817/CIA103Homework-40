package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator test = new Calculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值:");
		test.setX(sc.nextInt());
		System.out.println("請輸入y的值:");
		test.setY(sc.nextInt());

		try {
			System.out.println(test.getX()+"的"+test.getY()+"次方等於"+test.powerXY(test.getX(), test.getY()));
		} catch (CalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
