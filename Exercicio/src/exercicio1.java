import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Telefonou para a vítima? ");
		int n = entrada.nextInt();
		
		System.out.print("Esteve no local do crime?  ");
		int n2 = entrada.nextInt();
		
		System.out.print("Mora perto da vítima? ");
		int n3 = entrada.nextInt();
		
		System.out.print("Devia dinheiro para a vítima? ");
		int n4 = entrada.nextInt();
		
		System.out.print("Já trabalhou com a vítima? ");
		int n5 = entrada.nextInt();
		
		int soma = n + n2 + n3 + n4 + n5;
		
		if(soma == 2) {
			System.out.println("Suspeita");
			entrada.close();
		} else if(soma == 3 || soma == 4) {
			System.out.println("Cúmplice");
			entrada.close();
		} else if(soma == 5) {
			System.out.println("Assassino");
			entrada.close();
		} else {
			System.out.println("Inocente");
			entrada.close();
		}
		
	}
}
