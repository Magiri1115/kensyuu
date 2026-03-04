package com.example;
import java.util.Random;

public class Cleric {
	//名前、HP、最大HP、MP、最大MP
	String name;
	int hp = 50;
	final int hp_max = 50;
	int mp = 10;
	final int mp_max = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.hp_max;
		System.out.println("HPが最大まで回復した！");
	}
	
	public int pray(int sec) {
		int recover = new Random().nextInt(3) + sec;
	    int recoverActual = Math.min(this.mp_max - this.mp, recover);
	    this.mp += recoverActual;
	    System.out.println(this.name +"は" + sec + "秒間天に祈った！");
	    System.out.println("MPが" + recoverActual + "回復した！");
	    
	    return recoverActual;
	}
	
	public static void main(String[] args) {}
}