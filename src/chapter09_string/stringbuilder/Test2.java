package chapter09_string.stringbuilder;

public class Test2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");

		sb.append("def")// abcdef
				.append("ghi")// abcdefghi
				.insert(2, "123")// abc123defghi
				.insert(0, "456")// 456abc123defghi
				.replace(3, 6, "jklmnop")// 456jklmnopq
				.delete(5, 8)// 456jklmnopq23cdefghi
				.deleteCharAt(0)// 56jkopq23cdefghi
				.reverse()// ihgfedc32qpokj65
				.setCharAt(5, '@');// ihgfe@c32qpokj65

		System.out.println(sb.toString());

	}
}
