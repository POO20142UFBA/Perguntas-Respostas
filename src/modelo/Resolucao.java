package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Resolucao {

	private int tempoTotalResolucaoEmSeg;
	private String nomeAutor;
	private String emailAutor;
	private Date data;
	
	
	public Resolucao() {
		// TODO Auto-generated constructor stub
	}
	public int getTempoTotalResolucaoaEmSeg(){
		return this.tempoTotalResolucaoEmSeg;
	}
	public void setTempoTotalResolucaoEmSeg(int value){
		this.tempoTotalResolucaoEmSeg = value;
	}	
	public String getNomeAutor(){
		return this.nomeAutor;
	}
	public void setNomeAutor(String value){
		this.nomeAutor = value;
	}
	public String getEmailAutor(){
		return this.emailAutor;
	}
	public void setEmailAutor(String value){
		this.emailAutor = value;
	}
	public Date getdata(){
		return this.data;
	}
	public void setdata(Date value){
		data = value;
	}
	
	// ---> M�todos <--- \\
	
	public void responderQuestionario(){
	}
	
	public boolean salvarArqResolucao(){
		
		
		
		  
		
		return true;
	}
	
}
