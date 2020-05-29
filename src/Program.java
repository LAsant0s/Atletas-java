import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		char opcao;
		String nome; 
		double altura, peso;
		
		do {
			
			System.out.print("Nome: ");
			nome = sc.nextLine(); 
			
			System.out.print("Sexo: ");
			char sexo = sc.next().charAt(0); 
			while(sexo != 'F' && sexo != 'M') {
				System.out.print("Resposta inválida, tente novamente: " );
				sexo = sc.next().charAt(0); 
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble(); 
			while(altura < 0) {
				System.out.print("A altura não pode ser negativa. Tente novamente: ");
				altura = sc.nextDouble();  
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while(peso < 0) {
				System.out.print("O peso não pode ser negativo. Tente novamente: ");
				 peso = sc.nextDouble();  
			}
			
			System.out.print("Digitar outro atleta (S/N)?");
			opcao = sc.next().charAt(0);
			
			sc.nextLine();
		}while(opcao != 'N');

	}

}
