package helpers;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
*
*
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
* Afficher la date au format local
*/
public class HelpDate {

	/**
	* Affiche la date et l'heure
	*/
//	public Date anyDate = new Date();
	private Date myDate ;
	
	public HelpDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date getMyDate() {
		return myDate;
	}

	public void setMyDate(Date newDate) {
		this.myDate = newDate;
	}



//	public String showUsualDate2() {
//	    SimpleDateFormat dateFormatComp;
//	    dateFormatComp = new SimpleDateFormat("dd MMM yyyy hh:mm:ss");
//		return dateFormatComp.format(anyDate);
//	}
	
	public String showUsualDateTime() {
	    SimpleDateFormat dateFormatComp;
	    dateFormatComp = new SimpleDateFormat("EEEE dd MMMM yyyy k:mm:ss");
	    this.setMyDate(new Date());
	    return dateFormatComp.format(this.getMyDate());
	}
	public void printUsualDate() {
	    SimpleDateFormat dateFormatComp;
	    dateFormatComp = new SimpleDateFormat("dd MMM yyyy hh:mm:ss");
	    this.setMyDate(new Date());
	    System.out.println(dateFormatComp.format(this.getMyDate()));
	}
	
	/**
	* Renvoie la date avec le jour en lettres
	*/
	
	public String fetchUsualDate() {
		Date aDate = new Date() ;
	    SimpleDateFormat dateFormatComp;
	    dateFormatComp = new SimpleDateFormat("dd MM yyyy");
	    return dateFormatComp.format(aDate).toString();
	}
	/**
	* Renvoie la date avec le jour en lettres
	*/
	public String showExtendDate() {
		this.setMyDate(new Date()); ;
	    SimpleDateFormat dateFormatComp;
	    dateFormatComp = new SimpleDateFormat("EEEE dd MMMM yyyy");
	    return dateFormatComp.format(this.getMyDate()).toString();
	}
	public String fetchExtendDate() {
		Date aDate = new Date() ;
	    SimpleDateFormat dateFormatComp;
	    dateFormatComp = new SimpleDateFormat("EEEE dd MMMM yyyy");
	    return dateFormatComp.format(aDate).toString();
	}
	
	/**
	* Renvoie l'année courante en numérique
	*/
	public static int fetchYear() {
		Calendar cal = Calendar.getInstance();
	    return cal.get(Calendar.YEAR) ;
	    
	}
	
	/**
	* Renvoie la date et l'heure
	*/
	
	public String simpleDateTime() {
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy - HH'h'mm");
		return formatDate.format(new Date());
	}
	
///////////-------------TEST----------------------------------
//	public static void main(String[] args) {
//		
//	HelpDate helpDate = new HelpDate();
//	helpDate.fetchUsualDate();
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	

}
