package com.simo.entite;

public class Voiture {
	private String porte;
	private String fenetere;

	public String getFenetere() {
		return fenetere;
	}

	public void setFenetere(String fenetere) {
		this.fenetere = fenetere;
	}

	public String getPorte() {
		return porte;
	}

	public Voiture(String porte, String fenetere) {
		super();
		this.porte = porte;
		this.fenetere = fenetere;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	@Override
	public String toString() {
		return "Voiture [porte=" + porte + ", fenetere=" + fenetere + "]";
	}
	
	

}
