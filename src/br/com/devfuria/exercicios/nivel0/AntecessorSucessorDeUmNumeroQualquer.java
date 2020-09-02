package br.com.devfuria.exercicios.nivel0;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AntecessorSucessorDeUmNumeroQualquer {

	/**
	 * @author Lucas Carvalho
	 * http://devfuria.com.br/logica-de-programacao/o-dobro-de-um-numero-qualquer/
	 */
	
	
	/** 
     * Sample Input:
     * 
     * @return 5 
     **/
	
	@Test
	public void dobro_de_um_numero_qualquer_5_retorna_10() {
		Long input = 5L;
		Long output = 10L;
		Assert.assertEquals(output, calcularDoubro(input) );
		
	}

	private Long calcularDoubro(Long input) {
		return  input * 2;
	}
	
	@Test
	public void dobro_de_um_numero_qualquer_20000_retorna_10() {
		Long input = 20000L;
		Long output = 40000L;
		Assert.assertEquals(output, calcularDoubro(input) );
		
	}

}
