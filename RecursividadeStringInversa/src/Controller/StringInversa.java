package Controller;

public class StringInversa {

	public StringInversa() {
		super();
	}
	
	public String inversor(String palavra, int tamanho) {
		
		if (tamanho == 0) {
			return "";
		} else {
			
			String letra = palavra.substring(0,1);
			tamanho = tamanho - 1;
			return inversor(palavra.substring(1), tamanho) + letra;
			
		}
	}
	
}
