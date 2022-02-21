/**
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
*/

package model;

import helpers.HelperMsgDialog;

public class Maison {
	
	 protected int surface;
	  protected Jardin jardin;
	    
	  public Maison(int surface) 
	  {
	    this.surface = surface;
	    jardin = new Jardin();
	  }
	    
	  public int getSurface()
	  {
	    return surface;
	  }
	    
	  public void setSurface(int value)
	  {
	    surface = value;
	  }
	  
	  public Jardin getJardin()
	  {
	    return jardin; 
	  }
	    
	  public void setJardin(Jardin d)
	  {
	    jardin = d;
	  }
	    
	  public void display() 
	  {
		String msg = "Je suis une maison, ma surface est de "+ surface +" m2.";
	    System.out.println(msg);
	    HelperMsgDialog.chooseMsgDialog(msg);
	  }
	}
	


