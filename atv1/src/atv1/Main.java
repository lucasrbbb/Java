package atv1;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		pessoa novaPessoa = new pessoa();
		String[] dataFormatada = new String[3];
		
		for(int i = 0; i<3; i++) {
			novaPessoa.setName(novaPessoa.nome(entrada), i);
			novaPessoa.setBorn(novaPessoa.nascimento(entrada), i);
		}
		
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for(int i = 0; i<3; i++) {
			
	        dataFormatada[i] = novaPessoa.getBorn(i).format(formatar);
		}
		
		System.out.println("pessoas cadastradas");
		for(int i = 0; i<3; i++) {
			System.out.println("Pessoa [nome=" + novaPessoa.getName(i) + ", dataNascimento=" + dataFormatada[i] + "]");
		}
	}
}
