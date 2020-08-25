package br.com.problemsolving;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lucas Carvalho
 * https://www.hackerrank.com/challenges/plus-minus/problem?h_r=next-challenge&h_v=zen
 * 
 * */

public class PlusMinus {

	    
	private static final int MAX_NUMBER = 6;


	@Test
	public void plusMinusTestCase1() {
		
		/* 
         * Sample Input
         * -4 3 -9 0 4 1 
         * 
        */
		
		int[] arr = {-4, 3, -9, 0, 4, 1 };
		
		plusMinus( arr  );
		
		Assert.assertEquals(0, 0 );
	} 

	
	// Complete the plusMinus function below.
	/**
	 * here are 3 positive numbers,  2 negative numbers, and  1 zero in the array.
	 * The proportions of occurrence are positive: 3/6 = 0.500000 , negative: 2/6 = 0.333333  and zeros:1/6 = 0.166667 .
	 * */
	
    static void plusMinus(int[] arr) {
    	
    	double occurrencePositive = 0 ;
    	double occurrenceNegative = 0 ;
    	double occurrenceZero = 0 ;
    	double lengthArray = arr.length ;
    	
		for (int i : arr) {
			if (i > 0)
				occurrencePositive++;
			else if (i < 0)
				occurrenceNegative++;
			else
				occurrenceZero++;
		}

		BigDecimal occurrencePositiveFinal = new BigDecimal( occurrencePositive/lengthArray).setScale(MAX_NUMBER, RoundingMode.HALF_EVEN);
		BigDecimal occurrenceNegativeFinal = new BigDecimal( occurrenceNegative/lengthArray).setScale(MAX_NUMBER, RoundingMode.HALF_EVEN);
		BigDecimal occurrenceZeroFinal =  new BigDecimal( occurrenceZero/lengthArray).setScale(MAX_NUMBER, RoundingMode.HALF_EVEN); 
		 
        System.out.println( occurrencePositiveFinal );
		System.out.println( occurrenceNegativeFinal );
		System.out.println( occurrenceZeroFinal );
		
	}
    	
    	
    	
    	

    



	
}
