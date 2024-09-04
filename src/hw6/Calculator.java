package hw6;
//• 請設計三個類別Calculator.java,CalException.java與CalTest.java,

//在Calculator.java裡有個自訂方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。
//CalTest.java執行後,使用者可以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//1. x與y同時為0,(產生自訂的CalException例外物件)
//2. y為負值,而導致x的y次方結果不為整數
//3. x與y皆正確情況下,會顯示運算後結果

public class Calculator {
	private int x;
	private int y;

	public static int powerXY(int x, int y) throws CalException {
		int power = 1;
		if (y < 0) {
			throw new CalException("次方為負值,結果回傳不為整數!");
		} else if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else {
			for (int i = 0; i < y; i++) {
				power *= x;
			}
			return power;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;

	}

	public void setY(int y) {
		this.y = y;

	}

}
