package model;

import java.util.ArrayList;

public class seguiment {

	private int idSeguiment;
	private ArrayList<desplacament> desplacament = new ArrayList<desplacament>();
	private ArrayList<equipatge> equipatge = new ArrayList<equipatge>();
	private String estat;
	
	public seguiment(int idSeguiment, ArrayList<model.desplacament> desplacament, ArrayList<model.equipatge> equipatge,
			String estat) {
		this.idSeguiment = idSeguiment;
		this.desplacament = new ArrayList<desplacament>();
		this.equipatge = new ArrayList<equipatge>();
		this.estat = estat;
	}

	public int getIdSeguiment() {
		return idSeguiment;
	}

	public void setIdSeguiment(int idSeguiment) {
		this.idSeguiment = idSeguiment;
	}

	public ArrayList<desplacament> getDesplacament() {
		return desplacament;
	}

	public void setDesplacament(ArrayList<desplacament> desplacament) {
		this.desplacament = desplacament;
	}

	public void afegirDesplacament (desplacament desplacament) {
		
		this.desplacament.add(desplacament);
		
	}
	
	public void eliminarDesplacament(desplacament desplacament) {
		
		this.desplacament.remove(desplacament);
		
	}
		
	public ArrayList<equipatge> getEquipatge() {
		return equipatge;
	}

	public void setEquipatge(ArrayList<equipatge> equipatge) {
		this.equipatge = equipatge;
	}

	
	public void afegirEquipatge(equipatge equipatge) {
		
		this.equipatge.add(equipatge);
		
	}
	
	public void eliminarEquipatge(equipatge equipatge) {
		
		this.equipatge.remove(equipatge);
		
	}
	
	public String getEstat() {
		return estat;
	}

	public void setEstat(String estat) {
		this.estat = estat;
	}

	@Override
	public String toString() {
		return "seguiment [idSeguiment=" + idSeguiment + ", Estat=" + estat + "]";
	}
	
}
