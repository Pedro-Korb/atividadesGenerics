package atividadeGenerics02;

public class Main {
	public static void main(String[] args) {
		
		Produto cafe = new Produto(123454, 19.99, "20/10/2024", "20/10/2025");
		Produto leite = new Produto("12321321123", 9.99, "20/10/2024", "20/12/2024");
		
// 	    Tentando criar objeto com id double (vai dar erro)
//		Produto arroz = new Produto(3.6434, 29.99, "20/10/2024", "20/12/2025");
		
		System.out.println(cafe);
		System.out.println(leite);
		
		
		
		
	}

}
