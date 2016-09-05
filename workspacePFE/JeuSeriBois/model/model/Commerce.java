package model;

public class Commerce {

	private String nomB;
	private String nomP;
	private int id;
	private String date;
	private String dure;
	private double price;
	private String nomI;
	private String vendu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomD(String nomP) {
		this.nomP = nomP;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.nomB = date;
	}
	public String getDure() {
		return dure;
	}
	public void setDure(String dure) {
		this.dure = dure;
	}
	public String getNomB() {
		return nomB;
	}
	public void setNomB(String nomB) {
		this.nomB = nomB;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		this.price = p;
	}
	public String getVendu() {
		return vendu;
	}
	public void setVendu(String v) {
		this.vendu = v;
	}
	public Commerce(String nomB, String nomP, String date, String dure, double price, int id, String nomI, String vendu) {
		super();
		this.price = price;
		this.date = date;
		this.dure = dure;
		this.nomB = nomB;
		this.nomP = nomP;
		this.id = id;
		this.nomI = nomI;
		this.vendu = vendu;
	}

	public Commerce(){
		super();
		
	}
		
	
	
}
