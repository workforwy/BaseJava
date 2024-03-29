package c08_list.treemap;

public class Point implements Comparable<Point> {
	private int x;
	private int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public int compareTo(Point o) {
		// 当前对象与参数对象o比较大小
		// 当前对象大，返回正数
		// 当前对象小，返回负数
		// 大小相同，返回0
		return x - o.x;
	}
}
