package listener;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import control.ControlManager;
import view.MainInterface;
import view.RegisterPlayer;

public class AbrirArquivoListener implements ActionListener{

	private ControlManager cm;
	private MainInterface mi;
	private RegisterPlayer rp;
	
	public AbrirArquivoListener(RegisterPlayer rp, ControlManager cm) {
		this.rp = rp;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("C:\\Users\\Henrique\\workspace\\Trabalho Final\\Profissao.txt");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		     
		    }
		}
		
	}
}

	