import java.util.ArrayList;
import java.util.List;

public class Editora implements Subject {

	private List<Observer> observers;
	private String revista;
	
	public Editora(){
		observers = new ArrayList <Observer>();
	}
	
	public void subscribe(Observer obs) {
		if(!observers.contains(obs)){
			observers.add(obs);
		}
	}

	
	
	public void unsubscribe(Observer obs) {
		observers.remove(obs);
		
	}

	
	public void notifyObservers() {
		for(Observer obs: this.observers){
			obs.update();
		}
	}

	
	public Object getData() {
		
		return revista;
	}
	
}
