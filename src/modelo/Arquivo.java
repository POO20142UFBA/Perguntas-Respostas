package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Arquivo extends EscolherArquivo{
	
	private BufferedWriter bw = null;
	private BufferedReader fr = null;
	
	/*
	 * 		PERGUNTA
	 */
	
	public void salvarArquivoPergunta(Pergunta pergunta) throws IOException{
		
		try{
			String perguntaCompleta = null;
			
			perguntaCompleta = "<pergunta>"+pergunta.getEnunciado()
					+"<repostaCorreta>"+pergunta.getAlternativas().get(0).getAlternativa().toString()
					+"<falsa1>"+pergunta.getAlternativas().get(1).getAlternativa().toString()
					+"<falsa2>"+pergunta.getAlternativas().get(2).getAlternativa().toString()
					+"<falsa3>"+pergunta.getAlternativas().get(3).getAlternativa().toString()
					+"<falsa4>"+pergunta.getAlternativas().get(4).getAlternativa().toString()
					+"<falsa5>";
			
			bw = new BufferedWriter(new FileWriter(buscarArquivoSalvar("prpg"), true));  
			bw.write(perguntaCompleta);
			bw.newLine();
			bw.flush();
			bw.close(); 
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			
		}catch(Exception e){ 
			JOptionPane.showMessageDialog(null, "Exception Caught : " +e.getMessage());
		}finally{

		}
	} 
	
	public ArrayList<Pergunta> lerArquivoPergunta() throws IOException{

		int inicio=0;
		int fim=0;
		String linha;
		String perg;
		String a1;
		String a2;
		String a3;
		String a4;
		String a5;
		List<Pergunta> listPergunta = new ArrayList<Pergunta>();
			
		
		fr = new BufferedReader(new FileReader(buscarArquivoAbrir("prpg")));
		
        while ((linha = fr.readLine()) != null) {

        	fim = linha.indexOf("<repostaCorreta>");
        	perg = linha.substring(10, fim);
        	
        	inicio = fim+16;
        	fim = linha.indexOf("<falsa1>");
        	a1 = linha.substring(inicio, fim);

        	inicio = fim+8;
        	fim = linha.indexOf("<falsa2>");
        	a2 = linha.substring(inicio, fim);

        	inicio = fim+8;
        	fim = linha.indexOf("<falsa3>");
        	a3 = linha.substring(inicio, fim);

        	inicio = fim+8;
        	fim = linha.indexOf("<falsa4>");
        	a4 = linha.substring(inicio, fim);
        	
        	inicio = fim+8;
        	fim = linha.indexOf("<falsa5>");
        	a5 = linha.substring(inicio, fim);
        	
        	
        	listPergunta.add(new Pergunta(perg, a1, a2, a3, a4, a5));
        	
        }
        
		return (ArrayList<Pergunta>) listPergunta;
	}
	
	public ArrayList<Resposta> embaralhaAlternativas(List<Resposta> listPergunta){
		
		for (int i =0; i < listPergunta.size(); i++){
			Collections.shuffle(listPergunta.get(i).getAlternativas());
		}

		return (ArrayList<Resposta>) listPergunta;
	}

	/*
	 * 		QUESTIONARIO
	 */
	
	public void salvarArquivoQuestionario(List<Pergunta> listQuestionario) throws IOException{
		
		try{
			String perguntaCompleta = null;
			
			bw = new BufferedWriter(new FileWriter(buscarArquivoSalvar("prqt"), true)); 
			 
			for (int i = 0; i < listQuestionario.size(); i++) {

				
				perguntaCompleta = "<pergunta>"+listQuestionario.get(i).getEnunciado()
						+"<repostaCorreta>"+listQuestionario.get(i).getAlternativas().get(0).getAlternativa().toString()
						+"<falsa1>"+listQuestionario.get(i).getAlternativas().get(1).getAlternativa().toString()
						+"<falsa2>"+listQuestionario.get(i).getAlternativas().get(2).getAlternativa().toString()
						+"<falsa3>"+listQuestionario.get(i).getAlternativas().get(3).getAlternativa().toString()
						+"<falsa4>"+listQuestionario.get(i).getAlternativas().get(4).getAlternativa().toString()
						+"<falsa5>";
				bw.write(perguntaCompleta);
				bw.newLine();
			}

			bw.flush();
			bw.close(); 
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			
		}catch(Exception e){ 
			JOptionPane.showMessageDialog(null, "Exception Caught : " +e.getMessage());
		}finally{

		}
	} 

	public ArrayList<Pergunta> lerArquivoQuestionario() throws IOException{
	
		int inicio=0;
		int fim=0;
		String linha;
		String perg;
		String a1;
		String a2;
		String a3;
		String a4;
		String a5;
		List<Pergunta> listQuestionario = new ArrayList<Pergunta>();
			
		
		fr = new BufferedReader(new FileReader(buscarArquivoAbrir("prqt")));
		
	    while ((linha = fr.readLine()) != null) {
	
	    	fim = linha.indexOf("<repostaCorreta>");
	    	perg = linha.substring(10, fim);
	    	
	    	inicio = fim+16;
	    	fim = linha.indexOf("<falsa1>");
	    	a1 = linha.substring(inicio, fim);
	
	    	inicio = fim+8;
	    	fim = linha.indexOf("<falsa2>");
	    	a2 = linha.substring(inicio, fim);
	
	    	inicio = fim+8;
	    	fim = linha.indexOf("<falsa3>");
	    	a3 = linha.substring(inicio, fim);
	
	    	inicio = fim+8;
	    	fim = linha.indexOf("<falsa4>");
	    	a4 = linha.substring(inicio, fim);
	    	
	    	inicio = fim+8;
	    	fim = linha.indexOf("<falsa5>");
	    	a5 = linha.substring(inicio, fim);
	    	
	    	
	    	listQuestionario.add(new Pergunta(perg, a1, a2, a3, a4, a5));
	    	
	    }
	    
		return (ArrayList<Pergunta>) listQuestionario;
	}

}
