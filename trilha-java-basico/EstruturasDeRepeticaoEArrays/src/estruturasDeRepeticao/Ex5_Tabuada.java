package estruturasDeRepeticao;

import java.util.Scanner;

public class Ex5_Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite um numero entre 1 a 10 para ver a tabuada:");
		int numero = scanner.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "+" + i + " = " + (numero*i));
		}
		
		scanner.close();
	}
}
