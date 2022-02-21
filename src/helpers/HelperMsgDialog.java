package helpers;
/**
*
*
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
* DialogBoxes personnalisées
*/
import java.awt.Toolkit;


import javax.swing.JOptionPane;

public class HelperMsgDialog {
	public static final String APP_NAME = "© ikradesk@gmail.com ";

	/**
	* Message dialog avec un message personnalisé
	*/
	public static void chooseMsgDialog(String msg) {
		HelpDate hd = new HelpDate();
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, msg, APP_NAME + " " + hd.simpleDateTime() ,JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	* Message dialog avec le contenu du message de type numérique
	*/
	
	public static void intMsgDialog(Integer msgInt) {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, msgInt.toString(), "appName",JOptionPane.INFORMATION_MESSAGE);
	}

	public static void dbConnectOK() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Connexion à la base de données réussie", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void dbConnectKO() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Connexion à la base de données impossible", "appName",JOptionPane.ERROR_MESSAGE);
	}
	
	public static void addNewRecordsetOK() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Ajout d'un nouvel élément à la base de données réussi", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void userLogged() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Vous êtes bien connecté", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void userLogout() {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "Vous êtes maintenant déconnecté", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void addNewUserOK(String userName) {
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null, "L'utilisateur: " + userName + " a bien été ajouté dans la base de données !", "appName",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
