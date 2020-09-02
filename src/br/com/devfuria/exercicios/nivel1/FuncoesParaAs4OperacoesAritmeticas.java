package br.com.devfuria.exercicios.nivel1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FuncoesParaAs4OperacoesAritmeticas {

	/**
	 * @author Lucas Carvalho
	 *  http://devfuria.com.br/logica-de-programacao/operacoes-mat/
	 */
	
	/** 
     * Multiplicar, somar, dividir, subitrair:
     **/
	
	@Test
	public void somar() {
		FuncoesAritimatica soma = (numero1, numero2) -> { return (numero1 + numero2) ;};
		Assert.assertEquals(10, soma.calcular(5, 5));
	}

	@Test
	public void multiplicar() {
		FuncoesAritimatica multiplicar = (numero1, numero2) -> { return (numero1 * numero2) ;};
		Assert.assertEquals(20, multiplicar.calcular(2, 10));
	}
	
	@Test
	public void dividir() {
		FuncoesAritimatica dividir = (numero1, numero2) -> { return (numero1 / numero2) ;};
		Assert.assertEquals(50, dividir.calcular(100, 2));
	}
	
	@Test
	public void subitrair() {
		FuncoesAritimatica f = (numero1, numero2) -> { return (numero1 - numero2) ;};
		Assert.assertEquals(190, f.calcular(200, 10));
	}
}

interface FuncoesAritimatica {
	int calcular(int numero1, int numero2);
}