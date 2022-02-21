/**
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
*/

package model;

import helpers.HelperMsgDialog;

public class Appartement extends Maison {
	
	  public Appartement()
	  {
	    super(50);
	  }
	    
	  public void display()
	  {
		  String msg = "Je suis un appartement, ma surface est " + surface + " m2";
		    System.out.println(msg);
		    HelperMsgDialog.chooseMsgDialog(msg);
	 
	    
	    
	  }
	}



