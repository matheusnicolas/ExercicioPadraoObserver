package br.com.ufpb.revista;

public class Main {
	
	public static void main(String[] args){
		
		Editora editora = new Editora();
		
		Pessoa pessoa = new Pessoa(editora);
		
		editora.setEdicaoDoMes("Manoel de ID: 1049", true, "A volta dos que n�o foram, Brasil pega fogo!");
		editora.setEdicaoDoMes("Manoel de ID: 1049", false, "Trollando ao vivo");
		editora.setEdicaoDoMes("Jo�o", true, "TI, a �rea que mais inova mundialmente");
	}
}
