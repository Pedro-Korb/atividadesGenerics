package atividadeGenerics03;

public class Produto {
	
//	Uma classe de Pedido deve conter uma lista de Produtos e ter os métodos de adicionar e mostrar 
//	lista de Produtos. Mas os produtos desta lista só podem ser produtos que herdam características
//	da classe ProdutoX (classe que você irá criar e definir atributos mínimos ao seu critério). 
//	Crie a classe ProdutoX, Pedido e o Main demonstrando a utilização dos dois métodos de Pedido.
	
	private Integer idProduto;
	private String nomeProduto;
	
	
	public Produto(Integer idProduto, String nomeProduto) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [idProduto=");
		builder.append(idProduto);
		builder.append(", nomeProduto=");
		builder.append(nomeProduto);
		builder.append("]");
		return builder.toString();
	}
}
