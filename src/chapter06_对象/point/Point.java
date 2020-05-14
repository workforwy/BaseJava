package chapter06_对象.point;

public class Point {
	int x;// 成员变量
	int y;

	public Point(int x, int y) {
		this.x = x;// 局部变量
		this.y = y;
	}

	public String toString() {// 成员方法
		return "(" + x + "," + y + ")";
	}

	public double distance() {// 成员方法
		return Math.sqrt(x * x + y * y);
	}

	// 求当前点距另一个点的距离:当前点x-p点的x
	public double distance(Point p) {// 成员方法
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}
