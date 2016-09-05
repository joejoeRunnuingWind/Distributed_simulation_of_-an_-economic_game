package model;

import java.util.Vector;

public class CommerceOperation implements ICommerceOperation {

	
	private Vector<Commerce> vecCommerce = new Vector<Commerce>();
	
	public void ajouterCommerce(Commerce c){
		vecCommerce.add(c);
	}
	
	public Vector<Commerce> getVecCommerce(){
		return vecCommerce;
	}
	
	public void supprimerCommerce(){
		vecCommerce.clear();
	}
	public CommerceOperation(){
		super();
	}
	
	public CommerceOperation(Vector<Commerce> vecCommerce){
		super();
		this.vecCommerce = vecCommerce;
		
	}
}
