package c02_enum.relation;

interface IA {
    void run();
}

abstract class AbsA {
    abstract void run();
}

class A {
    public void execute(IA a) {
        a.run();
    }

    public void execute(AbsA a) {
        a.run();
    }
}

class IAImpl implements IA {
    @Override
    public void run() {
        System.out.println("IA.run()");
    }
}

public class CallbackDemo01 {

    public static void main(String[] args) {
        //1.构建A的对象
        A a = new A();
        //2.调用A的execute方法
		/*a.execute(new IA(){
			@Override
			public void run() {
				System.out.println("IA.run()");
			}
		});*/
        a.execute(new IAImpl());
		/*a.execute(new AbsA(){
			@Override
			void run() {
				System.out.println("AbsA.run()");
			}
		});*/

        class CA extends AbsA {
            @Override
            void run() {
                // TODO Auto-generated method stub

            }
        }
        a.execute(new CA());
    }
}

