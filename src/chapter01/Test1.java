package chapter01;

public class Test1 {
	public static void main(String[] args) {
		int i = 6;
		int j = 9;
		while (i-- > 3) {
			--j;
		}
		System.out.println(j);
	}
}