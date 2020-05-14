package chapter06_∂‘œÛ.point;

public class Test {
	public static void main(String[] args) {
		Point i=new Point(0, 0);
		Point a=new Point(2, 4);
		Point b=new Point(1, 7);
		Point p=new Point(3, 9);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(p.toString());
		System.out.println(a.distance(i));
		System.out.println(a.distance());
		System.out.println(b.distance(i));
		System.out.println(p.distance(a));
	}
}