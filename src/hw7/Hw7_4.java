package hw7;
//• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。

//注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Hw7_4 {
	public static void main(String[] args) {
		Dog d1 = new Dog("Emy");
		Dog d2 = new Dog("Coco");
		Cat c1 = new Cat("Hana");
		Cat c2 = new Cat("Cooper");

		File data = new File("C:/data");
		if (!data.exists()) {
			System.out.println(data.mkdir());
		}

		try {
			FileOutputStream fos = new FileOutputStream("C:/data/Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);
			oos.writeObject(d2);
			oos.writeObject(c1);
			oos.writeObject(c2);

			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
