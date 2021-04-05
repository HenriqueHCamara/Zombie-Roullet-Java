package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import control.ControlManager;
import database.SimulatedDatabase;
import exception.PlayerNotFoundException;
import model.Player;
import view.MainInterface;
import view.SelectPlayerWindow;

public class SelectPlayerListener implements ActionListener {

	private MainInterface mi;
	private ControlManager cm;
	private SelectPlayerWindow spw;
	private SimulatedDatabase sdb;
	
	public SelectPlayerListener(SelectPlayerWindow spw, ControlManager cm) {
		this.spw = spw;
		this.cm = cm;
	}
	public SelectPlayerListener(MainInterface mi){
		this.mi = mi;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		String name = this.spw.getName();
		ArrayList<Player> c = this.cm.searchByName(name);
		this.cm.SelectPlayer(name);
		}
		catch(PlayerNotFoundException x)
		{
			JOptionPane.showMessageDialog(null, "please insert a player");
		}
		
		
	}}
	

