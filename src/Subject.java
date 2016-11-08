

public interface Subject {

	public void subscribe(Observer dos);
	public void unsubscribe(Observer obs);
	public void notifyObservers();
	public Object getData();
}
