package hw7;
//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
	public static void main(String[] args) {
		int line = 0;
		int charCount = 0;
		String i;
		
		try {
			File file = new File("src/hw7/Sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			while ((i = br.readLine()) != null) {
				line++;
				charCount += i.length();
			}

			System.out.println(file.getName() + "檔案共有" + file.length() + "個位元組," + charCount + "個字元," + line + "列資料。");
			
			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
