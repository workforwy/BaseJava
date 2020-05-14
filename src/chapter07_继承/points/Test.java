package chapter07_ผฬณะ.points;

public class Test {
	public static void main(String[] args) {
		Point a = new Point(3, 3);
		Point3D b = new Point3D(4, 5, 6);
		System.out.println(a.toString());
		System.out.println(a.distance());
		System.out.println(b.toString());
		System.out.println(b.distance());
	}
}
