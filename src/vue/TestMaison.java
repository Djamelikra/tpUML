/**
* @Auteur Djamel 
* @Auteur ikradesk@gmail.com
*/
package vue;

import model.Appartement;
import model.Personne;

public class TestMaison {

	public static void main(String[] args) {

		Appartement MyApartament = new Appartement();
		Personne person = new Personne();
		person.setName("Toto");
		person.setMAison(MyApartament);
		person.display();

	}

}
