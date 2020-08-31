/**
 * 
 */
package fr.afpa.affichage;

import fr.afpa.beans.User;
import fr.afpa.controle.UserControle;

/**
 * @author ${Elvis}
 *
 */
public class Menu {

	public static void main(String[] args) {
		User ntere = new User("easeee", "re");
		User notrr = new User("easeee", "re");
		if (UserControle.verifLoginExist(ntere)) {
			System.out.println(ntere.getLogin());

			// System.out.println(ntere.getLogin());
		}

	}

}
