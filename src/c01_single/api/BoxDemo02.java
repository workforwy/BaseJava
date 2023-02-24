package c01_single.api;

class MyInteger {
    static class IntegerCache {
        private static Integer[]
                cache = new Integer[256];

        static {
            for (int i = 0; i < 256; i++) {
                cache[i] = i - 128;
            }
        }
    }

    public Integer valueOf(int n) {
        //先从池中取
        for (int i = 0; i < IntegerCache.cache.length; i++) {
            if (IntegerCache.cache[i] == n) {
                return IntegerCache.cache[i];
            }
        }
        //池中没有则自己new
        return new Integer(n);
    }
}

class Box02 {
    Integer t1 = 100;//自动封箱
    Integer t2 = 100;
    Integer t3 = 200;//自动封箱
    Integer t4 = 200;
}

public class BoxDemo02 {
    public static void main(String[] args) {
        Box02 b02 = new Box02();
        System.out.println(
                b02.t1 == b02.t2);//true(数据是从池中取)
        System.out.println(
                b02.t3 == b02.t4);//false(数据是重新构建的对象)

        /*
         * 说明integer类默认在类加载时会
         * 构建一个整数池(存储的数据为
         * -128~+127)
         *
         */


    }
}

