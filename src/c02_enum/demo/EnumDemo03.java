package c02_enum.demo;

enum Week{
    SUNDAY{
        @Override
        String getName() {
            // TODO Auto-generated method stub
            return "星期日";
        }
    },MONDAY{
        @Override
        String getName() {
            return "星期一";
        }
    };
    abstract String getName();

/*	class Inner01{}
	abstract class Inner02{}
	interface IA{}*/

}
public class EnumDemo03 {
    public static void main(String[] args) {
        //获得枚举中的所有实例
        Week w[]=Week.values();

        for(int i=0;i<w.length;i++){
            System.out.println(w[i].getName());
        }
        //字符串转换为枚举类型
        //方法1
        String s="SUNDAY";
        Week w01=Week.valueOf(s);
        System.out.println(w01);
        //方法2
        Week w02=
                Enum.valueOf(Week.class, s);
        System.out.println(w02);

        //枚举类型在switch语句中的应用
        switch (w02) {
            case MONDAY:
                System.out.println("星期一");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
        }
    }
}

