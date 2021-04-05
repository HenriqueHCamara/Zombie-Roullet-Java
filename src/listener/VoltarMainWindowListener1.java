package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import view.BattleWindow;
import view.MainInterface;
import view.RegisterPlayer;

public class VoltarMainWindowListener1 implements ActionListener{

	private ControlManager cm;
	private MainInterface mi;
	private RegisterPlayer rp;
	private BattleWindow bw;
	
	public VoltarMainWindowListener1(BattleWindow bw, ControlManager cm) {
		this.rp = rp;
		
		this.cm = cm;
		this.bw = bw;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
			this.bw.close();
		
	}
}

	