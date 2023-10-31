package adapter2;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;


import domain.*;

public class PacientTableModel extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] { "Name", "Symptom", "Weight" };

	  private Vector<Symptom> sintomas = new Vector<Symptom>();
	  public PacientTableModel(Covid19Pacient p) {
	    this.pacient=p;
	    Iterator<Symptom> i = pacient.getSymptoms().iterator();
	    while (i.hasNext())
	    {
	    	sintomas.add(i.next());
	    }
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  
		  
		 if(col==0) return sintomas.get(row).getName();
		 if(col==1) return pacient.getWeight(sintomas.get(row));
		 
		 return null;
	  }
	}
