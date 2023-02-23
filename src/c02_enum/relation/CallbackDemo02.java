package c02_enum.relation;

abstract class Context {
    abstract void call();
}

class View {
    View(Context context) {
        context.call();
    }
}

public class CallbackDemo02 {
    public static void main(String[] args) {
        //构建view对象
        View v = new View(new Context() {
            @Override
            void call() {
                System.out.println("call()");
            }
        });
    }
}

