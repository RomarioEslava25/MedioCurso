package main.pregunta5;

import java.util.Scanner;

public class DivisiblePor {
    public static void main(String[] args) {
		
		// Pedimos los número por teclado
		Scanner reader = new Scanner(System.in);
		int numero1,numero2;

		System.out.println("Introduce un número");
		numero1 = reader.nextInt();
		
		System.out.println("Introduce el número por el cual quieres saber si es divisible");
		numero2 = reader.nextInt();
		
		//Conprobamos si uno es divisible por otro
		if (numero1%numero2 == 0)
			System.out.println(numero1 + " es divisible por " + numero2);
		else
			System.out.println(numero1 + " NO es divisible por " + numero2);
		
		reader.close();
		
		
	}

}
