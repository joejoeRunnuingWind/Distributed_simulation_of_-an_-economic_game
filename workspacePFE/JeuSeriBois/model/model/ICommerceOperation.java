package model;

import java.util.Vector;

public interface ICommerceOperation {


	public void ajouterCommerce(Commerce c);
	public Vector<Commerce> getVecCommerce();	
	public void supprimerCommerce();
}
