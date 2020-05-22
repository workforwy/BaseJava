package chapter21_reflect.pack2;

import chapter21_reflect.pack1.Activity;

public class MainActivity extends Activity {
	public void onCreate() {
		System.out.println("MainActivity.onCreate");
	}

	public void doClick(View view) {
		System.out.println("MainActivity.doClick");
	}
}
