package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 
//(請利用多型簡化本題的程式設計)

public class Hw7_5 {
	public static void main(String[] args) {

		try {
			File file = new File("C:/data/Object.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {
				try {
					((Pets) ois.readObject()).speak();

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					break;
				}
			}
			ois.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
