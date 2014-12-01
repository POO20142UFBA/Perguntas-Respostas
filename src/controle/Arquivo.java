package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import modelo.Pergunta;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


//Retorna o endereço com o nome do arquivo para salvar.
public class Arquivo{
	private BufferedWriter bw;
	
	public synchronized void addPergunta(Pergunta pergunta){
		
		try{
			String s = "<pergunta>"+ pergunta.getEnunciado().toString() + " <repostaCorreta>" + pergunta.getAlternativaCorreta().toString() + " <demaisAlternativas>"; //+ pergunta.getAlternativas().iterator().next().toString();

			bw = new BufferedWriter(new FileWriter("perguntas.txt", true));  
			bw.write(s);
			bw.newLine();
			bw.flush();
			bw.close();   
		}catch(Exception e){ 
			System.out.println("Exception Caught : " +e.getMessage());
		}  



	}  
		

}

	
