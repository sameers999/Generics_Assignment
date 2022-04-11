package com.bridgelabz;

public class Generics {
	private static Generics PrintArray;
	public static void toPrint(Integer[] intArray) {
		for(int element:intArray) {
			System.out.printf("%s",element);
			
		}
		System.out.println();
	}
	public static void toPrint(double[] inputArray) {
		for(double element:inputArray) {
			System.out.printf("%s",element);
			
		}
		System.out.println();
	}
	public static void toPrint(Character[] inputArray) {
		for(char element: inputArray) {
			System.out.printf("%s",element);
			
		}
		System.out.println();
	}
	public static void main(String[]args) {
		Integer[] intArray = {1,2,3,4,5} ;
		double[] doubleArray = {1.1,2.2,3.3,4.4};
		char[] charArray = {'H','E','L','L','O','W','O','R','L','D'};
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		//PrintArray.toPrint(charArray);
		
		
		
	}
}

