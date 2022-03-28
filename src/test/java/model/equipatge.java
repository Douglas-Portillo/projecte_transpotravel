package model;

public class equipatge {

	private int idEquipatge;
	private int pes;
	private client refClient;
	private String origen;
	private String desti;
	
	
/**/public equipatge(int idEquipatge, int pes, client refClient, String origen, String desti) {
		this.idEquipatge = idEquipatge;
		this.pes = pes;
/**/	this.refClient = refClient;
		this.origen = origen;
		this.desti = desti;
	}


	public int getIdEquipatge() {
		return idEquipatge;
	}


	public void setIdEquipatge(int idEquipatge) {
		this.idEquipatge = idEquipatge;
	}


	public int getPes() {
		return pes;
	}

	
	public void setPes(int pes) {
		this.pes = pes;
	}


	public client getRefClient() {
		return refClient;
	}


	public void setRefClient(client refClient) {
		this.refClient = refClient;
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
