package chapter06_object.soldier;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * 新建存放Soldier 对象的数组 在数组的每一个位置，放一个新创建的士兵对象 一次次从遍历这几个士兵，调用他们的进攻方法，
		 * 直到所有士兵阵亡为止
		 */
		System.out.println("打一仗可以牺牲的士兵数量是：");
		int n = new Scanner(System.in).nextInt();
		Soldier[] a = new Soldier[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Soldier();
			a[i].id = 1 + i;
		}
		while (Soldier.count > 0) {
			for (int i = 0; i < a.length; i++) {
				a[i].attcak();
			}
		}
	}
}
