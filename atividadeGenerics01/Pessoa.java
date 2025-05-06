package atividadeGenerics01;

public class Pessoa {
	
	private String nome;
	private String data_nascimento;
	private String sexo;
	private String endereco;
	
	
	public Pessoa(String nome, String data_nascimento, String sexo, String endereco) {
		super();
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", data_nascimento=");
		builder.append(data_nascimento);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
