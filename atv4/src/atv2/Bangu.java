package atv2;

public class Bangu {
	private int Capacidade;
	private int Presos = 0;

	public int getCapacidade() {
		return Capacidade;
	}

	public void setCapacidade(int capacidade) {
		Capacidade = capacidade;
	}
	
	public int getPresos() {
		return Presos;
	}

	public void setPresos(int presos) {
		Presos = presos;
	}

	public void hospedar(Prisioneiro prisioneiro) {
		if(getPresos() < getCapacidade()) {
			System.out.println("prisioneiro " + prisioneiro.getNome() + " - condenado por " + prisioneiro.getCrime() + " - preso no Bangu");
			setPresos(getPresos() + 1);
		} else {
            throw new RuntimeException("Bagu nao pode mais receber prisioneiros");
        }
	}
}
