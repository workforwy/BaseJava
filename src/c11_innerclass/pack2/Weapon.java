package c11_innerclass.pack2;

public interface Weapon {

	int TPYE_COLD=1;
	int TPYE_HEAT=2;
	int TPYE_NUCLEAR=3;

	//抽象方法,子类必须实现
	public abstract void kill();
	
	public abstract String getName();
	
	public abstract int getType();	
	
}
