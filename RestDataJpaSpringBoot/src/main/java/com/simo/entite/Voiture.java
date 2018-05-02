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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fenetere == null) ? 0 : fenetere.hashCode());
		result = prime * result + ((porte == null) ? 0 : porte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		if (fenetere == null) {
			if (other.fenetere != null)
				return false;
		} else if (!fenetere.equals(other.fenetere))
			return false;
		if (porte == null) {
			if (other.porte != null)
				return false;
		} else if (!porte.equals(other.porte))
			return false;
		return true;
	}
	
	
	

}
