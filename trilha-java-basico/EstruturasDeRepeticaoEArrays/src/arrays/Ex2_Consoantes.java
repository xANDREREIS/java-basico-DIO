package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_Consoantes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Lê o vetor de caracteres
		char[] vetor = new char[6];
		for (int i = 0; i < 6; i++) {
			System.out.print("Digite o caractere " + (i + 1) + ": ");
			vetor[i] = input.nextLine().charAt(0);
		}

		// Inicializa o contador de consoantes
		int consoantes = 0;

		// Verifica se cada caractere é uma consoante
		char[] consoantesEncontradas = new char[6];
		int index = 0;
		for (char caractere : vetor) {
			if (!Character.toString(caractere).matches("[aeiouAEIOU]")) {
				consoantes++;
				consoantesEncontradas[index] = caractere;
				index++;
			}
		}

		// Imprime a quantidade de consoantes e quais são elas
		System.out.println("Foram encontradas " + consoantes + " consoantes:");
		for (int i = 0; i < index; i++) {
			System.out.println(consoantesEncontradas[i]);
		}
	}
}
