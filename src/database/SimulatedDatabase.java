package database;

import java.util.ArrayList;

import model.Player;
import util.FileManager;

public class SimulatedDatabase {
private ArrayList<Player> players;

	
	
	public SimulatedDatabase() 
	{
		this.players = new ArrayList<Player>();
		this.populatePlayer();
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public void addPlayer(Player p) {
		this.players.add(p);
	      FileManager fm = new FileManager();
	     fm.write(p.toFileString(), "player.txt");
	       
	       
	}
	
	
	
	public void populatePlayer() //throws FormatException{
	{	
	FileManager fm= new FileManager();
		ArrayList<String> playersStrings= fm.read("player.txt");
		
		 for(int i=0; i<playersStrings.size(); i++){
			 String[] list= playersStrings.get(i).split("-");
			 
			 String name=list[0];
			 String profissao= list[1];
			 int idade =Integer.parseInt(list[2]);
			 String genero= list[3];
			
			 
			 players.add(new Player(name, profissao, idade, genero));
		 }
		
		 
	}

	public String getProfissao() 
	{
		FileManager fm= new FileManager();
		ArrayList<String> playersStrings= fm.read("player.txt");
		
		 for(int i=0; i<playersStrings.size(); i++){
			 String[] list= playersStrings.get(i).split("-");
			 
			 //String name=list[0];
			 String profissao= list[1];
	
			 return profissao;
		 }
		return null;

	}
	
	
}