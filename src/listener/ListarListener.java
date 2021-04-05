package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import view.MainInterface;

public class ListarListener implements ActionListener{

	private ControlManager cm;
	private MainInterface mi;
	
	public ListarListener(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.cm.listPlayers();
		
		
	}
}
	