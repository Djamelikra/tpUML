/**
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
*/

package model;

import helpers.HelperMsgDialog;

public class Personne {

	protected String name;
	protected Maison maison;

	public Personne() {

		name = "Toto";
		maison = new Maison(150);
	}

	public Personne(String name, Maison logis) {

		this.name = name;
		this.maison = logis;
	}
	public String getName() {

		return name;
	}

	public void setName(String value) {

		name = value;
	}
	
	  public Maison getMaison()
	  {
	    return maison; 
	  }
	  
	  public void setMAison(Maison logis)
	  {
		  maison = logis; 
	  }
	  
	  public void display() 
	  {
		  
		  String msg = "Je m'appele "+ name +".☺☺☺☺☺☺☺☺☺☺☺";
		    System.out.println(msg);
		    HelperMsgDialog.chooseMsgDialog(msg);
		 
	    maison.display();
	    maison.jardin.display();
	  }

}
