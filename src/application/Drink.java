package application;

class DrinkInfo{
	private String name;
	private int money=0;
	private int zaiko=0;
	
	public DrinkInfo(String name, int money, int zaiko) {
		super();
		this.name = name;
		this.money = money;
		this.zaiko = zaiko;
	}
//drink�̖��O���擾����֐�
	public String getName() {
		return name;
	}
//drink�̖��O���X�V����֐�
	public void setName(String name) {
		this.name = name;
	}
	//drink�̉��i���擾����֐�
	public int getMoney() {
		return money;
	}
	//drink�̉��i���X�V����֐�
	public void setMoney(int money) {
		this.money = money;
	}
	//drink�̍݌ɂ��擾����֐�
	public int getZaiko() {
		return zaiko;
	}
	//drink�̍݌ɂ��X�V����֐�
	public void setZaiko(int zaiko) {
		this.zaiko = zaiko;
	}
}