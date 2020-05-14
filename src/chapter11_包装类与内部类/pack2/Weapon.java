package chapter11_包装类.pack2;

public interface Weapon {
	//public static final ����ʡ��
	int TPYE_COLD=1;
	int TPYE_HEAT=2;
	int TPYE_NUCLEAR=3;

	//public abstract ����ʡ��
	public abstract void kill();
	
	public abstract String getName();
	
	public abstract int getType();	
	
}
