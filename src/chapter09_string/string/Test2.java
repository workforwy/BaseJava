package string;

public class Test2 {
	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "g";
		long t = getCurrent();
		for (int i = 0; i < 1000; i++) {
			s1 += s2;
		}
		t = getCurrent() - t;
		System.out.println(s1);
		System.out.println(t);
	}

	/**
	 * ���ϵͳ��ǰʱ������ֵ ����ֵ��1970-1-1 0�㿪ʼ�ĺ���ֵ
	 */
	static long getCurrent() {
		return System.currentTimeMillis();
	}
}
