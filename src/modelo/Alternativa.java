package modelo;

public class Alternativa {
	
	private String alternativa;
	private boolean ehCorreta = false;
	public Alternativa(){
	}
	public Alternativa(String a){
		setAlternativa(a);
	}
	public Alternativa(String a, boolean b){
		setAlternativa(a);
		setEhCorreta(b);
	}

	public String getAlternativa(){
		return this.alternativa;
	}
	public void setAlternativa(String value){
		this.alternativa = value;
	}
	
	public boolean getEhCorreta(){
		return ehCorreta;
	}
	public void setEhCorreta(boolean value){
		ehCorreta = value;
	}
	
	@Override
	public String toString() {
		
		return alternativa;
	}
}