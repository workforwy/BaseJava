package c03_for.pack1;

public class Buy {
    public static void main(String[] args) {
        /*
         * 1.循环g从0到<=20递增 2.求买g只公鸡剩余的钱赋给money 3.求money 最多可以买多少母鸡赋给max
         * 4.循环m从0到<=max递增 5.再剩余的钱最多买多少小鸡赋给x 6.如果g+m+x=100 7.打印这个组合
         */
        int a = 0;
        System.out.println("公鸡5元1只\n母鸡3元1只\n小鸡1元3只\n一百元买一百只的组合：");
        for (int g = 0; g <= 20; g++) {
            int money = 100 - 5 * g;
            int max = money / 3;
            for (int m = 0; m <= max; m++) {
                int x = (money - 3 * m) * 3;
                if (g + m + x == 100) {
                    System.out.println("公鸡:" + g + "母鸡:" + m + "小鸡:" + x);
//                    break;
                }
                a++;
            }
        }
        System.out.println(a);
    }
}
