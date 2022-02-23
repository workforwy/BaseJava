package c07_extend.shapes;

public abstract class Shape {
	/*
	 * 抽象方法 只有方法的定义，没有方法代码块 为子类提供通用方法的定义
	 */
	public abstract void draw();

	/*
	 * 没有完成的方法 为子类提供通用代码
	 */
	public void clean() {
		System.out.println("\n\n\n\n");
	}
}
