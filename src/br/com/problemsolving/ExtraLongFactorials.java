package br.com.problemsolving;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lucas Carvalho
 *https://www.hackerrank.com/challenges/extra-long-factorials/problem
 * 
 */

public class ExtraLongFactorials {

	@Test
	public void extrair_fatorial_do_numero_4_retorna_24() {
		Integer input = 4;
		BigInteger output   = BigInteger.valueOf(24);
		assertEquals( output, calcularFatorial( input) );	
	}
	
	@Test
	public void extrair_fatorial_do_numero_6_resultado_720() {
		Integer input = 6;
		BigInteger output   = BigInteger.valueOf(720);
		assertEquals( output, calcularFatorial( input) );
	}
	
	@Test
	public void extrair_fatorial_do_numero_7_resultado_5040() {
        int input    = 7;
        BigInteger output   = BigInteger.valueOf(5040);
		assertEquals( output, calcularFatorial( input) );			
	}
	
	@Test
	public void  extrair_fatorial_do_numero_25_resultado_15511210043330985984000000() {
        int input    = 25;
        BigInteger output  = new BigInteger("15511210043330985984000000");
		assertEquals( output, calcularFatorial( input) );			
	}
	
	@Test
	public void  extrair_fatorial_do_numero_0_resultado_0() {
        int input    = 0;
        BigInteger output  = new BigInteger("0");
		assertEquals( output, calcularFatorial( input) );			
	}
	
	@Test
	public void  extrair_fatorial_do_numero_1_resultado_1() {
        int input    = 1;
        BigInteger output  = new BigInteger("1");
		assertEquals( output, calcularFatorial( input) );			
	}

	@Test
	public void  extrair_fatorial_do_numero_100_resultado_100() {
        int input    = 100;
        BigInteger output  = new BigInteger("100");
		assertEquals( output, calcularFatorial( input) );			
	}


	private BigInteger calcularFatorial(int n) {
		if( n <= 1 || n > 100) return BigInteger.valueOf(n);
		BigInteger valor = BigInteger.ZERO;
		BigInteger proximoNumero = BigInteger.valueOf(n);
		BigInteger numero = BigInteger.valueOf(n);
		
		for (int i = 0; i < n ; n-- ) {
				proximoNumero = proximoNumero.subtract( BigInteger.ONE );
				
				if(valor ==  BigInteger.ZERO) { 
					valor = numero.multiply(proximoNumero); 
					continue;
				}if( n == 1 ) break;
				valor = valor.multiply(proximoNumero);  
		}
		
		return valor;
	}


}
