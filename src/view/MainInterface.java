package view;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.ControlManager;
import listener.DeleteListener;
import listener.ExitListener;
import listener.ListarListener;
import listener.NewGameListener;
import listener.ProcurarListener;
import listener.RegisterPlayerWindowListener;
import listener.RussianListener;
import model.Player;
import util.FileManager;
import javax.swing.ImageIcon;

public class MainInterface {

	private JFrame frame;
	private ControlManager cm;
	private Player p;
	private FileManager fm;
	
	public MainInterface(ControlManager cm) {
		this.cm = cm;
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 773);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 16, 614, 699);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Jogar");
		btnNewButton.addActionListener(new NewGameListener(this, this.cm));
		btnNewButton.setBounds(132, 127, 368, 139);
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Criar Personagem");
		btnNewButton_1.addActionListener(new RegisterPlayerWindowListener(this, this.cm));
		btnNewButton_1.setBounds(132, 315, 368, 81);
		panel.add(btnNewButton_1);
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ExitListener(this, this.cm));
		btnSair.setBounds(132, 565, 368, 94);
		panel.add(btnSair);
		
		JLabel lblTrabalhoFinal = new JLabel("Days Gone By");
		lblTrabalhoFinal.setFont(new Font("OCR A Extended", Font.BOLD | Font.ITALIC, 40));
		lblTrabalhoFinal.setForeground(Color.GREEN);
		play("338817__sirkoto51__rpg-battle-loop-1");
		lblTrabalhoFinal.setBounds(151, 16, 318, 43);
		panel.add(lblTrabalhoFinal);
		
		JButton btnProcurarPersonagensPor = new JButton("Procurar personagens por nome");
		btnProcurarPersonagensPor.addActionListener(new ProcurarListener(this, this.cm));
		btnProcurarPersonagensPor.setBounds(132, 462, 368, 43);
		panel.add(btnProcurarPersonagensPor);
		
		JButton btnListarPersonagens = new JButton("Listar Personagens");
		btnListarPersonagens.addActionListener(new ListarListener(this, this.cm));
		btnListarPersonagens.setBounds(132, 506, 368, 43);
		panel.add(btnListarPersonagens);
		
		JButton btnRussianRoullet = new JButton("Russian roullet");
		btnRussianRoullet.addActionListener(new RussianListener(this, this.cm));
		btnRussianRoullet.setBounds(132, 270, 368, 29);
		panel.add(btnRussianRoullet);
		
		JButton btnDeletarPersonagem = new JButton("Deletar TODOS personagens");
		btnDeletarPersonagem.addActionListener(new DeleteListener(this, this.cm));
		btnDeletarPersonagem.setBounds(132, 403, 368, 29);
		panel.add(btnDeletarPersonagem);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainInterface.class.getResource("/Imagens/custom zombies basic.jpg")));
		lblNewLabel.setBounds(-378, -21, 1353, 720);
		panel.add(lblNewLabel);
		
		frame.setTitle("Days gone By");
		

				
		this.frame.setVisible(true);
	}
	public void play(String soundName)
	{
		URL url = getClass().getResource(soundName + ".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();
		

	}
	
	
	public void close()
	{
		this.frame.setVisible(false);
		this.frame = null;
	}
}

