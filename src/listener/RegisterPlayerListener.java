package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import control.ControlManager;
import exception.AgeFormatException;
import exception.FormatException;
import exception.NameExistingFormatexception;
import view.RegisterPlayer;

public class RegisterPlayerListener implements ActionListener{

	private ControlManager cm;
	private RegisterPlayer rp;
	
	public RegisterPlayerListener(RegisterPlayer rp, ControlManager cm) {
		this.rp = rp;
		this.cm = cm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		        try {
		        	this.cm.registerPlayer1(this.rp.getName(), this.rp.getAge(), this.rp.getProfissao(), this.rp.getGenero());
		        	JOptionPane.showMessageDialog(null, "A player named:\n" + this.rp.getName() + "\nWho worked as a:\n" + this.rp.getProfissao() + "\nwas registered successefully");
		        } catch (AgeFormatException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
		        catch(FormatException f)
		        {
		        	JOptionPane.showMessageDialog(null, "Name field empty");
		        }
		        catch(NameExistingFormatexception k)
		        {
		        	JOptionPane.showMessageDialog(null, k.getMessage());
		        }
				
	}
	}

	