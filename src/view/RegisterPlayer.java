package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.ControlManager;
import exception.AgeFormatException;
import exception.FormatException;
import listener.AbrirArquivoListener;
import listener.RegisterPlayerListener;
import listener.VoltarMainInterfaceListener;

public class RegisterPlayer {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAge;
	private JComboBox comboType;
	private JComboBox comboType1;
	
	private MainInterface mi;
	private ControlManager cm;
	private BattleWindow bw;

	
	public RegisterPlayer(MainInterface mi, ControlManager cm) {
		this.mi = mi;
		this.cm = cm;
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 16, 398, 483);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCrieSeuPersonagem = new JLabel("Crie seu personagem");
		lblCrieSeuPersonagem.setBounds(113, 16, 156, 20);
		panel.add(lblCrieSeuPersonagem);
		
		JButton btnNewButton = new JButton("register");
		btnNewButton.addActionListener(new RegisterPlayerListener(this, this.cm));
		btnNewButton.setBounds(39, 317, 313, 90);
		panel.add(btnNewButton);
		
		txtName = new JTextField();
		txtName.setBounds(207, 61, 146, 26);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(207, 103, 146, 26);
		panel.add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(96, 67, 48, 20);
		panel.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(96, 106, 46, 20);
		panel.add(lblIdade);
		
		JLabel lblProfisso = new JLabel("Profiss\u00E3o:");
		lblProfisso.setBounds(74, 164, 70, 20);
		panel.add(lblProfisso);
		
		JLabel lblGenero = new JLabel("gênero:");
		lblGenero.setBounds(89, 271, 55, 20);
		panel.add(lblGenero);
		
		String[] comFields = {"Medico","Soldado","Atleta","Gatuno","Policial"};
		this.comboType = new JComboBox(comFields);
		this.comboType.setBounds(207, 153, 125, 42);
		panel.add(this.comboType);
		
		String[] comFields1 = {"Masculino","Feminino"};
		this.comboType1 = new JComboBox(comFields1);
		this.comboType1.setBounds(207, 260, 125, 42);
		panel.add(this.comboType1);
		
		JLabel lblparaUmaDescrio = new JLabel("(Para uma descri\u00E7\u00E3o detalhade de cada profiss\u00E3o leia ");
		lblparaUmaDescrio.setBounds(0, 195, 378, 20);
		panel.add(lblparaUmaDescrio);
		
		JLabel lblOArquivoEm = new JLabel("o arquivo em anexo)");
		lblOArquivoEm.setBounds(0, 217, 147, 20);
		panel.add(lblOArquivoEm);
		
		JButton btnAbrirArquivo = new JButton("Abrir arquivo");
		btnAbrirArquivo.addActionListener(new AbrirArquivoListener(this, this.cm));
		btnAbrirArquivo.setBounds(207, 215, 146, 29);
		panel.add(btnAbrirArquivo);
		
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new VoltarMainInterfaceListener( this, this.cm));
		btnNewButton_1.setBounds(39, 423, 313, 44);
		panel.add(btnNewButton_1);
		
		this.frame.setVisible(true);
	}
	
	
public String getName() throws FormatException {
		
		
		if(this.txtName.getText().length() > 0){
			return this.txtName.getText();
		}
		else{
			
			throw new FormatException();
		}
		
	}
	
	
	public int getAge() throws AgeFormatException {
		if(isValidAgeFormat(this.txtAge.getText()))
			return Integer.parseInt(this.txtAge.getText());
		throw new AgeFormatException();
	}
	
	private boolean isValidAgeFormat(String age) {
		if(age.length() <= 1 || age.length() >= 3 )
			return false;
		return true;
	}
	
	public String getProfissao() {
		return (String) this.comboType.getSelectedItem();
	}
	
	public String getGenero() {
		return (String) this.comboType1.getSelectedItem();
	}
	
	public void close() {
		this.frame.setVisible(false);
		this.frame = null;
	}
}
