package br.com.ufpb.questao3;

public class Flight {

	private int number;
	private String company;
	private Date time;
	private boolean departing;
	
	public Flight(int number, String company, Date time, boolean departing){
		this.number = number;
		this.company = company;
		this.time = time;
		this.departing = departing;
	}
	
	public Flight(){
		this(0, "Without company", null, true);
	}
	
	public String isDeporting(){
		if(this.departing == true){
			return "Voo de embarque!";
		}else{
			return "Voo de desembarque!";
		}
	}
	
	public String toString(){
		return "Código do voo: " + this.getNumber() + "\n" + "Companhia: " + this.getCompany() 
		+ "\n" + "Data: " + this.getTime() + "\n" + "Status: " + this.isDeporting();
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public String getCompany(){
		return this.company;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public Date getTime(){
		return this.time;
	}
	
	public void setTime(Date time){
		this.time = time;
	}
	
	public boolean getDeparting(){
		return this.departing;
	}
	
	public void setDeparting(boolean departing){
		this.departing = departing;
	}
	
	
}
