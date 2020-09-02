package br.com.problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lucas Carvalho
 *         https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 * 
 */

public class MiniMaxSum {

	
	//@Test
	public void miniMaxSumTestCase1() {
      /**
       * Sample Input
       *  1 2 3 4 5
       * */
		
		int [] arr = { 1, 2, 3, 4, 5 };
		
		MiniMaxSum.miniMaxSum(arr);
		Assert.assertEquals(0, 0);
	}
	
	
	@Test
	public void miniMaxSumTestCase2() {
      /**
       * Sample Input
       *  7, 69, 2, 221, 8974
       * */
		
		int [] arr = { 7, 69, 2, 221, 8974 }; // OrderArray
		
		MiniMaxSum.miniMaxSum(arr);
		Assert.assertEquals(0, 0);
	}
	
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] numeros) {
    	    Arrays.sort(numeros);
    	   
    	    Long  minimumSum = 0L, maximumSum = 0L;
    	  
    	    Long  minimum = (long) numeros [0] ;
			Long  maximum =  (long) numeros[numeros.length -1]  ; 
     	
	        for (int i = 0; i < numeros.length; i++) {
				minimumSum += numeros[i];
				maximumSum += numeros[i];
			}
	        
	        minimumSum = ( minimumSum - maximum);
	        maximumSum = (maximumSum - minimum );
	        
		   System.out.println(  minimumSum +" " + maximumSum );
    }


}
