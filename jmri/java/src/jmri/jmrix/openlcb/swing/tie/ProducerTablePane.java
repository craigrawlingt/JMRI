// ProducerTablePane.java

package jmri.jmrix.openlcb.swing.tie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ResourceBundle;

import javax.swing.*;
import javax.swing.table.*;

/**
 * Pane for showing the producer table
 * @author	 Bob Jacobsen 2008
 * @version	 $Revision$
 * @since 2.3.7
 */
public class ProducerTablePane extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -892441860659962671L;

	static    ResourceBundle rb = ResourceBundle.getBundle("jmri.jmrix.openlcb.swing.tie.TieBundle");
	
	protected JTable table = null;
	protected TableModel tableModel = null;
							
    public void initComponents() throws Exception {

        // set the frame's initial state
        setSize(500,300);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));


        tableModel = new ProducerTableModel();        
        table = jmri.util.JTableUtil.sortableDataModel(tableModel);
        table.setRowSelectionAllowed(true);
        table.setPreferredScrollableViewportSize(new java.awt.Dimension(300,350));

        TableColumnModel columnModel = table.getColumnModel();
        TableColumn column;
        column = columnModel.getColumn(ProducerTableModel.USERNAME_COLUMN);
        column.setMinWidth(20);
        //column.setMaxWidth(40);
        column.setResizable(true);
        column = columnModel.getColumn(ProducerTableModel.NODE_COLUMN);
        column.setMinWidth(40);
        //column.setMaxWidth(85);
        column.setResizable(true);
        column = columnModel.getColumn(ProducerTableModel.NUMBER_COLUMN);
        column.setMinWidth(75);
        //column.setMaxWidth(100);
        column.setResizable(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }


    // for Print button support, see jmri.jmrix.cmri.serial.assignment.ListFrame

    static Logger log = LoggerFactory.getLogger(ProducerTablePane.class.getName());
	
}

/* @(#)ProducerTablePane.java */