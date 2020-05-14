package chapter06_����.object;

public class Point {
	private int x;
	private int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();// Ĭ�ϱ�����
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
	public boolean equals(Object obj) {
		// ʵ�ִ������obj�������������
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof Point)) {
			return false;
		} else {
			// ��ǰ�����x��y�Ͳ��������x��y�Ƿ����
			Point p = (Point) obj;
			return this.x == p.x && this.y == p.y;
		}
	}
}
