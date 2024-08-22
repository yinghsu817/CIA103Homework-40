package hw1;
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class Hw1_4 {
	public static void main(String[] args) {
		int r = 5;
		final double PI = 3.1415;

		double a = r * r * PI;// 圓面積
		double p = r * 2 * PI;// 圓周長

//		System.out.println("圓面積為"+a);
//		System.out.println("圓周長為"+p);
		System.out.printf("圓面積為%.2f%n", a);
		System.out.printf("圓周長為%.2f%n", p);

	}

}
