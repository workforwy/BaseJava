package c07_extend.transformer;

public class Transformer {
	private Weapon w;// ���ν��ʹ�������ӿ� �ڱ��ν�����һ��������Ա����

	public void setWeapon(Weapon w) {
		this.w = w;
	}

	/**
	 * w.kill;0 �������ӿڷ��͵������� ���ָ���ɽ���ľ�������ִ��
	 */
	public void attack() {
		if (w == null) {
			System.out.println("����ҧ");
			return;
		}
		String type = "";
		switch (w.getType()) {
		case Weapon.TPYE_COLD:
			type = "�����";
			break;
		case Weapon.TPYE_HEAT:
			type = "�ȱ���";
			break;
		case Weapon.TPYE_NUCLEAR:
			type = "������";
			break;
		}
		System.out.println("ʹ��" + type + "" + w.getName() + "����");
	}
}
