package atv2;
import java.time.LocalDate;
import java.util.Scanner;

public class pessoa {
	private String[] name= new String[3];
	private LocalDate[] born= new LocalDate[3];


	public String getName(int i) {
		return name[i];
	}

	public void setName(String nome, int i) {
		this.name[i] = nome;
	}
	
	public LocalDate getBorn(int i) {
		return born[i];
	}

	public void setBorn(LocalDate born, int i) {
		this.born[i] = born;
	}
	
	public String nome(Scanner entrada) {

		System.out.println("digite o nome da pessoa");
		String s = entrada.nextLine();
		
		return s;
	}
	
	public LocalDate nascimento(Scanner entrada) {

        System.out.println("digite a data de nascimento da pessoa");
        
        String dataInput = entrada.nextLine();

        String[] partes = dataInput.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
     
        return dataNascimento;
	}
	
	public void comparacao() {
		int comparacao1 = getBorn(0).compareTo(getBorn(1));
		int comparacao2 = getBorn(0).compareTo(getBorn(2));
		int comparacao3 = getBorn(1).compareTo(getBorn(2));

		if (comparacao1 < 0 && comparacao2 < 0 ) {
		    System.out.println("pessoa mais velha: " + getName(0));
		    
		} else if (comparacao1 > 0 && comparacao3 < 0) {
		    System.out.println("pessoa mais velha: " + getName(1));
		    
		} else if (comparacao2 > 0 && comparacao3 > 0 && comparacao1 != 0) {
			System.out.println("pessoa mais velha: " + getName(2));
			
		} else if (comparacao1 == 0 && comparacao2 == 0 && comparacao3 == 0) {
			System.out.println("Todas as pessoas nasceram no mesmo dia");
			
		} else {
		    System.out.println("as datas de nascimento devem ser todas iguais ou todas diferentes");
		}
    }
}