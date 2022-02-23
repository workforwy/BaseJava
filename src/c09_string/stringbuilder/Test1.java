package c09_string.stringbuilder;

public class Test1 {
	public static void main(String[] args) {
		String s0 = "abc";
		StringBuilder sb = new StringBuilder();
		
		long t = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			sb.append(s0);
		}
		t = System.currentTimeMillis() - t;
		
		System.out.println(t);
		System.out.println(sb);
	}
}
