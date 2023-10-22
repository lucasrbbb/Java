package atv2;
import java.math.BigDecimal;
import java.util.Scanner;

public class pessoa {
	private String[] name= new String[10];
	private BigDecimal[] salary= new BigDecimal[10];


	public String getName(int i) {
		return name[i];
	}

	public void setName(String nome, int i) {
		this.name[i] = nome;
	}
	
	public BigDecimal getSalary(int i) {
		return salary[i];
	}

	public void setSalary(BigDecimal salary, int i) {
		this.salary[i] = salary;
	}

	public String nome(Scanner entrada) {

		System.out.println("digite o nome do funcionario");
		String n = entrada.nextLine();
		
		return n;
	}
	
	public BigDecimal salario(Scanner entrada) {

        System.out.println("digite o salario do funcionario");
        
        String sal = entrada.nextLine();
        
        BigDecimal salBigDecimal = new BigDecimal(sal);

        return salBigDecimal;
	}
	
	public BigDecimal soma(int cont) {
		BigDecimal soma = new BigDecimal(0);
		
		for(int i=0; i<cont; i++) {
			soma = soma.add(getSalary(i));
		}
		
		return soma;
	}
	
}