package loggi;

import loggi.Imprimir;

public class Pacotes {

	static String Pacotes[] = { 
			"888555555123888", "333333555584333", "222333555124000", "000111555874555", "111888555654777",
			"111333555123333", "555555555123888", "888333555584333", "111333555124000", "333888555584333",
			"555888555123000", "111888555123555", "888000555845333", "000111555874000", "111333555123555" };

	public static void main(String[] args) {
		// Pacotes = new String[]{"888333555999000"};
		
		// análise código a código
		for (int i = 0; i < Pacotes.length; i++) {
			String pacote = Pacotes[i];

			// primeira trinca
			String codigoRegiao = pacote.substring(0, 3);
			// segunda trinca
			String codigoDestino = pacote.substring(3, 6);
			// terceira trinca
			String codigoLoggi = pacote.substring(6, 9);
			// quarta trinca
			String codigoVendedor = pacote.substring(9, 12);
			// quinta trinca
			String codigoProduto = pacote.substring(12, 15);

			String regiao = buscaRegiao(codigoRegiao);
			String destino = buscaRegiao(codigoDestino);
			String produto = buscaProduto(codigoProduto);
			//String vendedor = buscaVendedor(codigoVendedor);

			System.out.println("Código: " + pacote);

			// valida cada campo do código
			if (destino == null) {
				System.out.println("Destino Inválido");
			} else if (regiao == null) {
				System.out.println("Região Inválida");
			} else if (produto == null) {
				System.out.println("A Loggi não trabalha com esse produto");
			} else if (codigoVendedor.equals("584")) {
				System.out.println("Vendedor inativo");
			} else {
				//**Print .txt
				String arq = "Programa de Estágio 2021 - Desafio técnico.txt";
				String texto = "==============================="
				+"\nRegião de origem: " + regiao
				+"\nRegião de destino: " + destino
				+"\nCódigo Loggi " + codigoLoggi
				+"\nCódigo do vendedor do produto: " + codigoVendedor
				+"\nTipo do produto: " + produto + "\n";
				if (regiao == "Sul" && produto == "Brinquedos") {
					texto = texto + "** Este pacote contém 'Brinquedos'";
				}
				if (Imprimir.Write(arq,texto))
					System.out.println("Arquivo salvo com sucesso!");
				else
					System.out.println("Erro ao salvar arquivo!");
			}
			System.out.println();
		}
			// Imprimindo o contador de vendas de cada vendedor
			String arq = "Programa de Estágio 2021 - Desafio técnico.txt";
			String texto = "O vendedor 123 vendeu: " //+ vendedor123
				+"\nO vendedor 874 vendeu: " //+ vendedor874
				+"\nO vendedor 845 vendeu: " //+ vendedor845
				+"\nO vendedor 124 vendeu: " //+ vendedor124
				+"\nO vendedor 654 vendeu: "; //+ vendedor654 ;
			Imprimir.Write(arq,texto);
		
}
	private static String buscaRegiao(String codigoDestino) {
		switch (codigoDestino) {
		case "111":
			return "Centro-Oeste";
		case "333":
			return "Nordeste";
		case "555":
			return "Norte";
		case "888":
			return "Sudeste";
		case "000":
			return "Sul";
		default:
			return null;
		}
	}
		private static String buscaProduto(String codigoProduto) {
		switch (codigoProduto) {
		case "000":
			return "Jóias";
		case "111":
			return "Livros";
		case "333":
			return "Eletrônicos";
		case "555":
			return "Bebidas";
		case "888":
			return "Brinquedos";
		default:
			return null;
		}
	}
		
		/*public static String buscaVendedor(String codigoVendedor) {
			int vendedor123 = 0 ;
			int vendedor874 = 0 ;
			int vendedor845 = 0 ;	
			int vendedor124 = 0 ;
			int vendedor654 = 0 ;

			switch (codigoVendedor) {
			case "123":
				vendedor123 = vendedor123 + 1;
				break;
			case "874":
				vendedor874 = vendedor874 + 1;
				break;
			case "845":
				vendedor845 = vendedor845 + 1;
				break;
			case "124":
				vendedor124 = vendedor124 + 1;
				break;
			case "654":
				vendedor654 = vendedor654 + 1;
				break;
			default:
				System.out.println();;
			}
		}
	*/
}

	