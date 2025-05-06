package atividadeGenerics01;

public class Generico<K> {
	
	private K value;
	
	public Generico(K value) {
		this.value = value;
	}
	
	public K getGenerico() {
		return this.value;
	}
	
	@Override
	public String toString() {
	    return "Generico [value=" + value + "]";
	}

}
