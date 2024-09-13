package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//• 請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、
//“Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
public class Hw8_1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		System.out.println("===使用for迴圈===");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);

		}
		System.out.println("===使用foreach===");
		for (Object sth : list)
			System.out.println(sth);

		System.out.println("===使用Iterator===");
		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			Object o = objs.next();
			if (o instanceof Number) {
				System.out.println(o);
			} else {
				objs.remove();
			}

		}

	}

}
