package model;

import java.util.ArrayList;

public class equipatge {

	private int idEquipatge;
	private String pes;
	private ArrayList<client> client;
	private String origen;
	private String desti;
	
	
	public equipatge(int idEquipatge, String pes, ArrayList<model.client> client, String origen, String desti) {
		this.idEquipatge = idEquipatge;
		this.pes = pes;
		this.client = new ArrayList<client>();
		this.origen = origen;
		this.desti = desti;
	}


	public int getIdEquipatge() {
		return idEquipatge;
	}


	public void setIdEquipatge(int idEquipatge) {
		this.idEquipatge = idEquipatge;
	}


	public String getPes() {
		return pes;
	}


	public void setPes(String pes) {
		this.pes = pes;
	}


	public ArrayList<client> getClient() {
		return client;
	}


	public void setClient(ArrayList<client> client) {
		this.client = client;
	}

	public void afegirClient(client client) {
		
		this.client.add(client);
		
	}
	
	public void eliminarClient(client client) {
		
		this.client.remove(client);
		
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


	@Override
	public String toString() {
		return "equipatge [idEquipatge=" + idEquipatge + ", pes=" + pes + ", origen=" + origen
				+ ", desti=" + desti + "]";
	}
	
}
