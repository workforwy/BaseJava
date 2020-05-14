package chapter11_包装类与内部类.pack2;

public class Test2 {

    public static void main(String[] args) {
        Weapon w1 = f1();
        w1.kill();
        Weapon w2 = f2("大刀");
        w2.kill();
    }

    static Weapon f1() {
        class AK47 implements Weapon {
            @Override
            public void kill() {
                System.out.println("获取热武器AK47");
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getType() {
                return Weapon.TPYE_HEAT;
            }
        }
        Weapon a = new AK47();
        return a;
    }

    static Weapon f2(final String name) {
        Weapon w = new Weapon() {
            public void kill() {
                System.out.println("ʹ获取" + name + "武器");
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getType() {
                return Weapon.TPYE_COLD;
            }
        };
        return w;
    }
}
