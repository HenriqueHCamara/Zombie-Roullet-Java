package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import view.BattleWindow;

public class FireListener implements ActionListener{

	private ControlManager cm;
	private BattleWindow bw;
	
	public FireListener(BattleWindow bw, ControlManager cm) {
		this.bw = bw;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.bw.BattleFire();
		
		
	}
	
	
	

}


	