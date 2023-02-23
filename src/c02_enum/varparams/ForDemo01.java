package c02_enum.varparams;

import java.util.Arrays;

public class ForDemo01 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

		/*for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}*/

        System.out.println(Arrays.toString(a));
        //增强for(android中使用的性能不高)
        for (int m : a) {
            System.out.println(m);
        }
    }
}

