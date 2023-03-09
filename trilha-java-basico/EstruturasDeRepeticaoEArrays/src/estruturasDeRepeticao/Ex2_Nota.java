package estruturasDeRepeticao;

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float nota;
		System.out.println("Digite uma nota entre 0 e 10: ");
		nota = scanner.nextFloat();
		
		while(nota < 0 || nota > 10 ) {
			System.out.println("Nota invalida");
			nota = scanner.nextFloat();
		}

		scanner.close();
	}
}
