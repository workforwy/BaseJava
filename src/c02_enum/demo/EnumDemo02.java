package c02_enum.demo;

enum TimeUnit{
    /**实例(对象),此实例在类加载时创建*/
    HOUR,MINUTES("分钟"),SECONDS;
    /**构造方法:默认访问修饰符为private,
     * 此构造方法在枚举实例构建时自动调用*/
    TimeUnit(){
        System.out.println("TimeUnit()");
    }
    private String name;
    TimeUnit(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
public class EnumDemo02 {
    public static void main(String[] args) {
        TimeUnit tu=
                TimeUnit.MINUTES;
        System.out.println(tu.getName());

    }
}

