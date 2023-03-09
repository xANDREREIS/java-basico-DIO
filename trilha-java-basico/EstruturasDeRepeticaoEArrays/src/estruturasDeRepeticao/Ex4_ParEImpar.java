package estruturasDeRepeticao;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		int count = 0;
		int numero;
		int quantidadePar = 0;
		int quantidadeImpar = 0;

		System.out.println("Digite a quantidade de numeros: ");
		n = scanner.nextInt();
		
		do {
			System.out.println("Digite um numero: ");
			numero = scanner.nextInt();
			if (numero % 2 == 0)
				quantidadePar++;
			else
				quantidadeImpar++;
			
			count++;
		} while (count < n);

		System.out.println("Quantidade par: " + quantidadePar);
		System.out.println("Quantidade impar: " + quantidadeImpar);
		scanner.close();
	}
}
