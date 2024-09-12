package hw7;
//• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 
//(請使用append功能讓每次執行結果都能被保存起來)

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Hw7_2 {
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("src/hw7/Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			int count = 0;
			while (count < 10) {
				int r = (int) (Math.random() * 1000) + 1;
				count++;
				pw.print(r + " ");
			}
			pw.println();

			System.out.println("檔案建立完成");

			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
