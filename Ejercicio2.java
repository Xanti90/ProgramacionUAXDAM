package Feedback3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] palabras = new String[10];
		
		for(int i = 0; i < palabras.length; i++) {
			
			System.out.println("Introduce una palabra: ");
			palabras[i] = sc.nextLine();
			
		}
		
		for(int i = 0; i < palabras.length; i++) {
			
			for(int j = 0; j < palabras.length; j++) {
				
				if(palabras[i].compareTo(palabras[j]) < 0) {
					
					String aux = palabras[i];
					palabras[i] = palabras[j];
					palabras[j] = aux;
					
				}
				
			}
			
		}
		
		for(int i = 0; i < palabras.length; i++) {
			
			System.out.println(palabras[i]);
			
		}
		
		for(int i = 0; i < palabras.length; i++) {
			
			for(int j = 0; j < palabras.length; j++) {
				
				if(palabras[i].length() < palabras[j].length()) {
					
					String aux = palabras[i];
					palabras[i] = palabras[j];
					palabras[j] = aux;
					
				}
				
			}
			
		}
		
		for(int i = 0; i < palabras.length; i++) {
			
			System.out.println(palabras[i]);
			
		}
		
		sc.close();

	}

}
