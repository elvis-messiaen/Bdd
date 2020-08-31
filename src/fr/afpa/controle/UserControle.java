/**
 * 
 */
package fr.afpa.controle;

import fr.afpa.beans.User;

/**
 * @author ${Elvis}
 *
 */

public class UserControle {
	private User user = new User(null, null);

	public UserControle(User user) {
		this.user = new User(null, null);
	}

	private final int TAILLEMAX = 25;

	/*
	 * classe pour vérifier la taille du login renvoie true si moins de 25 false si
	 * plus renvoie message erreur si les consigne ne sont pas respecter
	 */
	public static boolean verifTailleLog(User a) {
		boolean verifLogin = false;
		if (a.getLogin().length() > 2 && a.getLogin().length() < 25) {

			verifLogin = true;
		} else {
			System.out.println(
					"Votre login n'est pas conforme, il doit etre superieur a 2 caractéres et inférieur à 25 ");
		}
		return verifLogin;
	}

	/*
	 * classe pour vérifier la taille du mdp renvoie true si moins de 25 false si
	 * plus renvoie message erreur si les consignes ne sont pas respecter
	 */
	public static boolean verifTailleMdp(User a) {
		boolean verifTailleMdp = false;
		if (a.getMdp().length() > 2 && a.getMdp().length() < 25) {
			verifTailleMdp = true;
		} else {
			System.out.println(
					"Votre mot de passe n'est pas conforme, il doit etre superieur a 2 caractéres et inférieur à 25 ");
		}
		return verifTailleMdp;
	}

	public static boolean verifLoginExist(User b) {
		boolean verifExist = false;
		String bdd = (b.getLogin());
		if (b.getLogin().equals(bdd)) {
			return true;
		} else {
			System.out.println("Votre login est incorect ou n'existe pas. Veuillez crée un compte");
		}

		return verifExist;

	}

	public static boolean verifMdpExist(User b) {
		boolean verifExist = false;
		String bdd = (b.getMdp());
		if (b.getMdp().equals(bdd)) {
			return true;
		} else {
			System.out.println("Votre mot de passe est incorect ou n'existe pas. Veuillez crée un compte");
		}

		return verifExist;

	}

	public static boolean verifCreat(User b) {
		boolean verifCreat =false;
		
		return verifCreat;
	}

}
