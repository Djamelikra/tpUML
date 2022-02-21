/**
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
*/

package model;

import helpers.HelperMsgDialog;

public class Jardin {
	
	 protected String surface;
	    
	  public Jardin() 
	  {
	    surface = "50 ";
	  }
	    
	  public Jardin(String surface) 
	  {
	    this.surface = surface;
	  }
	    
	  public String getSurface()
	  {
	    return surface;
	  }
	    
	  public void setSurface(String value)
	  {
	    surface = value;
	  }
	  
	  public void display() 
	  {
		  String msg = "Je suis un jardin, ma surface est de "+ surface +" m2 et j'ai une piscine olympique ☺ .";
		    System.out.println(msg);
		    HelperMsgDialog.chooseMsgDialog(msg);
	   
	    
	  }
	}


