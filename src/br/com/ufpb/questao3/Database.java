package br.com.ufpb.questao3;
import java.util.LinkedList;
import java.util.List;

public class Database implements Subject{

	private List<Observer> totens;
	private List<Flight> allFlights;
	
	
	public Database(){
		this.totens = new LinkedList<Observer>();
		this.allFlights = new LinkedList<Flight>();
	}
	
	public void addObserver(Observer o){
		if(!totens.contains(o)){
			this.totens.add(o);
		}
	}
	
	public void addFlight(Flight f){
		if(!allFlights.contains(f)){
			this.allFlights.add(f);
			this.notifyObservers();
		}
	}
	
	public void removeFlight(Flight f){
		this.allFlights.remove(f);
		this.notifyObservers();
	}
	
	public void removeObserver(Observer o){
		this.totens.remove(o);
		
		
	}
	
	public void notifyObservers(){
		for(Observer obs: this.totens){
			obs.update();
		}
	}
	
	public List<Flight> getData(){
		return this.allFlights;
	}
}
