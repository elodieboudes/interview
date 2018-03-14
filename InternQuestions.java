/*
 * Copyright (c) 2018, Synopsys, Inc. All rights reserved worldwide.
 */

/* @author: Elodie Boudes */

package Synopsys.questions;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;



/**
 * In 1 hour do the following tasks.
 *
 * For each of the tasks below, write test cases that do a good job of testing the code.  Test cases should be written
 * in the InternQuestionsTest class located in src/test/java.
 */
public class InternQuestions {

    /**
     * Write a method that takes a list of numbers as an input and returns the pairs of numbers that add up to 10.
     * For example, given the input 1, 2, 3, 4, 5, 6, 7 the output would be (3,7), (4,6)
     * @param numbers a list of numbers
     * @return returns a list of the pairs of numbers that add up to 10 from the input numbers
     */
    public List<?> sumOfPairs(List<Integer> numbers) {
        
    		int sum = 10; 
    		
    		
    		// Algo 
    		/* 
    		 * intialize return listpair [] 
    		 *  
    		 * for (int i = 0; numbers.length(); i++) 
    		 * 		for (int j = i+1; numbers.length(); j++)
    		 * 			if ( (i + j) == sum )
    		 * 				concatenate [listpair, pair]
    		 * 		
    		 * 	return listpair 
    		 */
    	
        return null;
    }

    /**
     * Write a method that tests whether a testString is a substring of the input string.
     *
     * NOTE: Do not use any special language built-ins
     *
     * @param input the input string to check
     * @param testString the test string
     * @return true if testString is a substring of input, false otherwise
     */
    public boolean isSubString(String input, String testString) {
    	
    		// assumption about perfect case match 
    		boolean result = false;   		
    		
    		int n = input.length();
    		int m = testString.length(); 
    		int i, j; 
    		
    		for ( i = 0; i < n; i++)
    		{
    			for ( j = 0; j < m && i + j < n; j++)
    			{
    				if (input.charAt(i+j) != testString.charAt(j)) 
    				{
    					break; 
    				}
    			}
    			if (j == m )
    				result = true; 
    		}
    		
    		
    		return result; 
    }

    /**
     * Write a method that returns true if the testString is a palindrome
     *
     * A palindrome is a string that is the same either forward or backwards.  For example, 'Anna' is a palindrome.
     * Note that the test for palindrome should be case insensitive.
     *
     * @param testString the string to test
     * @return true if the testString is a palindrome
     */
    public boolean isPalindrome(String testString) {
        
    		int i = 0;
    		int j = testString.length() -1 ; 
    		
    		String test = testString.toLowerCase();
	
    		while (i <= test.length() && j >= 0)
    		{
    			if (test.charAt(i) != test.charAt(j) )
    			{
    				return false; 
    			}
    			i++;
    			j--; 
    		}
    	
        return true;
    }

}
