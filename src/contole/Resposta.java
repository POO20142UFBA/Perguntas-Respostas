package contole;

import java.util.Date;

public class Resposta {

	private int tempoTotalRespostaEmSeg;
	private String nomeAutor;
	private String emailAutor;
	private Date data;
	//private String NomeQuestionario; -> Pensando bem, acho que n�o precisa gravar o nome do question�rio vamos saber o nome pela instancia do Questionario.
	
	public Resposta() {
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
	
	// ---> M�todos <--- \\
	
	public void responderQuestionario(){
	}
	
	public boolean salvarArqResposta(){
		
		return true;
	}
	
}
