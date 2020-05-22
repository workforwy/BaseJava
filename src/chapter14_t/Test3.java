package chapter14_t;

public class Test3 {
	public static void main(String[] args) {
		Holder<Integer> h1 = new Holder<Integer>();
		Holder<Double> h2 = new Holder<Double>();
		Holder<String> h3 = new Holder<String>();

		h1.setValue(123);
		h2.setValue(3.0);
		h3.setValue("abc");

//		f(h1);
//		f(h2);
//		f(h3);

		g(h1);// 只能传入数字，不能传入字符串
		g(h2);

	}

	/*
	 * 某种特定的类型，并且是number的子类型
	 */
	private static void g(Holder<? extends Number> h) {
		Number n = h.getValue();
		System.out.println(n);
		// 不能放入数据
		// 只有null值可以放入
//		h.setValue(null);
	}

	/*
	 * <?>表示某种特定的类型
	 */
	private static void f(Holder<?> h) {
		Object a = h.getValue();
		System.out.println(a);
		// 不能放入数据
		// 只有null值可以放入
		h.setValue(null);
	}
}
