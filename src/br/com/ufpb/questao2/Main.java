
package br.com.ufpb.questao2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int cont = 0;
		Warrior warrior = new Warrior("Warlock", 100, new Alabarda(), new Titanio());
		Warrior warrior2 = new Warrior("Domador de Dragão", 100, new Alabarda(), new Couro());
		
		System.out.println(warrior.getNome()+ "\n" + " LIFE: " + warrior.getLife());
		s.nextLine();
		System.out.println(warrior2.getNome()+ "\n" + " LIFE: " + warrior2.getLife());
		s.nextLine();
		boolean morreu = false;
		while(!morreu){
			
			warrior.atacar(warrior2);
			System.out.println(warrior.getNome() + " atacou o " + warrior2.getNome());
			
			
			s.nextLine();
			
			System.out.println("Life do " + warrior2.getNome() + ": " + warrior2.getLife());
			s.nextLine();
			
			if(warrior2.getLife() <= 0){
				morreu = true;
				break;
			}
			
			warrior2.atacar(warrior);
			System.out.println(warrior2.getNome() + " atacou o " + warrior.getNome());
			
			s.nextLine();
			

			System.out.println("Life do " + warrior.getNome() + ": " + warrior.getLife());
			
			
			if(warrior.getLife() <= 0){
				morreu = true;
				break;
			}
			cont ++;
			System.out.println("Rodada " + cont + ". Pressione enter para a seguinte rodada...");
			s.nextLine();
			}
		
		if(warrior.getLife() <= 0){
			System.out.println(warrior2.getNome() + ", *Wins*");
		}else if(warrior2.getLife() <= 0){
			System.out.println(warrior.getNome() + ", *Wins*");
		}
		
		System.out.println("A partida durou " + cont + " rodadas.");
		s.close();
	}
	
	
	
}
