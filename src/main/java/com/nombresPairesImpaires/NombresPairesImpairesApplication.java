package com.nombresPairesImpaires;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NombresPairesImpairesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NombresPairesImpairesApplication.class, args);
		
		// print if the number is odd or even
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Provide a number"); 
		 int num = scanner.nextInt();
		 String oddEven = (num % 2 == 0) ? "even" : "odd";
		 System.out.println("Provided number " + num + " is: " + oddEven);

		 
		// print odd and even numbers from a List
		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 51, 11, 22, 33, 99, 51, 32);
			 
		List<Integer> odds = listOddNumbers(numbers);
		System.out.println("Odd numbers list: " + odds); 
			
		List<Integer> evens = listEvenNumbers(numbers);
		System.out.println("Even numbers list: " + evens);
		
		
		// print if the number is odd or even
		for(int i: numbers) {
			if(isEven(i)) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");				
			}
		}
		
		
		// print odd and even numbers from an array
		Integer[] numbs = new Integer[numbers.size()];
		numbs = numbers.toArray(numbs);
		
		System.out.println("Odd numbers less than 40: ");
		oddNumbersTable(numbs);
		
		System.out.println("Even numbers less than 40: ");
		evenNumbersTable(numbs);
		
		
		// print odd and even numbers from a Set
		Set<Integer> numbersSet = new HashSet<>(numbers);
		Set<Integer> numbersSet2 = numbers.stream().distinct().
                collect(Collectors.toSet());
		
		Set<Integer> oddsSet = oddNumbersSet(numbersSet);
		System.out.println("Odd numbers Set: " + oddsSet); 
			
		Set<Integer> evensSet = evenNumbersSet(numbersSet);
		System.out.println("Even numbers Set: " + evensSet);
		
		System.out.println("set of Even and Odd numbers using stream:");
		
		Set<Integer> oddsSet2 = oddNumbersSet(numbersSet2);
		System.out.println("Odd numbers Set: " + oddsSet2); 
			
		Set<Integer> evensSet2 = evenNumbersSet(numbersSet2);
		System.out.println("Even numbers Set: " + evensSet2);
		
		scanner.close();
			 
	}
		
	// print odd and even numbers from a list
	public static List<Integer> listOddNumbers(List<Integer> numbers){
		List<Integer> oddNumbers = numbers.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());
		return oddNumbers;
	}
	public static List<Integer> listEvenNumbers(List<Integer> numbers){
		List<Integer> evenNumbers = numbers.stream().filter(o -> o % 2 == 0).collect(Collectors.toList());
		return evenNumbers;
	}
	
	
	// print if the number is odd or even
	public static boolean isOdd(Integer n) {
		return (n % 2 != 0) ? true : false;
	}

	public static boolean isEven(Integer n) {
		return (n % 2 == 0) ? true : false;
	}
	
	
	// print odd and even numbers from an array
	public static void oddNumbersTable(Integer[] numbers){
		Arrays.stream(numbers).filter(o -> o % 2 != 0 && o < 40).
        forEach(System.out::println);
	}
	public static void evenNumbersTable(Integer[] numbers){
		Arrays.stream(numbers).filter(o -> o % 2 == 0 && o < 40).
        forEach(System.out::println);
	}
	
	
	// print odd and even numbers from a Set
	public static Set<Integer> oddNumbersSet(Set<Integer> numbers){
		Set<Integer> oddNumbers = numbers.stream().
                filter(o -> o % 2 != 0).
                 collect(Collectors.toSet());
		return oddNumbers;
	}
	public static Set<Integer> evenNumbersSet(Set<Integer> numbers){
		Set<Integer> evenNumbers = numbers.stream().
                filter(o -> o % 2 == 0).
                 collect(Collectors.toSet());
		return evenNumbers;
	}
	
}
