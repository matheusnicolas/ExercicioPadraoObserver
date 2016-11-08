package br.com.ufpb.questao1;

public class BubbleSort implements AlgoritmosSort{

	
	public void metodosSort(int[] vetor) {
		int aux = 0; 
		boolean testar = true;
		while(testar){
			testar = false;
			for(int i = 0; i < vetor.length - 1; i++){
				if(vetor[i] > vetor[i + 1]){
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
					testar = true;
					
				}
			}
		}
		
		}

			
	}


