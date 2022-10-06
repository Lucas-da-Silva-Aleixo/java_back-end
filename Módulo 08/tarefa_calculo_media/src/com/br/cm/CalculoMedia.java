package com.br.cm;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1a Nota: ");
		float nota1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("2a Nota: ");
		float nota2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("3a Nota: ");
		float nota3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("4a Nota: ");
		float nota4 = Integer.parseInt(sc.nextLine());
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média é: " + media);

	}

}
