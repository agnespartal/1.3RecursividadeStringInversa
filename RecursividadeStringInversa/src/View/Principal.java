package View;

import Controller.StringInversa;

public class Principal {

	public static void main(String[] args) {
		
		String palavra = "sim";
		int tamanho = palavra.length(); 
		
		StringInversa inversa = new StringInversa();
		String resultado = inversa.inversor(palavra, tamanho);
		System.out.println(resultado);
	}

}
