package br.com.ufpb.revista;

public interface Observer {

	public void update(String cliente, boolean status, String revista);
}
