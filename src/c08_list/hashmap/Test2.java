package c08_list.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
	
		System.out.println("输入字符串：");
		String s = new Scanner(System.in).nextLine();
		/*
		 * 1.新建HashMap<character,integer>赋给map 2.循环i从0位置打牌《s.length
		 * 3.从s提取i位置字符赋给c 4.从map取出字符c对应的计数值赋给count 5.如果count==null
		 * 6.将字符c和计数值1放入map 7.否则 8.将字符c和计数值count+1放入map 9.打印map
		 */
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer count = map.get(c);
			if (count == null) {
				map.put(c, 1);
			} else {
				map.put(c, count + 1);
			}
		}
		System.out.println(map);
	}
}
                                               