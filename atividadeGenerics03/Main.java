package atividadeGenerics03;

public class Main {
	public static void main(String[] args) {
		
		Produto prod1 = new Produto(1, "Café");
		Produto prod2 = new Produto(2, "Arroz");
		Produto prod3 = new Produto(3, "Feijão");
		Produto prod4 = new Produto(4, "Macarrão");
		
		Pedido pedido = new Pedido();
		
		pedido.addVariosProduto(prod1, prod2, prod3, prod4);
		pedido.mostrarTodosProdutos();
		
		pedido.retiraUtilmoProduto();
		System.out.println("\n");
		pedido.mostrarTodosProdutos();
		
		pedido.retiraPrimeiroProduto();
		System.out.println("\n");
		pedido.mostrarTodosProdutos();
	}

}
