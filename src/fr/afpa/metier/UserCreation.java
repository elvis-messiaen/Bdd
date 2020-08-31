/**
 * 
 */
package fr.afpa.metier;

import fr.afpa.beans.User;

/**
 * @author ${Elvis}
 *
 */
public class UserCreation {
	private User user = new User(null, null);

	public UserCreation(User user) {
		this.user = new User(null, null);
	}
	public void creationUser(User p) {
		if (p.getLogin() == null || p.getMdp() == null) {
			System.out.println("Vous devez remplir les champs comme cela \n"
					         + "+ de 2 caractéres et - de 25 \n"
					         + "le mod de passe doit contenir lettres et chiffres \n "
							 + "login : blertoir , mdp : hsyys63jkTH77");
		}
	}
}