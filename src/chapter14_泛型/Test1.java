package chapter14_·ºÐÍ;

public class Test1 {
	public static void main(String[] args) {
		Holder<String> h1 = new Holder<String>();
		Holder<Double> h2 = new Holder<Double>();
		h1.setValue("abc");
		h2.setValue(2.0);
		String s = h1.getValue();
		double d = h2.getValue();
		System.out.println(s);
		System.out.println(d);
	}
}
