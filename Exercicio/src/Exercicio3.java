import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int i = 0;
        int soma = 0;
        int num;
        
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite um numero: ");
            num = entrada.nextInt();

            if (num > 0 && num <= 100) {
            	 vetor[i] = num;
            	 
                 if (vetor[i] % 2 == 0) {
                     soma = soma + vetor[i];
                 }
                 
                 i++;
            } else {
            	System.out.println("Número inválido");
            }
        } while (num != 0 && i < 10);

        entrada.close();

        System.out.print("Números armazenados:");
        for (int k = 0; k < i; k++) {
            System.out.print(" " + vetor[k] + ";");
        }
        System.out.println("\nSoma dos números pares: " + soma);

    }
}





