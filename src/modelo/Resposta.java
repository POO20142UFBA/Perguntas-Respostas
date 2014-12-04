package modelo;

public class Resposta extends Pergunta {
	
	private int respostaAlternativa;
	
	
	public Resposta(String perg, String a1, String  a2,String  a3,String  a4,String  a5){
		super(perg, a1, a2, a3, a4, a5);
		this.respostaAlternativa = -1;
			}
	
	public int getrespostaAlternativa(){

		
		return this.respostaAlternativa;
	}
	public void setrespostaAlternativa(int value){
		this.respostaAlternativa = value;
	}		

}
