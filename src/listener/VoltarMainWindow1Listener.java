package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.BattleWindow;
import view.MainInterface;
import view.RegisterPlayer;
import view.SelectPlayerWindow;
import control.ControlManager;

public class VoltarMainWindow1Listener implements ActionListener{

	private ControlManager cm;
	private MainInterface mi;
	private RegisterPlayer rp;
	private BattleWindow bw;
	private SelectPlayerWindow spw;
	
	public VoltarMainWindow1Listener(SelectPlayerWindow spw, ControlManager cm) {
		this.rp = rp;
		this.cm = cm;
		this.spw = spw;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
			
			this.spw.close();
		
	}
}

	