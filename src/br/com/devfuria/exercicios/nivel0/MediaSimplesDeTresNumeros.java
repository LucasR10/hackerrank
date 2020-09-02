package br.com.devfuria.exercicios.nivel0;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MediaSimplesDeTresNumeros {

	/**
	 * @author Lucas Carvalho
	 *  http://devfuria.com.br/logica-de-programacao/media-simples-de-3-numeros/
	 */
	
	
	/** 
     * Sample Input:
     * 
     **/
	
	@Test
	public void calcular_media_simples_tres_numeros_teste_1() {
		Long numero1 = 6L , numero2 = 7L , numero3 = 8L;
		Long out = 7L;
		Assert.assertEquals(out, calcularMediaSimplesTresNumero(numero1, numero2, numero3) );
	}

	
	@Test
	public void calcular_media_simples_tres_numeros_teste_2() {
		Long numero1 = 10L , numero2 = 30L , numero3 = 50L;
		Long out = 30L;
		Assert.assertEquals(out, calcularMediaSimplesTresNumero(numero1, numero2, numero3) );
	}
	
	private Long calcularMediaSimplesTresNumero(long numero1, long numero2, long numero3) {
	  return (numero1 + numero2 + numero3)/3;
	}


}
