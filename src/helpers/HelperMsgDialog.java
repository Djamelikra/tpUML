package helpers;
/**
*
*
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
* DialogBoxes personnalis�es
*/
import java.awt.Toolkit;


import javax.swing.JOptionPane;

public class HelperMsgDialog {
	public static final String APP_NAME = "� ikradesk@gmail.com ";

	/**
	* Message dialog avec un message personnalis�
	*/
	public static void chooseMsgDialog(String msg) {
		HelpDate hd = new HelpDate();
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, msg, APP_NAME + " " + hd.simpleDateTime() ,JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	* Message dialog avec le contenu du message de type num�rique
	*/
	
	public static void intMsgDialog(Integer msgInt) {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, msgInt.toString(), "appName",JOptionPane.INFORMATION_MESSAGE);
	}

	public static void dbConnectOK() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Connexion � la base de donn�es r�ussie", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void dbConnectKO() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Connexion � la base de donn�es impossible", "appName",JOptionPane.ERROR_MESSAGE);
	}
	
	public static void addNewRecordsetOK() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Ajout d'un nouvel �l�ment � la base de donn�es r�ussi", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void userLogged() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Vous �tes bien connect�", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void userLogout() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Vous �tes maintenant d�connect�", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void addNewUserOK(String userName) {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "L'utilisateur: " + userName + " a bien �t� ajout� dans la base de donn�es !", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
