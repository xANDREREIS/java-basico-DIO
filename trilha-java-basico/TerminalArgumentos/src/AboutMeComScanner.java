import java.util.Locale;
import java.util.Scanner;

public class AboutMeComScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Meu nome: " + nome + " " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		
		scanner.close();
	}
}
