package arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numeros = new int [20];
		for (int i = 0; i < numeros.length; i++) {
			int numero = random.nextInt(100);
			numeros[i] = numero;
		}
		
		for (int i : numeros) {
			System.out.println("numero: " + i+" sucessor: "+ (i+1));
		}
	}
}
