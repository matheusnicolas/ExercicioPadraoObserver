package br.com.ufpb.questao3;


public class Main {

	public static void main(String[] args){
		
		Database database = new Database();
		Date date = new Date("10","11","22:30");
		Date date2 = new Date("10", "11", "23:00");
		Date date3 = new Date("11", "11", "01:00");
		Date date4 = new Date("11", "11", "04:00");
		Flight flight = new Flight(695, "TAM", date, true);
		Flight flight2 = new Flight(885, "Airlines", date2, false);
		Flight flight3 = new Flight(975, "Breba Airlines", date3, true);
		Flight flight4 = new Flight(662, "Falcon Airlines", date4, false);
		database.addFlight(flight);
		database.addFlight(flight2);
		database.addFlight(flight3);
		database.addFlight(flight4);
		System.out.println(flight.toString() + "\n");
		System.out.println(flight2.toString() + "\n");
		System.out.println(flight3.toString() + "\n");
		System.out.println(flight4.toString() + "\n");
		
		
		
	}
}
