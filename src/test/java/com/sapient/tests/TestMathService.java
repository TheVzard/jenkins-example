package com.sapient.tests;
import com.sapient.mathservice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMathService {
	
	mathservice service;
	@BeforeEach
	 void init() {
		service = new mathservice();
		
	}
	
	@Test
	 void testForFib() {
			service = new mathservice();
			int actual = service.fib(5);
			int expected = 5;
			Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testForFactorial() {
			service = new mathservice();
			int actual = service.factorial(5);
			int expected = 120;
			Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testForPrime() {
			service = new mathservice();
			int actual = service.isPrime(5);
			int expected = 1;
			Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testForTwoPrime() {
			service = new mathservice();
			int[] actual = service.TwoPrime(5,12);
			int[] expected = {5,7,11};
			Assertions.assertArrayEquals(expected, actual);
	}
	
	@Test
	 void testForTwoPrimeNeg() {
			service = new mathservice();
			int[] actual = service.TwoPrime(-5,12);
			int[] expected = {2,3,5,7,11};
			Assertions.assertArrayEquals(expected, actual);
	}
	
	
	
	
}
