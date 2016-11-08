package br.com.ufpb.estacaoMeteorologica;

public interface Observer {

	public void update(float temp, float humidity, float pressure);
}
