package br.com.ufpb.questao2;

public class Alabarda implements WeaponStrategy {

	private static final int DANO = 30;
	
	public int attack(){
		return DANO;
	}
}
