package c07_extend.shapes;

public abstract class Shape {
	/*
	 * ���󷽷� ֻ�з����Ķ��壬û�з�������� Ϊ�����ṩͨ�÷����Ķ���
	 */
	public abstract void draw();

	/*
	 * û����ɵķ��� Ϊ�����ṩͨ�ô���
	 */
	public void clean() {
		System.out.println("\n\n\n\n");
	}
}
