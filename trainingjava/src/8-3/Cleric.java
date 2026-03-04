public class Cleric {
	//名前、HP、最大HP、MP、最大MP
	String name;
	int hp = 50;
	final int hp_max = 50;
	int mp = 10;
	final int mp_max = 10;
	
	public void selfAid() {
		System.out.println(this.name +"セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.hp_max;
		
	}
}