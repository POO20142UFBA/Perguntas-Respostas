package contole;

import java.util.ArrayList;
import java.util.*;

public class Pergunta {
	private String enunciado;
	private String tema;
	private String nomeAutor;
	private List<Alternativa> alternativas = new ArrayList<Alternativa>();
	private Date data = new Date();

	public String getEnunciado(){
		return this.enunciado;
	}
	public void setEnunciado(String value){
		this.enunciado = value;
	}	
	public String getTema(){
		return this.tema;
	}
	public void setTema(String value){
		this.tema = value;
	}		
	public String getNomeAutor(){
		return this.nomeAutor;
	}
	public void setNomeAutor(String value){
		this.nomeAutor = value;
	}			
	public Date getdata(){
		return this.data;
	}
	public void setdata(Date value){
		data = value;
	}
		
/* Falta get e set alternativas. */
	
// ---> Métodos <--- \\	
	
	public Pergunta() {
	}

	public boolean criarArqPerguntas(){
		
		return true;
	}

	public Pergunta abrirArqPergunta(){
		
		Pergunta pergunta = new Pergunta();
		return pergunta;
	}

	public boolean salvarArqPergunta(){
		
		return true;
	}

	public boolean addPergunta(){
		
		return true;
	}
}
