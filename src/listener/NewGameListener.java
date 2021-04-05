package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.MainInterface;
import view.SelectPlayerWindow;
import control.ControlManager;
import database.SimulatedDatabase;

public class NewGameListener implements ActionListener {

	private MainInterface mi;
	private ControlManager cm;
	private SimulatedDatabase sdb;
	
	public NewGameListener(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			new SelectPlayerWindow(this.mi,this.cm);
		
	}
	
}
