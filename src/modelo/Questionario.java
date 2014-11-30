package modelo;

import javax.swing.*;

import java.io.*;
import java.util.ArrayList;
import java.io.File;
import java.util.*;

public class Questionario {

	private int tempoRespostaEmSeg;
	private String nomeAutor;
	private String nomeQuestionario;
	private Date data;
	private List<Pergunta> perguntas = new ArrayList<Pergunta>();

	public Questionario() {
	}
	public int getTempoRespostaEmSeg(){
		return this.tempoRespostaEmSeg;
	}
	public void setTempoRespostaEmSeg(int value){
		this.tempoRespostaEmSeg = value;
	}	
	public String getNomeAutor(){
		return this.nomeAutor;
	}
	public void setNomeAutor(String value){
		this.nomeAutor = value;
	}
	public String getNomeQuestionario(){
		return this.nomeQuestionario;
	}
	public void setNomeQuestionario(String value){
		this.nomeQuestionario = value;
	}			
	public Date getdata(){
		return this.data;
	}
	public void setdata(Date value){
		data = value;
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
