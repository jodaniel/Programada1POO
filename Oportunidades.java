public class Oportunidades extends Palabras{

	private final int numIntentos;
	
	public Oportunidades(){
		this.numIntentos = 7;
	}
	
	public int getNumIntentos(){
		
		return this.numIntentos;
	}
	
	public boolean hayMasIntentos(){
		
		boolean resultado = false;
		
		if(numIntentos > 0){
			resultado = true;
		}
		
		return resultado;
	}
	
	
		
