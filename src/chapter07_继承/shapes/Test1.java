package chapter07_�̳�.shapes;

public class Test1 {
	public static void main(String[] args) {
		Shape s;
		// s=new shape();
		s = new Line();
		s.draw();
		((Line) s).length();
		s.clean();
		s = new Square();
		s.draw();
		s.clean();
		s = new Circle();
		s.draw();
		s.clean();
	}

	private static void f(Shape s) {
		s.draw();
		// ����ת�ͺ�ֻ�ܵ��ø��ඨ���ͳһ��Ա
		// s.length(),�ж�����������ת���ǰ�ȫ��ת��
		if (s instanceof Line) {
			// Line line = (Line)s;
			// line.length();
			((Line) s).length();
		}
		s.clean();
	}
}
