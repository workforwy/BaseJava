package c07_extend.transformer;

public class Transformer {
	private Weapon w;// 变形金刚使用武器接口 在变形金刚里放一个武器成员变量

	public void setWeapon(Weapon w) {
		this.w = w;
	}

	/**
	 * w.kill;0 像武器接口发送调用命令 这个指令由介入的具体武器执行
	 */
	public void attack() {
		if (w == null) {
			System.out.println("用牙咬");
			return;
		}
		String type = "";
		switch (w.getType()) {
		case Weapon.TPYE_COLD:
			type = "冷兵器";
			break;
		case Weapon.TPYE_HEAT:
			type = "热兵器";
			break;
		case Weapon.TPYE_NUCLEAR:
			type = "核武器";
			break;
		}
		System.out.println("使用" + type + "" + w.getName() + "进攻");
	}
}
