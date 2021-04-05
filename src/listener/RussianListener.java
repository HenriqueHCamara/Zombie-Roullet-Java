package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import database.SimulatedDatabase;
import view.MainInterface;

public class RussianListener implements ActionListener {

	private MainInterface mi;
	private ControlManager cm;
	private SimulatedDatabase sdb;
	
	public RussianListener(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			this.cm.Russian();
		
	}
	
}
