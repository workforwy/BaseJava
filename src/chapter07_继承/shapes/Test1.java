package chapter07_继承.shapes;

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
		// 向上转型后，只能调用父类定义的统一成员
		// s.length(),判断类型再向下转型是安全的转型
		if (s instanceof Line) {
			// Line line = (Line)s;
			// line.length();
			((Line) s).length();
		}
		s.clean();
	}
}
