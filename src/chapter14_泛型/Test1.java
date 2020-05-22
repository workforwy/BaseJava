package chapter14_泛型;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
//		Holder<String> h1 = new Holder<String>();
//		Holder<Double> h2 = new Holder<Double>();
//		h1.setValue("abc");
//		h2.setValue(2.0);
//		String s = h1.getValue();
//		double d = h2.getValue();
//		System.out.println(s);
//		System.out.println(d);
//
//		List arrayList = new ArrayList();
//		arrayList.add("aaaa");
//		arrayList.add(100);
//
//		for(int i = 0; i< arrayList.size();i++){
//			String item = (String)arrayList.get(i);
//		System.out.println(item);
//		}

		List<String> stringArrayList = new ArrayList<String>();
		List<Integer> integerArrayList = new ArrayList<Integer>();

		Class classStringArrayList = stringArrayList.getClass();
		Class classIntegerArrayList = integerArrayList.getClass();

		if(classStringArrayList.equals(classIntegerArrayList)){
			System.out.println("泛型测试类型相同");
		}
	}
}
