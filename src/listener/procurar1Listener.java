package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import control.ControlManager;
import model.Player;
import view.MainInterface;
import view.RegisterPlayer;

public class procurar1Listener implements ActionListener{

	private ControlManager cm;
	private MainInterface mi;
	
	public procurar1Listener(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name = JOptionPane.showInputDialog("Type player name(Please search in lower case):");
		Player c = this.cm.searchPlayerByName(name);
		JOptionPane.showMessageDialog(null, c.toString());
		
		
	}
}

	