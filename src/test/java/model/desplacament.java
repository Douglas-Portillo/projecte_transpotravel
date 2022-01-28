package model;

import java.util.ArrayList;

public class desplacament {

	private int idDesplacament;
	private ArrayList<puntRecollida> puntRecollida;
	private ArrayList<persona> persona;
	private String origen;
	private String desti;
	private int preuFinal;
	
	public desplacament(int idDesplacament, ArrayList<model.puntRecollida> puntRecollida,
			ArrayList<model.persona> persona, String origen, String desti, int preuFinal) {
		this.idDesplacament = idDesplacament;
		this.puntRecollida = new ArrayList<puntRecollida>();
		this.persona = new ArrayList<persona>();
		this.origen = origen;
		this.desti = desti;
		this.preuFinal = preuFinal;
	}

	public int getIdDesplacament() {
		return idDesplacament;
	}

	public void setIdDesplacament(int idDesplacament) {
		this.idDesplacament = idDesplacament;
	}

	public ArrayList<puntRecollida> getPuntRecollida() {
		return puntRecollida;
	}

	public void setPuntRecollida(ArrayList<puntRecollida> puntRecollida) {
		this.puntRecollida = puntRecollida;
	}
	
	
	public void afegirPuntRecollida(puntRecollida puntDeRecollida) {
		
		this.puntRecollida.add(puntDeRecollida);
		
	}
	
	public void eliminarPuntRecollida(puntRecollida puntDeRecollida) {
		
		this.puntRecollida.remove(puntDeRecollida);
		
	}
	

	public ArrayList<persona> getPersona() {
		return persona;
	}

	public void setPersona(ArrayList<persona> persona) {
		this.persona = persona;
	}
	
	
	public void afegirPersona(persona persona) {
		
		this.persona.add(persona);
		
	}
	
	public void eliminarPersona(persona persona) {
		
		this.persona.remove(persona);
		
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDesti() {
		return desti;
	}

	public void setDesti(String desti) {
		this.desti = desti;
	}

	public int getPreuFinal() {
		return preuFinal;
	}

	public void setPreuFinal(int preuFinal) {
		this.preuFinal = preuFinal;
	}

	@Override
	public String toString() {
		return "desplacament [idDesplacament=" + idDesplacament + ", origen=" + origen + ", desti=" + desti + ", preuFinal=" + preuFinal
				+ ", getIdDesplacament()=" + getIdDesplacament() + ", getPuntRecollida()=" + getPuntRecollida()
				+ ", getPersona()=" + getPersona() + ", getOrigen()=" + getOrigen() + ", getDesti()=" + getDesti()
				+ ", getPreuFinal()=" + getPreuFinal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
