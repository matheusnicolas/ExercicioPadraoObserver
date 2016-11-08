package br.com.ufpb.questao1;

public class InsertionSort implements AlgoritmosSort{

	public void metodosSort(int[] vetor) {
		for(int i = 1; i < vetor.length; i++){
			int temp = vetor[i];
			int j;
			for(j = i - 1; j >= 0 && temp < vetor[j]; j--){
				vetor[j + 1] = vetor[j];
			vetor[j + 1] = temp;
			}
		}
	
	}
	
}
