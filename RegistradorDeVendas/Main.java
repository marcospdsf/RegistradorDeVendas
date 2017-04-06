package RegistrandoVenda;

public class Main {

	public static void main(String[] args) {

		// # 1º slide #
		
		// Criação do produto, vendedor e venda
		Produto pao = new Produto("1", "Arroz", 200, 100, false);
		Vendedor xico = new Vendedor("João", "João Pessoa - PB", "125");
		Venda vendaPao = new Venda();

		// Setando o produto e o vendedor na venda
		vendaPao.setProduto(pao);
		vendaPao.setVendedor(xico);
		vendaPao.setQuantidadeItens(2);// Informando qtd de itens (2)
		vendaPao.setDesconto(0);
		vendaPao.setValor(Venda.calcularValor(vendaPao.quantidadeItens, pao.valorVenda));

		// Impressão dos dados
		Venda.imprimir(vendaPao, Venda.calcularComissao(Vendedor.COMISSAO, vendaPao.valor, pao.promocao));

		// # 2º slide #

		// Criação do produto, vendedor e venda
		Produto escovaDente = new Produto("2", "Farofa", 100, 80, true);
		Vendedor nandinho = new Vendedor("Arnaldo", "João Pessoa - PB", "146");
		Venda vendaEscova = new Venda();

		// Setando o produto e o vendedor na venda
		vendaEscova.setProduto(escovaDente);
		vendaEscova.setVendedor(nandinho);
		vendaEscova.setQuantidadeItens(3); // Informando qtd de itens (3)
		vendaEscova.setDesconto(vendaEscova.efetuarDesconto(escovaDente.valorVenda * 0.1, escovaDente.valorVenda,
				escovaDente.valorCusto));// Add desconto de 10%
		vendaEscova.setValor(Venda.calcularValor(vendaEscova.quantidadeItens, vendaEscova.desconto));

		// Impressão dos dados
		Venda.imprimir(vendaEscova, Venda.calcularComissao(Vendedor.COMISSAO, vendaEscova.valor, escovaDente.promocao));

		// # 3º slide #

		// Criação da venda
		Venda vendaEscova2 = new Venda();
		
		// Setando o produto e o vendedor na venda (Vendedor e produto são os mesmos da venda anterior)
		vendaEscova2.setProduto(escovaDente);
		vendaEscova2.setVendedor(nandinho);
		vendaEscova2.setQuantidadeItens(2); // Informando qtd de itens (2)
		vendaEscova2.setDesconto(vendaEscova2.efetuarDesconto(escovaDente.valorVenda * 0.3, escovaDente.valorVenda,
				escovaDente.valorCusto));
		vendaEscova2.setValor(Venda.calcularValor(vendaEscova2.quantidadeItens, vendaEscova2.desconto));

		// Impressão dos dados
		Venda.imprimir(vendaEscova2,
				Venda.calcularComissao(Vendedor.COMISSAO, vendaEscova2.valor, escovaDente.promocao));

	}

}
