package br.com.ufpb.questao3;
import java.util.List;

public interface Subject {
	
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public List <Flight> getData();
	

}
