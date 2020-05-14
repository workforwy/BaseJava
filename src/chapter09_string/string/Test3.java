package chapter09_string.string;

public class Test3 {
	public static void main(String[] args) {
		String s = "   abc   abc     abc     ";
		System.out.println(s);
		System.out.println("1.3位置的字符:" + s.charAt(3));
		System.out.println("2.变大写：" + s.toUpperCase());
		System.out.println("3.长度:" + s.length());
		System.out.println("4.与xyz比大小:" + s.compareTo("   x,y,z  "));
		System.out.println("5.是否以abc开头:" + s.startsWith("abc"));
		System.out.println("6.是否以abc结尾:" + s.endsWith("abc"));
		System.out.println("7.第一个bc的起始位置:" + s.indexOf("bc"));
		System.out.println("8.3位置向后找bc:" + s.indexOf("bc", 3));
		System.out.println("9.从后向前找bc:" + s.lastIndexOf("bc"));
		System.out.println("10.找不存在的子串:" + s.indexOf("xxx"));
		System.out.println("11.将a替换成-:" + s.replace('a', '-'));
		System.out.println("12.截取6到末尾的位置:" + s.substring(6));
		System.out.println("13.截取6到10的位置:" + s.substring(6, 10));
		System.out.println("14.去除两端空白字符：" + s.trim());
	}
}
