package presentation;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import metier.Client;

public class ClientModele extends AbstractTableModel {

	
	//definition attribut collonne de la table + ligne
	//colonnes
	private String[] tableColumnNames = new String[] {"id", "nom", "prenom", "yeux"}; 
	//lignes
	private Vector<String[]> tableValues = new Vector<String[]>();
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return tableColumnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return tableValues.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return tableValues.get(rowIndex)[columnIndex];
	}
	//nom de la colonne
	public String getColumnName(int column){
		return tableColumnNames[column];
	}

	//remplir le tableau avec les données de la bdd
	public void	setData(List<Client> clients){
		tableValues = new Vector<String[]>();
		for(Client c : clients)
			tableValues.add(new String[] {String.valueOf(c.getId()),c.getNom(), c.getPrenom(), c.getyeux()});
		fireTableChanged(null);
	}
}
