package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraComissaoUnitTest {
	
	@Test
	public void testaValorMaximoFaixa1_10000() {
		Double comissaoEsperada = 500.0;
		Double valorVenda = 10000.0;
		Double valorCalculado = 0.0;
	    
		valorCalculado = CalculadoraDeComissao.calcula(valorVenda);
		
		assertEquals(comissaoEsperada, valorCalculado);
	}

	@Test
	public void testaValorFaixa1_1() {
		Double comissaoEsperada = 0.05;
		Double valorVenda = 1.0;
		Double valorCalculado = 0.0;
	    
		valorCalculado = CalculadoraDeComissao.calcula(valorVenda);
		
		assertEquals(comissaoEsperada, valorCalculado);
	}
	
	@Test
	public void testaValorFaixa1_55_59() {
		Double comissaoEsperada = 2.77;
		Double valorVenda = 55.59;
		Double valorCalculado = 0.0;
	    
		valorCalculado = CalculadoraDeComissao.calcula(valorVenda);
		
		assertEquals(comissaoEsperada, valorCalculado);
	}
}
