package atv2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		pessoa novaPessoa = new pessoa();
		String continua = "s";
		int cont = 0;
		
		while(continua.equals("s")) { 
			novaPessoa.setName(novaPessoa.nome(entrada), cont);
			novaPessoa.setSalary(novaPessoa.salario(entrada), cont);
			
			System.out.println("deseja cadastrar outro funcionario? (s|n)");
			continua = entrada.nextLine();
			
			cont++;
		}
		
		System.out.println("funcionarios cadastradas");
		
		for(int i = 0; i<cont; i++) {
			System.out.println("Funcionario [nome=" + novaPessoa.getName(i) + ", salario=" + novaPessoa.getSalary(i) + "]");
		}
		
		System.out.println("soma de todos os salarios: " + novaPessoa.soma(cont));
		
	}
}