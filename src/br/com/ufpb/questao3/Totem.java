package br.com.ufpb.questao3;
import java.util.List;
import java.util.LinkedList;
public class Totem implements Observer {

	private Subject subject;
	private List<Flight> myFlight;
	
	public Totem(){
		this.myFlight = new LinkedList<Flight>();
	}
	
	public List<Flight> getMyFlight() {
		return this.myFlight;
	}

	public String toString(){
		String mostrar = "VOOS A SEGUIR";
		mostrar += this.myFlight.size() + "\n";
		for(int x = 0; x<this.myFlight.size(); x++){
			mostrar += this.myFlight.size() + "\n";
		}
	return mostrar;
	}
	
	public void setMyFlight(List<Flight> myFlight) {
		this.myFlight = myFlight;
	}


	public void update(){
		this.myFlight = subject.getData();
	}
	
	public void setSubject(Subject subject){
		this.subject = subject;
	}
	
	public Subject getSubject(){
		return this.subject;
	}

	
}
