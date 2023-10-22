import java.math.BigDecimal;

public class Freios {
	private BigDecimal vidaUtilTotal;
	private BigDecimal vidaUtilRestante;
	
	//sets e gets
	
	public BigDecimal getVidaUtilTotal() {
		return vidaUtilTotal;
	}
	public void setVidaUtilTotal(BigDecimal vidaUtilTotal) {
		this.vidaUtilTotal = vidaUtilTotal;
	}
	public BigDecimal getVidaUtilRestante() {
		return vidaUtilRestante;
	}
	public void setVidaUtilRestante(BigDecimal vidaUtilRestante) {
		this.vidaUtilRestante = vidaUtilRestante;
	}
	
	//funcoes
	
	public void usarFreios(BigDecimal distancia, BigDecimal velocidade) {
		BigDecimal limiteVelocidade = new BigDecimal("99");

	    if (velocidade.compareTo(limiteVelocidade) < 0) {
	    	setVidaUtilRestante(getVidaUtilRestante().subtract(distancia));
	    } else {
	    	setVidaUtilRestante(getVidaUtilRestante().subtract(distancia).multiply(new BigDecimal("2")));
	    }
	}
	
	public void arrumar() {
		setVidaUtilRestante(getVidaUtilTotal());
	}
	
}
