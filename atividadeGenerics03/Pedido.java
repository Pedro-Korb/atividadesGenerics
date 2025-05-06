package atividadeGenerics03;

import java.util.ArrayList;

public class Pedido<T> {
	

	
	private ArrayList<T> listaProduto = new ArrayList<T>();

	public ArrayList<T> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(ArrayList<T> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
	public void addProduto(T produto) {
		listaProduto.add(produto);
	}
	
	public void addVariosProduto(T... produtos) {
		for (T prod : produtos) {
			listaProduto.add(prod);
		}
	}
	
	public void retiraUtilmoProduto() {
		if (listaProduto.size() > 0) 
			listaProduto.remove(listaProduto.size() - 1);
	}
	
	public void retiraPrimeiroProduto() {
		if (listaProduto.size() > 0) 
			listaProduto.remove(0);
	}
	
	public void mostrarTodosProdutos() {
		for (T t : this.listaProduto) {
			System.out.println(t);
		}
	}
	
	
	
	
	
	

}
