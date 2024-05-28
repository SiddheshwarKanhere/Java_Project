package com.junit.calculater;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculaterTest {

	@Test
	void test() {
		Calculater calculater=new Calculater();
	
		
		
		int expectedresult=5;
		
		assertEquals(expectedresult, actualresult);
		
		
		
	}

}
