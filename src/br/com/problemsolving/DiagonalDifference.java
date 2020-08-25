package br.com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lucas Carvalho
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 * 
 * */

public class DiagonalDifference {

	public List<List<Integer>> TesteCase1()  {
	  
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		
    	/* 
         * Sample Input
         * 
         * 3 
         * 11 2  4
         * 4  5  6
         * 10 8 -12
         * 
        */
        
        List<Integer> matrix1 = Arrays.asList( 11,2,4);
        List<Integer> matrix2 = Arrays.asList( 4,5,6);
        List<Integer> matrix3 = Arrays.asList( 10,8,-12);
        
        arr.add( matrix1 );
        arr.add( matrix2 );
        arr.add( matrix3 );
		return arr;
    }
	
	public List<List<Integer>> TesteCase2()  {
		  
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		
    	/* 
         * Sample Input
         * 
         *  -1 1 -7 -8
         *  -10 -8 -5 -2
         *   0 9 7 -1
         *   4 4 -2 1
         * 
        */
        
        List<Integer> matrix1 = Arrays.asList( -1,   1, -7, -8 );
        List<Integer> matrix2 = Arrays.asList( -10, -8, -5, -2);
        List<Integer> matrix3 = Arrays.asList(  0,   9,  7, -1);
        List<Integer> matrix4 = Arrays.asList(  4,   4, -2,  1);
        
        arr.add( matrix1 );
        arr.add( matrix2 );
        arr.add( matrix3 );
        arr.add( matrix4 );
        
		return arr;
    }

	    
	@Test
	public void diagonalDifference1() {
		
		/** Sum across the secondary diagonal: 4 + 5 + 10 = 19
		 *  Sum across the primary   diagonal: 11 + 5 - 12 = 4
		 *  Difference: |4 - 19| = 15 **/
		
		int  expected  = 15;
		int  actual = DiagonalDifference.diagonalDifference( TesteCase1() );
		
		Assert.assertEquals(expected, actual);
		
	} 

	
	@Test
	public void diagonalDifference2() {
		
		int  expected  = 1;
		int  actual = DiagonalDifference.diagonalDifference( TesteCase2() );
		
		Assert.assertEquals(expected, actual);
		
	} 
	
	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
	
	public static int diagonalDifference(List<List<Integer>> arr) {

		int sumPrimaryDiagonal = 0;
		int sumSecondaryDiagonal = 0;

		int sizePrimaryDiagonal = 0;
		int sizeSecondaryDiagonal = arr.size();

		for (List<Integer> list : arr) {
			sizeSecondaryDiagonal--;
			sumPrimaryDiagonal += list.get(sizePrimaryDiagonal);
			sumSecondaryDiagonal += list.get(sizeSecondaryDiagonal);
			sizePrimaryDiagonal++;
			continue;
		}
		return sumPrimaryDiagonal > sumSecondaryDiagonal ? (sumPrimaryDiagonal - sumSecondaryDiagonal) : (sumSecondaryDiagonal - sumPrimaryDiagonal);
	}

	
}
