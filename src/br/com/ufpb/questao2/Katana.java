package br.com.ufpb.questao2;

public class Katana implements WeaponStrategy {

	private static final int DANO = 25;
	
	public int attack(){
		return DANO;
	}
}
