package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Resolucao {

	private int tempoTotalRespostaEmSeg;
	private String nomeAutor;
	private String emailAutor;
	private Date data;
	
	
	public Resolucao() {
		// TODO Auto-generated constructor stub
	}
	public int getTempoTotalRespostaEmSeg(){
		return this.tempoTotalRespostaEmSeg;
	}
	public void setTempoTotalRespostaEmSeg(int value){
		this.tempoTotalRespostaEmSeg = value;
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
	
	// ---> Métodos <--- \\
	
	public void responderQuestionario(){
	}
	
	public boolean salvarArqResposta(){
		
		File arquivo = new File("Resolucao.txt");  // Chamou e nomeou o arquivo txt.  
        FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(arquivo);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  // Perceba que estamos instanciando uma classe aqui. A FileOutputStream. Pesquise sobre ela!  
        String texto = "Gravando um arquivo";    
        try {
			fos.write(texto.getBytes());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}    
        texto = "\nGravando outra linha";    
        try {
			fos.write(texto.getBytes());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}    
        try {
			fos.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  // Fecha o arquivo. Nunca esquecer disso.  
   
        // Lendo do arquivo    
        arquivo = new File("Resolucao.txt");    
        FileInputStream fis = null;
		try {
			fis = new FileInputStream(arquivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //Parecido com o FileOutputStream. Pesquise também!  
   
        int ln;    
        try {
			while ( (ln = fis.read()) != -1 ) {   // Rotina de leitura das linhas do arquivo txt.  
			   System.out.print( (char)ln );    
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    
   
        try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Fecha o arquivo. Nunca esquecer disso!  
		
		return true;
	}
	
}
