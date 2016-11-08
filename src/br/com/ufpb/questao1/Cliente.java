package br.com.ufpb.questao1;

public class Cliente {

	protected AlgoritmosSort strategy;
	private int[] vetor;
	
	public Cliente(AlgoritmosSort estrategy, int[] vetor){
		this.strategy = estrategy;
		this.vetor = vetor;
	}
	
	public void ordenar(){
		this.strategy.metodosSort(this.vetor);
	}
	
	public void setSort(AlgoritmosSort estrategy){
		this.strategy = estrategy;
	}

	public void setVetor(int[] vetores){
		this.vetor = vetores;
	}
	public void exibir(){
		for(int x: this.vetor){
			System.out.println(x);
		}
	}
}
