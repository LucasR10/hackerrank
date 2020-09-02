package br.com.devfuria.exercicios.nivel1;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CustoFabricacaoDeUmCarro {
	
		/**
		 * @author Lucas Carvalho
		 *  http://devfuria.com.br/logica-de-programacao/custo-de-fabricacao-de-um-carro/
		 */
	@Test
	public void base() {
		Carro calcularPercentual = new Carro(10_000D, 0.28D, 0.45D);
		double custoFabrica = 17300.0D;
		Assert.assertEquals(custoFabrica, calcularPercentual.calcularCustoFinal(), 0);
	}


}

class Carro {

	private double percentualDoDistribuidor;
	private double custoDeFabrica;
	private double percentualDeImpostos;
	
	@SuppressWarnings("unused")
	private Carro() {}
	
	public Carro(double custoDeFabrica , double percentualDoDistribuidor, double percentualDeImpostos) {
		this.percentualDoDistribuidor = percentualDoDistribuidor;
		this.custoDeFabrica = custoDeFabrica;
		this.percentualDeImpostos = percentualDeImpostos;
	}



	public double calcularCustoFinal(){
		return  calcularCustoFabricacao();
	}

	private double calcularCustoFabricacao() {
		return custoDeFabrica + percentualImpostos() + percentualDistribuidor();
	}

	private double percentualDistribuidor() {
		return custoDeFabrica * percentualDoDistribuidor;
	}

	private double percentualImpostos() {
		return custoDeFabrica * percentualDeImpostos;
	}

}