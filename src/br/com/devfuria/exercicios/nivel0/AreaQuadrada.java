package br.com.devfuria.exercicios.nivel0;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AreaQuadrada {

	/**
	 * @author Lucas Carvalho
	 * http://devfuria.com.br/logica-de-programacao/antecessor-e-sucessor-de-um-numero-qualquer/
	 */
	
	
	/** 
     * Sample Input: 5
     * 
     * Antecessor e sucessor de um número qualquer
     **/
	
	@Test
	public void antecessor_e_sucessor_de_um_numero_qualquer_input_5() {
		Long inputNumero = 5L;
		Long [] outputAntecessorSucessor = {4L, 6L};
		Assert.assertArrayEquals( outputAntecessorSucessor, calcularAreaQuadrada(inputNumero) );
	}
	
	@Test
	public void antecessor_e_sucessor_de_um_numero_qualquer_input_50002() {
		Long inputNumero = 50002L;
		Long [] outputAntecessorSucessor = {50001L, 50003L};
		Assert.assertArrayEquals( outputAntecessorSucessor, calcularAreaQuadrada(inputNumero) );
	}
	
	@Test
	public void antecessor_e_sucessor_de_um_numero_qualquer_input_60002() {
		Long inputNumero = 60002L;
		Long [] outputAntecessorSucessor = {60001L, 60003L};
		Assert.assertArrayEquals( outputAntecessorSucessor, calcularAreaQuadrada(inputNumero) );
	}

	private Long []  calcularAreaQuadrada(Long inputNumero) {
		Long output [] = new Long[2];
		output[0] = (inputNumero - 1) ; //calcular antecessor
		output[1] = (inputNumero + 1); // calcular sucessor
		return output;
	}
	
	


	

}
