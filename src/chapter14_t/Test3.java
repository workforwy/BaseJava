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

		g(h1);// ֻ�ܴ������֣����ܴ����ַ���
		g(h2);

	}

	/*
	 * ĳ���ض������ͣ�������number��������
	 */
	private static void g(Holder<? extends Number> h) {
		Number n = h.getValue();
		System.out.println(n);
		// ���ܷ�������
		// ֻ��nullֵ���Է���
//		h.setValue(null);
	}

	/*
	 * <?>��ʾĳ���ض�������
	 */
	private static void f(Holder<?> h) {
		Object a = h.getValue();
		System.out.println(a);
		// ���ܷ�������
		// ֻ��nullֵ���Է���
		h.setValue(null);
	}
}
