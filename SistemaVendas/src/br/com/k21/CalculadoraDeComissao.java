package br.com.k21;

public class CalculadoraDeComissao {
	public static Double calcula(Double valorVenda){
		
		double retorno;
		
		if (valorVenda <= 10000) {			
			retorno = valorVenda * 0.05;			
		} else {
			retorno = valorVenda * 0.06;
		}
				
		return Math.floor(retorno * 100) / 100.0;
			
		
	}
	
}
