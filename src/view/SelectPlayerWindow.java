package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.ControlManager;
import database.SimulatedDatabase;
import exception.PlayerNotFoundException;
import listener.SelectPlayerListener;
import listener.VoltarMainWindow1Listener;

public class SelectPlayerWindow {

	private JFrame frame;
	private MainInterface mi;
	private ControlManager cm;
	private JTextField textField;
	private SimulatedDatabase sdb;

	
	public SelectPlayerWindow(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 229);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(112, 36, 193, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do jogador a ser utilizado:");
		lblDigiteONome.setBounds(96, 11, 225, 14);
		panel.add(lblDigiteONome);
		
		JButton btnSelecionarJogador = new JButton("Selecionar jogador");
		btnSelecionarJogador.addActionListener(new SelectPlayerListener( this, this.cm));
		btnSelecionarJogador.setBounds(10, 89, 394, 85);
		panel.add(btnSelecionarJogador);
		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new VoltarMainWindow1Listener( this, this.cm));
		btnVoltar.setBounds(10, 185, 394, 44);
		panel.add(btnVoltar);
		
		this.frame.setVisible(true);
		
		
	}
	
public String getName() throws PlayerNotFoundException {
		
	
		if(this.textField.getText().length() > 0){
			return this.textField.getText();
		}
		else{
			
			throw new PlayerNotFoundException();
		}
	
		
	}


	
	public void close()
	{
		this.frame.setVisible(false);
		this.frame = null;
	}

}
