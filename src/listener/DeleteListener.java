package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import control.ControlManager;
import model.Player;
import util.FileManager;
import view.MainInterface;

public class DeleteListener implements ActionListener {
	private ControlManager cm;
	private Player p;
	private MainInterface mi;
	private FileManager fm;
	
	public DeleteListener(MainInterface mi,ControlManager cm) {
		this.mi=mi;
		this.cm=cm;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.cm.deleteFile();

	}

}
