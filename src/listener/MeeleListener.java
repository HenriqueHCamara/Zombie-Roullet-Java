package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import view.BattleWindow;

public class MeeleListener implements ActionListener{

	private ControlManager cm;
	private BattleWindow bw;
	
	public MeeleListener(BattleWindow bw, ControlManager cm) {
		this.bw = bw;
		this.cm = cm;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		this.bw.BattleMeele();
			
	}
	
}

	