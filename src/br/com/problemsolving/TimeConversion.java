package br.com.problemsolving;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lucas Carvalho
 *https://www.hackerrank.com/challenges/extra-long-factorials/problem
 * 
 */

public class TimeConversion {

	@Test 
	public void teste_07_05_45_PM() throws ParseException {
		String input    = "07:05:45PM";
		String output   = "19:05:45";
		assertEquals( output,  timeConversion(input) );	
	}
	

	     /*
	     * Write your code here.
	     * PM - Dia
	     * AM - Noite
	     */
		static String timeConversion(String s) throws ParseException {
			
			  SimpleDateFormat sdf ; if (s.contains("PM")) { sdf = new
			  SimpleDateFormat("hh:mm:ss"); Date time = sdf.parse(s);
			  
			  SimpleDateFormat newSdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			  System.out.println( newSdf.format(time)); return "";
			  
			  }
			  
			 
			
			
			return null;
		}


}
