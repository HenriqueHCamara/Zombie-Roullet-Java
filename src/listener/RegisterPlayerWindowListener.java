package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import view.MainInterface;
import view.RegisterPlayer;

public class RegisterPlayerWindowListener implements ActionListener {

	private MainInterface mi;
	private ControlManager cm;
	
	public RegisterPlayerWindowListener(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new RegisterPlayer(this.mi,this.cm);
		
	}
	
}
