/**
 * 
 */
package fr.afpa.beans;

/**
 * @author ${Elvis}
 *
 */
public class User implements Comparable<User>{
	private String login;
	private String mdp;


	public User(String login, String mdp) {
		this.login = login;
		this.mdp = mdp;
	
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean equals(Object o) {
		return this.login.equals(((User)o).getLogin()) &&
				this.mdp.equals(((User)o).getMdp());
		
		
	}

	@Override
	public int compareTo(User o) {
		return this.login.compareTo(o.getLogin()) & this.mdp.compareTo(o.getMdp()) ;
	}

	@Override
	public String toString() {
		return login + " "+ mdp ;
	}	
	

}
