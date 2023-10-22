import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual sua idade? ");
		int idade = entrada.nextInt();

		System.out.print("Qual seu peso? ");
		float peso = entrada.nextFloat();

		System.out.print("Digite m para masculino e f para feminino. ");
		String genero = entrada.next();

		System.out.print("Quantas vezes voce doou sangue no último ano? ");
		int nDoacoes = entrada.nextInt();

		if(idade >= 18 && idade <=67 && peso > 45) {
			if(genero.equalsIgnoreCase("m")) {
				if( nDoacoes < 4 ) {
					System.out.println("Pode doar sangue");
					entrada.close();
				} else {
					System.out.println("Não pode doar sangue");
					entrada.close();
				}} 
			if(genero.equalsIgnoreCase("f")) {
				if( nDoacoes < 3 ) {
					System.out.println("Pode doar sangue");
					entrada.close();
				} else {
					System.out.println("Não pode doar sangue");
					entrada.close();
				}
			} 
		} else {
			System.out.println("Não pode doar sangue");
			entrada.close();
		}
	}
}
