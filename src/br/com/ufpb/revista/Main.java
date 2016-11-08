package br.com.ufpb.revista;

public class Main {
	
	public static void main(String[] args){
		
		Editora editora = new Editora();
		
		Pessoa pessoa = new Pessoa(editora);
		
		editora.setEdicaoDoMes("Manoel de ID: 1049", true, "A volta dos que não foram, Brasil pega fogo!");
		editora.setEdicaoDoMes("Manoel de ID: 1049", false, "Trollando ao vivo");
		editora.setEdicaoDoMes("João", true, "TI, a área que mais inova mundialmente");
	}
}
