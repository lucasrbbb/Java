import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		//construcao veiculos
		Veiculo CarroEsportivo = new Veiculo(
				"esportivo",
			    new BigDecimal("1.00"),
			    Combustivel.GASOLINA,
			    new BigDecimal("80.00"),
			    new BigDecimal("0.00"),
			    new BigDecimal("120.00"),
			    new BigDecimal("10.00"),
			    new BigDecimal("5.00"),
			    new BigDecimal("2000.00")
			);
		
		Veiculo CarroSedan = new Veiculo(
				"sedan",
			    new BigDecimal("1.00"),
			    Combustivel.GASOLINA,
			    new BigDecimal("120.00"),
			    new BigDecimal("0.00"),
			    new BigDecimal("100.00"),
			    new BigDecimal("25.00"),
			    new BigDecimal("10.00"),
			    new BigDecimal("1000.00")
			);
		
		// solicitacao de dados
		
		int opcaoCarro;
		
		do {
			
			//tela1
			
			String mensagem = "Escolha um carro?(1=Esportivo | 2=Sedan | 3= Sair";
			String opcaoTextualCarro = JOptionPane.showInputDialog(mensagem);
			opcaoCarro = Integer.parseInt(opcaoTextualCarro);
			
			//tela2
		
			if (opcaoCarro == 1 || opcaoCarro == 2) {
				String mensagemOpcao = "Escolha uma opcao?(1=abastecer | 2=andar | 3= arrumar)";
				String opcaoTextual = JOptionPane.showInputDialog(mensagemOpcao);
				int opcao = Integer.parseInt(opcaoTextual);
				
				
				if(opcao == 1) {
					//abastecer
					
					String litrosTextual = JOptionPane.showInputDialog("Quantos Litros?");
					int litro = Integer.parseInt(litrosTextual);
					
					String tipoCombustivelTextual = JOptionPane.showInputDialog("Qual combustível?(1=Gasolina | 2=Alcool | 3= Diesel)");
					int tipoCombustivel = Integer.parseInt(tipoCombustivelTextual);
					
					//cria para armazenar resposta
					
					Combustivel nomeCombustivel = null;
					
					if(tipoCombustivel == 1) {
						nomeCombustivel = Combustivel.GASOLINA;
					}
					else if (tipoCombustivel == 2) {
						nomeCombustivel = Combustivel.ALCOOL;
					}
					else if (tipoCombustivel == 3) {
						nomeCombustivel = Combustivel.DIESEL;
					}
					
					if(opcaoCarro == 1) {
						CarroEsportivo.abastecer(new BigDecimal(litro), nomeCombustivel);
					} else {
						CarroSedan.abastecer(new BigDecimal(litro), nomeCombustivel);
					}
					
				} 
				else if (opcao == 2) {
					String distanciaTextual = JOptionPane.showInputDialog("Distância em Km?");
					int distancia = Integer.parseInt(distanciaTextual);
					
					String velocidadeTextual = JOptionPane.showInputDialog("Distância em Km/h?");
					int velocidade = Integer.parseInt(velocidadeTextual);
					
					if(opcaoCarro == 1) {
						CarroEsportivo.andar(new BigDecimal(distancia), new BigDecimal(velocidade));
					} else {
						CarroSedan.andar(new BigDecimal(distancia), new BigDecimal(velocidade));
					}
					
				}
				else if (opcao == 3) {
					if(opcaoCarro == 1) {
						CarroEsportivo.arrumarFreios();
					} else {
						CarroSedan.arrumarFreios();
					}
				}
			}
		
		} while(opcaoCarro != 3);
		
		
	}
}
