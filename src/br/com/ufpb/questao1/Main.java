package br.com.ufpb.questao1;
import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		int[] vetores = new int[10000];
		for(int x = 0; x < vetores.length; x++){
			vetores[x] = random.nextInt(10000);
		}
		System.out.println("Bubble Sort" + "\n");
		s.nextLine();
		Cliente pessoa = new Cliente(new BubbleSort(), vetores);
		long tempoInicial = System.currentTimeMillis();
		pessoa.ordenar();
		long tempoFinal = System.currentTimeMillis();
		pessoa.exibir();
		System.out.println("Tempo de execução do Bubble Sort: " + (tempoFinal - tempoInicial)+ " ms");
		
		s.nextLine();
		System.out.println("Insertion Sort" + "\n");
		s.nextLine();
		int[] vetores2 = vetores.clone();
		pessoa.setVetor(vetores2);
		long tempoInicial2 = System.currentTimeMillis();
		pessoa.setSort(new InsertionSort());
		pessoa.ordenar();
		long tempoFinal2 = System.currentTimeMillis();
		pessoa.exibir();
		System.out.println("Tempo de execução do Insertion Sort: " + (tempoFinal2 - tempoInicial2) + " ms");
		s.nextLine();
		
		System.out.println("Quick Sort" + "\n");
		s.nextLine();
		pessoa.setVetor(vetores2);
		long tempoInicial3 = System.currentTimeMillis();
		pessoa.setSort(new QuickSort());
		pessoa.ordenar();
		long tempoFinal3 = System.currentTimeMillis();
		pessoa.exibir();
		System.out.println("Tempo de execução do Quick Sort: " + (tempoFinal3 - tempoInicial3) + " ms" );
		s.nextLine();
		
		System.out.println("Merge Sort");
		s.nextLine();
		pessoa.setVetor(vetores2);
		long tempoInicial4 = System.currentTimeMillis();
		pessoa.setSort(new MergeSort());
		pessoa.ordenar();
		long tempoFinal4 = System.currentTimeMillis();
		pessoa.exibir();
		System.out.println("Tempo de execução do Merge Sort: " + (tempoFinal4 - tempoInicial4) + " ms" );
		
		
		s.close();
	}
}
