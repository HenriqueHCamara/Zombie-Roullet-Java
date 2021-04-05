package view;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control.ControlManager;
import listener.FireListener;
import listener.MeeleListener;
import listener.VoltarMainWindowListener1;

public class BattleWindow {

	private JFrame frame;
	private MainInterface mi;
	private ControlManager cm;
	private RegisterPlayer rp;

	private JLabel lblNewLabel_4;
	int x = 5;
	int bala = 5;
	int enemy = (randomWithRange(1, 10));
	
	JLabel label = new JLabel();
	
	final JLabel labelZombie = new JLabel(String.valueOf(enemy));
	
	final JLabel labelBala = new JLabel(String.valueOf(bala));

	
	
	
	
	
	public BattleWindow(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
		initialize();
	}
	
	

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 736, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 16, 684, 429);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("FIRE!");
		btnNewButton.addActionListener(new FireListener(this,this.cm));
		btnNewButton.setBounds(15, 365, 147, 66);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MEELE!");
		btnNewButton_1.addActionListener(new MeeleListener(this,this.cm));
		btnNewButton_1.setBounds(270, 365, 147, 66);
		panel.add(btnNewButton_1);
		
	
		
		JLabel lblNewLabel = new JLabel("Bullets");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(15, 329, 46, 20);
		panel.add(lblNewLabel);
		
		
		
		JLabel lblEnemyhealth = new JLabel("Enemys:");
		lblEnemyhealth.setForeground(Color.BLACK);
		lblEnemyhealth.setBounds(303, 16, 99, 20);
		panel.add(lblEnemyhealth);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(BattleWindow.class.getResource("/Imagens/walking-dead-zombie.jpg")));
		lblNewLabel_2.setBounds(61, 42, 578, 263);
		panel.add(lblNewLabel_2);
		
		
		JButton btnVoltar = new JButton("RUN!");
		btnVoltar.addActionListener(new VoltarMainWindowListener1(this,this.cm));
		btnVoltar.setBounds(492, 365, 162, 66);
		panel.add(btnVoltar);
		
		panel.add(labelZombie);
		labelZombie.setText(String.valueOf(enemy));
		labelZombie.setBounds(415, 16, 69, 20);
		panel.add(labelZombie);
		
		panel.add(labelBala);
		labelBala.setText(String.valueOf(bala+1));
		labelBala.setBounds(76, 329, 69, 20);
		panel.add(labelBala);
		
		
		frame.setTitle("É HORA DO SHOW");
		
		this.frame.setVisible(true);
	}
	
	
	public void BattleFire()
	{

		if (bala < 0){
			
			JOptionPane.showMessageDialog(null, "Out of bullets");
			return;
		}
		
		Random ran = new Random(); 
		 
	        int Zombie = ran.nextInt(8); 
	        int Player = 1;
	
	        for(;;) { 

	            for(int i = 0; i < Player; i++) { 

	                int x = ran.nextInt(4); 
	                JOptionPane.showMessageDialog(null,"   POW !!!"); 
	                play("182272__martian__gun-for-loy");
	                if(x == Zombie) { 

	                	JOptionPane.showMessageDialog(null,"Player is dead\nYou Lose"); 
	 
	                	this.close();
	                    return; 
	                }
	                if(x != Zombie) { 

	                	JOptionPane.showMessageDialog(null,"zombie is dead\nYou Win this round"); 
	                	labelZombie.setText(String.valueOf(enemy-1));
	                	labelBala.setText(String.valueOf(bala));
	                	bala--;
	                	enemy--;
	                	if(enemy<=0)
	                	{
	                		JOptionPane.showMessageDialog(null, "YOU WIN\nGAME OVER");
	                		this.close();
	                	}
	                    return; 
	                }
	                
	               
	                } 

	            } 
	        }
	
	public void BattleMeele()
	{
		 Random ran = new Random(); 
		 
	        int Zombie = ran.nextInt(4); 
	        int Player = 1;
	
	        for(;;) { 

	            for(int i = 0; i < Player; i++) { 

	                int x = ran.nextInt(2); 
	                JOptionPane.showMessageDialog(null,"   PAFT!!!"); 
	                play("157020__slave2thelight__3-bat-hits");
	                if(x == Zombie) { 

	                	JOptionPane.showMessageDialog(null,"Player is dead\nYou Lose"); 
	                	this.close();
	                    return; 
	                }
	                if(x != Zombie) { 

	                	JOptionPane.showMessageDialog(null,"zombie is dead\nYou Win this round"); 
	                	labelZombie.setText(String.valueOf(enemy-1));
	                	enemy--;
	                	if(enemy<=0)
	                	{
	                		JOptionPane.showMessageDialog(null, "YOU WIN\nGAME OVER");
	                		this.close();
	                	}
	                    return; 
	                }
	               
	                } 

	            } 
	        }


	int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	public void close() {
		this.frame.setVisible(false);
		this.frame = null;
	}
	
	public void play(String soundName)
	{
		URL url = getClass().getResource(soundName + ".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();
		

	}
}
