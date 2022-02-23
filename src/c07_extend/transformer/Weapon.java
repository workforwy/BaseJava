package c07_extend.transformer;

public interface Weapon {
	//public static final 可以省略
	int TPYE_COLD=1;
	int TPYE_HEAT=2;
	int TPYE_NUCLEAR=3;

	//public abstract 可以省略
	public abstract void kill();
	
	public abstract String getName();
	
	public abstract int getType();	
	
}
