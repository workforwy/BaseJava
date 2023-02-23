package c02_enum.varparams;

public class VarparamsDemo01 {
    //void sum(int a,int b){}
    //void sum(int a,int b,int c){}
    /**可变参数的应用(jdk1.5)
     * 主要引用于重载方法中参数类型相同，
     * 参数个数不同的情况
     * */
    static void sum(int... params){
        //if(params!=null){
        System.out.println(params.length);
        //}
        int sum=0;
        for(int i=0;i<params.length;i++){
            sum+=params[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum();
        sum(1);
        sum(2,3);
        sum(4,5,6,7);
    }
}

