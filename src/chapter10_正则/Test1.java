package tarena.day1302;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����̶��绰���룺");
		String s=new Scanner(System.in).nextLine();
		/*
		 * 12345678
		 * 1234567
		 *  ��010��12345678
		 *  ��0101��1234567
		 * 010-12345678
		 * 0101-12345678
		 *
		 *(\\d{3,4}-|\\d{3,4}\\))? \\d{7,8}
		 * 
		 */
		String r ="(\\d{3,4}-|\\( \\d{3,4} \\) )? \\d{7,8}";
		if(s.matches(r)){// �жϵ�ǰ�ַ������ܷ���������ʽƥ��
			System.out.println("��ʽ��ȷ");
		}
		else{
			System.out.println("��ʽ����");
		}
	}
}
