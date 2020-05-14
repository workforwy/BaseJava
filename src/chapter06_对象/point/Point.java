package chapter06_����.point;

public class Point {
	int x;// ��Ա����
	int y;

	public Point(int x, int y) {
		this.x = x;// �ֲ�����
		this.y = y;
	}

	public String toString() {// ��Ա����
		return "(" + x + "," + y + ")";
	}

	public double distance() {// ��Ա����
		return Math.sqrt(x * x + y * y);
	}

	// ��ǰ�����һ����ľ���:��ǰ��x-p���x
	public double distance(Point p) {// ��Ա����
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}
