package modelo;

import java.io.*;  
import java.util.*;

public class Pergunta {
	private String enunciado;
	private String alternativaCorreta;	
	private List<Alternativa> alternativasFalsas = new ArrayList<Alternativa>();
	

	public String getEnunciado(){
		return this.enunciado;
	}
	public void setEnunciado(String value){
		this.enunciado = value;
	}	
	
	public ArrayList<Alternativa> getAlternativas(){
		return (ArrayList<Alternativa>) alternativasFalsas;
	}

	public void setAlternativas(ArrayList<Alternativa> value){
		alternativasFalsas = value;
	}
	
	public String getAlternativaCorreta() {
		return alternativaCorreta;
	}
	public void setAlternativaCorreta(String alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
	
	public boolean addPergunta(){		
		  
		return true;
	}
}
