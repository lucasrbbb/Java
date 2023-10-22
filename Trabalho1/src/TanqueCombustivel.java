import java.math.BigDecimal;

public class TanqueCombustivel {
	private BigDecimal capacidadeMaxima;
	private BigDecimal volumeAtual;
	private Combustivel combustivelUtilziado;
	
	//contrutor
	public TanqueCombustivel() {
		setVolumeAtual(BigDecimal.ZERO);
    }
	//sets e gets
	
	public BigDecimal getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(BigDecimal capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	public BigDecimal getVolumeAtual() {
		return volumeAtual;
	}
	public void setVolumeAtual(BigDecimal volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	
	public Combustivel getCombustivelUtilziado() {
		return combustivelUtilziado;
	}
	public void setCombustivelUtilziado(Combustivel combustivelUtilziado) {
		this.combustivelUtilziado = combustivelUtilziado;
	}
	
	//funcoes
	
	public void consumir(BigDecimal quantidade) {
        BigDecimal novoValor = getVolumeAtual().subtract(quantidade);
		
		setVolumeAtual(novoValor);
	}
	
	public void receber(BigDecimal quantidade, Combustivel combustivel) {
		setVolumeAtual(quantidade);
		setCombustivelUtilziado(combustivel);
	}
}
