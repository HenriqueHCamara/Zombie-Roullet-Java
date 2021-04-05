package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import view.BattleWindow;
import view.MainInterface;
import view.RegisterPlayer;

public class VoltarMainInterfaceListener implements ActionListener{

	private ControlManager cm;
	private MainInterface mi;
	private RegisterPlayer rp;
	private BattleWindow bw;
	
	public VoltarMainInterfaceListener(RegisterPlayer rp, ControlManager cm) {
		this.rp = rp;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {	
			this.rp.close();
		
	}
}

	