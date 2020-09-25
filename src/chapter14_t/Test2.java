package chapter14_t;

import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		// raw type 是原始类型，即object 类型
		Holder<Object> h = new Holder<Object>();

		h.setValue("abc");
		System.out.println(h.getValue());

		h.setValue(3.0);
		System.out.println(h.getValue());

		h.setValue(new Date());
		System.out.println(h);

		Date v = (Date) h.getValue();
		System.out.println(v);
	}
}
