
package tarena.day1302;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("言论自由：");
		String s = new Scanner(System.in).nextLine();
		String regex = "你大爷|你二大爷|你三大爷|你四大爷";
		// 获得这个方法新中新创建的字符串赋给s
		s = s.replaceAll(regex, "*");
		System.out.println(s);
	}
}
