import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class Veiculo {
	//composicao
	
	private String nome;
	private TanqueCombustivel tanqueCombustivel;
	private Freios freios;
	
	private BigDecimal quilometragem;
	private BigDecimal velocidadeLimite;
	private BigDecimal consumo1;
	private BigDecimal consumo2;
	
	
	//sets e gets
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getConsumo1() {
		return consumo1;
	}

	public void setConsumo1(BigDecimal consumo1) {
		this.consumo1 = consumo1;
	}

	public BigDecimal getConsumo2() {
		return consumo2;
	}

	public void setConsumo2(BigDecimal consumo2) {
		this.consumo2 = consumo2;
	}

	public BigDecimal getVelocidadeLimite() {
		return velocidadeLimite;
	}

	public void setVelocidadeLimite(BigDecimal velocidadeLimite) {
		this.velocidadeLimite = velocidadeLimite;
	}

	public BigDecimal getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(BigDecimal quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	
	//setar variaveis inicial
	
	public Veiculo(String nome, BigDecimal volumeAtual, 
			Combustivel combustivelUtilziado, 
			BigDecimal capacidadeMaxima, 
			BigDecimal quilometragem, 
			BigDecimal velocidadeLimite, 
			BigDecimal consumo1, 
			BigDecimal consumo2, 
			BigDecimal vidaUtilTotal) {
		setNome(nome);
		this.tanqueCombustivel = new TanqueCombustivel();
		this.freios = new Freios();
			
		tanqueCombustivel.setVolumeAtual(volumeAtual);
		tanqueCombustivel.setCombustivelUtilziado(combustivelUtilziado);
		tanqueCombustivel.setCapacidadeMaxima(capacidadeMaxima);
			
		setQuilometragem(quilometragem);
		setVelocidadeLimite(velocidadeLimite);
		setConsumo1(consumo1);
		setConsumo2(consumo2);
		
		freios.setVidaUtilTotal(vidaUtilTotal);
		freios.setVidaUtilRestante(vidaUtilTotal);
	}
		
	//funcoes
	
	public void andar(BigDecimal distancia, BigDecimal velocidade) {
		BigDecimal combustivelNecessario = BigDecimal.ZERO;
		
		 if(velocidade.compareTo(getVelocidadeLimite()) < 0) {
			 combustivelNecessario = distancia.divide(getConsumo1());
		 } else {
			 combustivelNecessario = distancia.divide(getConsumo2());
		 }
		 
		if(combustivelNecessario.compareTo(tanqueCombustivel.getVolumeAtual()) < 0) {
			tanqueCombustivel.consumir(combustivelNecessario);
			freios.usarFreios(distancia, velocidade);
				 
			System.out.println("Carro " + getNome() + " andou " + distancia + " Km a " + velocidade + " Km/h");
			System.out.println("Combustivel utilizado: "+ combustivelNecessario + " litros,  Combustivel restante " + tanqueCombustivel.getVolumeAtual() + " litros");
			System.out.println("Vida util dos freios: " + freios.getVidaUtilRestante() + " Km");
		 
		} else {
			//nao tem combustivel
			JOptionPane.showMessageDialog(null, "Não tem combustivel o suficiente" );
		}
		 
	}

	public void abastecer(BigDecimal quantidade, Combustivel combustivel) {
		BigDecimal soma = BigDecimal.ZERO;
		
		//soma
		if(combustivel == tanqueCombustivel.getCombustivelUtilziado()) {
			soma = tanqueCombustivel.getVolumeAtual().add(quantidade);
		} else {
			soma = quantidade;
		}
		
		//verifique limite do tanque
		if(soma.compareTo(tanqueCombustivel.getCapacidadeMaxima()) < 0) {
			tanqueCombustivel.receber(soma, combustivel);
			
			System.out.println("tanque abastecido com " + quantidade + " litros de "+ combustivel +" . Quantidade atual: "+ tanqueCombustivel.getVolumeAtual() +"  litros");
		} else {
			JOptionPane.showMessageDialog(null, "Tanque não suporta essa quantidade de combustivel" );
		}
	}
	
	public void arrumarFreios() {
		freios.arrumar();
	}
}
