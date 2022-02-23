package c06_object.object;

public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		System.out.println(a.toString());
		System.out.println(b.toString());

		System.out.println(a.equals(b));
		System.out.println(a.equals(a));

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		// == 比较的是内存地址
		System.out.println(a == b);
		if (a instanceof Object) {
			System.out.println("a 属于 object");
		}
	}
}
