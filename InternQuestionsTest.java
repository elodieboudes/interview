package Synopsys.questions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;  

import Synopsys.questions.*; 

class InternQuestionsTest {

	InternQuestions iq = new InternQuestions(); 
	
	@Test
	void testList() {
		


		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5); 
		list.add(6);list.add(7);list.add(8);list.add(9);list.add(10); 
		
		//assertEquals({1,2},iq.sumOfPairs(list));
		//iq.sumOfPairs(1,2,3,4,5,6,7,8,9,10);
		//assertTrue(iq.sumOfPairs({1,2,3,4,5,6,7,8,9,10})); 
	}
	
	@Test
	void testisSubString() {	
		
		assertTrue(iq.isSubString("abcd","a")); 	
		assertTrue(iq.isSubString("abcd","abcd")); 	
		assertTrue(iq.isSubString("abcdef","bcd")); 
		
		assertFalse(iq.isSubString("abcd","bd")); 		
		assertFalse(iq.isSubString("abc","abcdefgh")); 
		
		assertFalse(iq.isSubString("ABC", "abc"));
		assertFalse(iq.isSubString("ABC", "ab"));
		
	}
	
	@Test
	void testisPalindrome() {	
		
		assertTrue(iq.isPalindrome("anna"));
		assertFalse(iq.isPalindrome("annan"));
		
		assertTrue(iq.isPalindrome("aNnA"));
		assertFalse(iq.isPalindrome("aNNaN"));
		
		assertTrue(iq.isPalindrome("aBBcBBa"));
		assertFalse(iq.isPalindrome("aBBcBCBa"));
	}
}
