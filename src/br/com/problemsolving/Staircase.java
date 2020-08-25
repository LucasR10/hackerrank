package br.com.problemsolving;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lucas Carvalho
 * https://www.hackerrank.com/challenges/staircase/problem?h_r=next-challenge&h_v=zen
 * 
 */

public class Staircase {

	@Test
	public void staircase() {

		Staircase.staircase(6);
		Assert.assertEquals(0, 0);
	}

	// Complete the plusMinus function below.
    /***
     * 
     *  Sample Input
     *  6
     * 
     * Sample Output
     * 
     *       #
	 *	    ##
	 *	   ###
	 *	  ####
	 *	 #####
	 *	######
     * */

	static void staircase(int numero) {
	 int qtdDeLinhas = 0;
	 
	 
		 while (numero > qtdDeLinhas) {
	    	 qtdDeLinhas++;
	    	
	    	 int numeroDePrints = qtdDeLinhas;
	    	 int numeroSpacoAdicionado = (numero - qtdDeLinhas); 
				
				while (numeroSpacoAdicionado > 0) {
					numeroSpacoAdicionado--;
					System.out.print(" ");
				}
		    	 
				while (numeroDePrints > 0) {
					numeroDePrints--;
					System.out.print("#");
				}
		    	 
	             System.out.println();//proxima linha
		}


		
	}


}
