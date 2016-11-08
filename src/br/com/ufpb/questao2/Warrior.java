package br.com.ufpb.questao2;

public class Warrior {

	private String nome;
	private int life;
	protected WeaponStrategy weapon;
	protected ArmourStrategy armour;
	
	public Warrior(String nome, int life, WeaponStrategy weapon, ArmourStrategy armour){
		this.nome = nome;
		this.life = life;
		this.weapon = weapon;
		this.armour = armour;
	}
	
	public Warrior(){
		this("", 0, null, null);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void atacar(Warrior w2){
		w2.setLife(w2.getLife() + w2.getArmour().resist() - this.weapon.attack());
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void getLife(int life){
		this.life = life;
	}
	
	public void setLife(int life){
		this.life = life;
	}
	
	public int getLife(){
		return this.life;
	}
	
	public void setWeaponStrategy(WeaponStrategy weapon){
		this.weapon = weapon;
	}
	
	public WeaponStrategy getWeapon(){
		return this.weapon;
	}
	
	public ArmourStrategy getArmour(){
		return this.armour;
	}
	
	public void setArmourStrategy(ArmourStrategy armour){
		this.armour = armour;
	}
	
	
}
