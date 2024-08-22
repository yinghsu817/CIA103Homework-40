package hw1;
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本

//金加利息共有多少錢 (用複利計算,公式請自行google)
//複利公式FV ＝ PV×（1 ＋ R）n 次方
//期末本利和＝期初本金×（1＋利率）期數次方

public class Hw1_5 {
	public static void main(String[] args) {
		int pv = 1_500_000;// 本金
		double r = 0.02;// 利率2%
		double total = pv * (1 + r);// 本金+利息

		for (int y = 1; y < 10; y++) {
			total *= (1 + r);
		} // ?

		System.out.println("十年後本金加利息共有" + (int) total + "元");

	}

}
