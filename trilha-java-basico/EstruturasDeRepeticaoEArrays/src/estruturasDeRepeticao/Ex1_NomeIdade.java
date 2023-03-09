package estruturasDeRepeticao;

import java.util.Scanner;

public class Ex1_NomeIdade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		int idade;
		
		System.out.println("Caso queira sair, basta digitar 0 no nome.");
		
		while(true){
			System.out.println("Digite o nome: ");
			nome = scanner.next();
			if(nome.equals("0")) break;
			
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
		}
		
		System.out.println("Voce saiu do loop.");

	}
}
