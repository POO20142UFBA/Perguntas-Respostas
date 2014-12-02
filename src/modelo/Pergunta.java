package modelo;

import java.util.*;

public class Pergunta {
	private String enunciado;
	private List<Alternativa> alternativas = new ArrayList<Alternativa>();
	
	public Pergunta(){
		
	}
	public Pergunta(String perg,String a1,String  a2,String  a3,String  a4,String  a5){
		setEnunciado(perg);
		Alternativa alternativa1 = new Alternativa(a1,true);
		alternativas.add(alternativa1);
		
		Alternativa alternativa2 = new Alternativa(a2);
		alternativas.add(alternativa2);		
		
		Alternativa alternativa3 = new Alternativa(a3);
		alternativas.add(alternativa3);
		
		Alternativa alternativa4 = new Alternativa(a4);
		alternativas.add(alternativa4);
		
		Alternativa alternativa5 = new Alternativa(a5);
		alternativas.add(alternativa5);
	}
	public String getEnunciado(){
		return this.enunciado;
	}
	public void setEnunciado(String value){
		this.enunciado = value;
	}	
	
	public ArrayList<Alternativa> getAlternativas(){
		return (ArrayList<Alternativa>) alternativas;
	}

	public void setAlternativas(ArrayList<Alternativa> value){
		alternativas = value;
	}
	
	
	public boolean addPergunta(){		
		  
		return true;
	}
	
	
}
