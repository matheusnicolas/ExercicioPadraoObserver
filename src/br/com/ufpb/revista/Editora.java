package br.com.ufpb.revista;
import java.util.ArrayList;

public class Editora implements Subject{

	private ArrayList observers;
	private String cliente;
	private boolean status;
	private String revista;
	
	public Editora(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int x = observers.indexOf(o);
		if(x >= 0){
			observers.remove(x);
		}
	}
	
	public void notifyObserver(){
		for(int x = 0; x < observers.size(); x++){
			Observer observer = (Observer)observers.get(x);
			observer.update(cliente, status, revista);
		}
	}
	
	public void atualizaRevista(){
		notifyObserver();
	}
	
	public void setEdicaoDoMes(String cliente, boolean status, String revista){
		this.cliente = cliente;
		this.status = status;
		this.revista = revista;
		atualizaRevista();
	}
	
}
