package br.com.ufpb.questao3;


public class Date {
	
	private String day;
	private String month;
	private String hour;
	
	public Date(String day, String month, String hour){
		this.day = day;
		this.month = month;
		this.hour = hour;
	}
	
	public Date(){
		this("0", "0", "0");
	}

	public String getDate() {
		return this.day;
	}

	public void setDate(String day) {
		this.day = day;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public String toString(){
		return this.day + "/" + this.month + "\n" + "Hora:" + "[" + this.hour + "]";
	}
}
