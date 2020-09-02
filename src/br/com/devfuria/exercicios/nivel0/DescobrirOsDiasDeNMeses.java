package br.com.devfuria.exercicios.nivel0;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DescobrirOsDiasDeNMeses {

	/**
	 * @author Lucas Carvalho
	 *  
	 */
	
	
	/** 
     * Sample Input: 5
     * Considerando que todos os meses tenham 30 dias, calcular o total de dias de n meses.
     **/
	
	@Test
	public void descobri_os_dias_de_n_meses_2_messes() {
		Long qtdMesses = 2L;
		Long out = 60L;
		Assert.assertEquals(out, descobriOsDiasDeNMesses( qtdMesses ));
		
	}
	
	@Test
	public void descobri_os_dias_de_n_meses_10_messes() {
		Long qtdMesses = 10L;
		Long out = 300L;
		Assert.assertEquals(out, descobriOsDiasDeNMesses( qtdMesses ));
		
	}

	private Long descobriOsDiasDeNMesses(long qtdMesses) {
	     Long quantidadeDeDiasDeUmMes = 30L; 
		return (quantidadeDeDiasDeUmMes * qtdMesses);
	}


}
