package br.com.ufpb.revista;

public class Pessoa implements Observer, Tela {

	private String cliente;
	private boolean status;
	private String revista;
	private Subject editora;
	
	public Pessoa(Editora edicao){
		this.editora = edicao;
		edicao.registerObserver(this);
	}
	
	public void update(String cliente, boolean status, String revista){
		this.cliente = cliente;
		this.status = status;
		this.revista = revista;
		display();
	}
	
	public String condicao(){
		if(this.status == true){
			return"Cliente cadastrado, esse m�s tem novidades :D";
		}else{
			return "Cliente n�o cadastrado, esse m�s n�o tem novidades :(";
		}
	}
	public void display(){
		System.out.println("Cliente : " + this.cliente + "\n" + "Status: " + this.condicao() + "\n" +"Revista: " + this.revista);
	}
}
