package control;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import database.SimulatedDatabase;
import exception.NameExistingFormatexception;
import model.Player;
import util.FileManager;
import view.BattleWindow;
import view.MainInterface;
import view.SelectPlayerWindow;

public class ControlManager {

	
	private SimulatedDatabase sdb;	
	private MainInterface mi;
	private FileManager fm;
	private BattleWindow bw;
	private SelectPlayerWindow spw;
	

	public ControlManager() 
	{
		this.sdb = new SimulatedDatabase();
		this.fm = new FileManager();
		
		new MainInterface(this);
	}

	
	public void registerPlayer1(String name, int idade, String profissao, String genero) throws NameExistingFormatexception  {
		ArrayList<Player> player = this.sdb.getPlayers();
			Player p = new Player(name,profissao,idade,genero);
		
		for(int i = 0; i < player.size(); i++) {
			if(player.get(i).getName().toLowerCase().equals(name.toLowerCase()))
				throw new NameExistingFormatexception();
				
			}			
		if(!player.contains(name))
			
		this.sdb.addPlayer(p);
		
		}
	
	public void Russian()
	{
		if(this.sdb.getPlayers().size() >= 2){
		 Random ran = new Random(); 
		 
	        int chamber = ran.nextInt(4); 

	        JOptionPane.showMessageDialog(null,"Bullet is in chamber: " + (chamber+1)); 

	        int Player = this.sdb.getPlayers().size();//Integer.parseInt(JOptionPane.showInputDialog("Enter number of players: ")); 

	        for(;;) { 

	            for(int i = 0; i < Player; i++) { 

	                int x = ran.nextInt(4); 

	                JOptionPane.showMessageDialog(null,"Spinning revolver for player: " + (i+1)); //+ " revolver aligned to chamber " + (x+1)); 

	                try {Thread.sleep(1000);} catch (Exception e) {} 

	               
	                if(x == chamber) { 
	                	 JOptionPane.showMessageDialog(null,"   POW !!!"); 
	                	JOptionPane.showMessageDialog(null,"Player " + (i+1) + " is dead"); 
	 
	                    return; 
	                }
	               if(x != chamber)
	               {
	            	   JOptionPane.showMessageDialog(null,"	Click!!!");   
	               }
	                } 

	            } 
	        
	        }
		else
		{
			JOptionPane.showMessageDialog(null, "You need to have at least 2 players Registered to play");
		}
	
	}
	
	
	public void listPlayers()
	{
		ArrayList<Player> players = this.sdb.getPlayers();
		String u = "";
		
		for(int i = 0;i < players.size();i = i + 1)
		{
			Player player = players.get(i);
			u = u  +  player.getName() + "-" + player.getProfissao() + "\n";
			
		}
		JOptionPane.showMessageDialog(null, u);
	}


	public Player searchPlayerByName(String name) {
		ArrayList<Player> players = this.sdb.getPlayers();
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getName().equalsIgnoreCase(name))
				return players.get(i);
		}
		
		JOptionPane.showMessageDialog(null, "Isto Non ecxiste");
		return null;
	}
	
	public ArrayList<Player> searchByName(String nome)
	{
		ArrayList<Player> player = this.sdb.getPlayers();
		ArrayList<Player> players = new ArrayList<Player>();
		for(int i = 0; i < player.size();i++)
		{	
			Player u = player.get(i);
			String playerName = u.getName().toLowerCase();
			if(playerName.contains(nome))
				players.add(u);		
		}
		
		return players;
	}
	
	public void SelectPlayer(String name)
	{
		ArrayList<Player> players = this.sdb.getPlayers();
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getName().equalsIgnoreCase(name))
			new BattleWindow(mi, this); 
			
			}
		
	}
	
	
	
	public ArrayList<Player> getName(Player u) {
		ArrayList<Player> a = sdb.getPlayers();
		ArrayList<Player> players= new ArrayList<Player>();
		for(int i=0; i< a.size(); i++) {
			if(a.get(i).getName().equals(u.getName()))
				players.add(a.get(i));
			}
		return players;
	}
	
	
	public void deleteFile() {
		ArrayList<Player> a = sdb.getPlayers();
        File file = new File("Player.txt");
 
        boolean status = file.delete();
        if (status){
            JOptionPane.showMessageDialog(null,"Players deleted successfully");
        sdb.getPlayers().removeAll(a);}
        else
        	JOptionPane.showMessageDialog(null,"There are no players to be deleted");
 
    }
	
	int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}

}
