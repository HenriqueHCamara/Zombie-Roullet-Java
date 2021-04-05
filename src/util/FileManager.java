package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Player;

public class FileManager {
	
	public void write(String text, String uri) {
		File f = new File(uri);
		
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "File motherfucking");
		}
		
	}
	
	public ArrayList<String> read(String uri) {
		
		ArrayList<String> file = new ArrayList<String>(); 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(uri));
			String line =  "";
			while ((line = br.readLine()) != null){
				file.add(line);
			}	
			br.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return file;
	}
	
	
	}
