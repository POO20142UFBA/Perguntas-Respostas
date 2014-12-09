package modelo;
import java.util.ArrayList;
import java.util.*;

public class Questionario {
	private List<Pergunta> perguntas;

	public Questionario() {
	
	}
	public Questionario(Pergunta value) {
		perguntas.add(value);
	}
	
	public ArrayList<Pergunta> getPerguntas(){
		return (ArrayList<Pergunta>) perguntas;
	}

	public void setPerguntas(ArrayList<Pergunta> value){
		perguntas = value;
	}

	// ---> Métodos <--- \\

	public boolean criarArqQuestionario(){	
		return true;
	}

	public Questionario abrirArqQuestionario(){
		Questionario questionario = new Questionario();
		return questionario;
	}

	public boolean selecionarPerguntaAleatoria(){
		return true;
	}

	public boolean selecionarPerguntaManualmente(){
		return true;
	}
	
	public boolean salvarArqQuestionario(){
		return true;
	}

}
