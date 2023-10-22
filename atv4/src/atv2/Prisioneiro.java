package atv2;

public class Prisioneiro {
	private String nome;
	private Crime crime;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Crime getCrime() {
		return crime;
	}
	public void setCrime(Crime crime) {
		this.crime = crime;
	}
	
	public Prisioneiro(String nome, Crime crime) {
		setNome(nome);
		setCrime(crime);
	}
	

}