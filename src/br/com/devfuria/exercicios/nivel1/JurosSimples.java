package br.com.devfuria.exercicios.nivel1;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class JurosSimples {

	/**
	 * @author Lucas Carvalho
	 *  http://devfuria.com.br/logica-de-programacao/custo-de-fabricacao-de-um-carro/
	 */

	@Test
	public void base() {
		double capital = 16000D;
		double taxaEmprestimo = 0.04;
		double periodo =  4;

		double saidaEsperada = 2560;
        double saida  = new CalcularJurosSimple(capital, taxaEmprestimo, periodo).calcularJurosSimples() ;
        
		Assert.assertEquals(saidaEsperada, saida , 0 );
	}


}


class CalcularJurosSimple{
	
    private double  capital ;
    private double  taxaEmprestimo;
    private double  periodo ;
	
    public CalcularJurosSimple( double capital, double taxaEmprestimo, double periodo) {
		this.capital = capital;
		this.taxaEmprestimo = taxaEmprestimo;
		this.periodo = periodo;
	}

	public  Double calcularJurosSimples() {
		return capital * taxaEmprestimo * periodo;
	}
	
    
}








