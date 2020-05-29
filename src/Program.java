import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char opcao;
		String nome, maisAlto = "qualquer";
		int qntAtletas = 0;
		double altura, maiorAltura = 0, peso, pesoMedio;
		double somaPesos = 0; 
		double homens = 0; 
		double mulheres = 0; 
		double porcentagemHomens;
		double somaAltura = 0, alturaMedia; 

		do {

			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Sexo: ");
			char sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Resposta inválida, tente novamente: ");
				sexo = sc.next().charAt(0);
			}

			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura < 0) {
				System.out.print("A altura não pode ser negativa. Tente novamente: ");
				altura = sc.nextDouble();
			}

			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso < 0) {
				System.out.print("O peso não pode ser negativo. Tente novamente: ");
				peso = sc.nextDouble();
			}

			System.out.print("Digitar outro atleta (S/N)? ");
			opcao = sc.next().charAt(0);
			
			if(altura > maiorAltura) { //definir atleta mais alto
				maiorAltura = altura;
				maisAlto = nome; 
			}
			if(sexo == 'M') {
				homens++; 
			}
			if(sexo == 'F') {
				mulheres++;
				somaAltura += altura; 
			}
			somaPesos += peso;
			qntAtletas++; 
			
			sc.nextLine();
		} while (opcao != 'N');
		
		pesoMedio = somaPesos / qntAtletas; // calculo do peso
		
		porcentagemHomens = (homens/qntAtletas) * 100; //porcentagem de homens
		
		alturaMedia = somaAltura / mulheres; //altura media das mulheres
		
		System.out.println("");
		System.out.println("RELATORIO: ");
		System.out.printf("Peso medio dos atletas: %.2f\n", pesoMedio);
		System.out.println("Atleta mais alto: " + maisAlto);
		System.out.printf("Procentagem de homens: %.1f%%\n", porcentagemHomens);
		System.out.printf("Altura media das mulheres: %.2f\n", alturaMedia);
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");

	}

}
