/**
 * 
 */
package fr.afpa.beans;

/**
 * @author ${Elvis}
 *
 */
public class Table {
	private Table table;
	private String colonne;

	public Table(Table table, String colonne) {
		this.table = new Table(table, colonne);
		this.colonne = colonne;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public String getColonne() {
		return colonne;
	}

	public void setColonne(String colonne) {
		this.colonne = colonne;
	}

}
