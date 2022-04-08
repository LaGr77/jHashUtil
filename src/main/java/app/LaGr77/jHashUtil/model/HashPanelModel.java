package app.LaGr77.jHashUtil.model;

import javax.swing.table.DefaultTableModel;

/**
 * HAsh panel model
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.2.2022-04-08
 * @since 2022-01-18
 */
public class HashPanelModel extends DefaultTableModel   {
    
    /** Constructor */
    public HashPanelModel () {
        //this.setColumnCount(3);
        this.addColumn("Soubor");
        this.addColumn("Algorithm");
        this.addColumn("Hash");
      }
        
    /****************************************************************************************************
     *                                                                                            Methods
     ****************************************************************************************************/
    /**
     * Inser new row
     * @param data {@link Object} []
     */    
    public void addRow(Object [] data) {
        this.addRow(data);
    }

    /**
     * Remove row
     * @param row {@link Integer}
     */
    public void removeRow(int row) {
        this.removeRow(row);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    


    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private final Class[] columnClasses = new Class[] { String.class, String.class, String.class};

}
