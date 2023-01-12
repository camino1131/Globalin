package com.swingex;

import java.awt.event.*;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.*;

public class RemoveActionListener implements ActionListener {

	JTable table;
	public RemoveActionListener(JTable table) {
	this.table=table;	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	int row = table.getSelectedRow();
	if(row == -1)
		return;
	
	DefaultTableModel model = (DefaultTableModel)table.getModel();
	model.removeRow(row);
	
	}

}
