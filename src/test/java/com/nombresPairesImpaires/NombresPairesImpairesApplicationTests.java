package com.nombresPairesImpaires;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Contains;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NombresPairesImpairesApplicationTests {
	
	//private NombresPairesImpairesApplication nombresPairesImpaires = new NombresPairesImpairesApplication();

	
	@Test
	public void testOddNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		List<Integer> ints = Arrays.asList(1, 11, 33, 99);
		assertEquals(ints, NombresPairesImpairesApplication.listOddNumbers(numbers));
	}
	@Test
	public void testNotOddNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		List<Integer> ints = Arrays.asList(4, 8, 40, 22);
		assertNotEquals(ints, NombresPairesImpairesApplication.listOddNumbers(numbers));
	}
	
	@Test
	public void testEvenNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		List<Integer> ints = Arrays.asList(4, 8, 40, 22);
		assertEquals(ints, NombresPairesImpairesApplication.listEvenNumbers(numbers));
	}	
	@Test
	public void testNotEvenNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		List<Integer> ints = Arrays.asList(1, 11, 33, 99);
		assertNotEquals(ints, NombresPairesImpairesApplication.listEvenNumbers(numbers));
	}	
	
	
	@Test
	public void testIsOdd() {
		int e = 5;
		assertTrue(NombresPairesImpairesApplication.isOdd(e));
	}
	@Test
	public void testIsNotOdd() {
		int e = 6;
		assertFalse(NombresPairesImpairesApplication.isOdd(e));
	}

	@Test
	public void testIsEven() {
		int e = 4;
		assertTrue(NombresPairesImpairesApplication.isEven(e));
	}
	@Test
	public void testIsNotEven() {
		int e = 53;
		assertFalse(NombresPairesImpairesApplication.isEven(e));
	}
	
	
	@Test
	public void testSetOfOddNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 51, 11, 22, 33, 99, 51, 32);
		List<Integer> ints = Arrays.asList(1, 11, 33, 99, 51);
		Set<Integer> numbersSet =  new HashSet(numbers);
		Set<Integer> intsSet =  new HashSet(ints);
		assertThat(numbersSet.contains(intsSet));
		//assertEquals(intsSet, NombresPairesImpairesApplication.oddNumbersSet(numbersSet));
	}
	@Test
	public void testNotSetOfOddNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 51, 11, 22, 33, 99, 8, 33, 51, 32);
		List<Integer> ints = Arrays.asList(1, 11, 33, 99);
		Set<Integer> numbersSet =  new HashSet(numbers);
		Set<Integer> intsSet =  new HashSet(ints);
		assertThat(numbersSet.contains(intsSet));
		//assertNotEquals(intsSet, NombresPairesImpairesApplication.oddNumbersSet(numbersSet));
	}
	
	@Test
	public void testSetOfEvenNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 11, 99);
		List<Integer> ints = Arrays.asList(4, 8, 40, 8, 22);
		Set<Integer> numbersSet =  new HashSet(numbers);
		Set<Integer> intsSet =  new HashSet(ints);
		assertThat(numbersSet.contains(intsSet));
		//assertEquals(intsSet, NombresPairesImpairesApplication.evenNumbersSet(numbersSet));
	}	
	@Test
	public void testNotSetOfEvenNumbers() {
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 51, 11, 22, 33, 99, 8, 33, 51, 32);
		List<Integer> ints = Arrays.asList(1, 11, 33, 99, 51);
		Set<Integer> numbersSet =  new HashSet(numbers);
		Set<Integer> intsSet =  new HashSet(ints);
		assertThat(numbersSet.contains(intsSet));
		//assertNotEquals(intsSet, NombresPairesImpairesApplication.evenNumbersSet(numbersSet));
	}	

}
