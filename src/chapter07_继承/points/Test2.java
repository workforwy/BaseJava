package chapter07_extend.points;

public class Test2 {
	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point3D(4, 5, 6);
		f(a);
		f(b);
	}

	private static void f(Point p) {
		System.out.println(p.toString());
		System.out.println(p.distance());
	}
}
