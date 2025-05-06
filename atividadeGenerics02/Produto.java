package atividadeGenerics02;

public class Produto<K> {
	
	private K id;
	private double valor;
	private String dataFabricação;
	private String dataVencimento;
	
	
	public Produto(K id, double valor, String dataFabricação, String dataVencimento) {
		super();
		
	    if (!(id instanceof Integer || id instanceof String)) {
	        throw new IllegalArgumentException("ID deve ser do tipo Integer ou String.");
	    }

		this.id = id;
		this.valor = valor;
		this.dataFabricação = dataFabricação;
		this.dataVencimento = dataVencimento;
	}
	
	
	public K getId() {
		return id;
	}
	public void setId(K id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDataFabricação() {
		return dataFabricação;
	}
	public void setDataFabricação(String dataFabricação) {
		this.dataFabricação = dataFabricação;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricação=");
		builder.append(dataFabricação);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
	
}
