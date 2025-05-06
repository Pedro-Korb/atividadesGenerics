package atividadeGenerics04;

public class Main {
    public static void main(String[] args) {
        Mapa<Integer> numeros = new Mapa<>();

        System.out.println(numeros.add("99", 1));
        System.out.println(numeros.add("11", 2));
        System.out.println(numeros.add("22", 11)); 

        System.out.println(numeros.get("99"));
        System.out.println(numeros.get("11"));
        System.out.println(numeros.get("22"));

        Mapa<String> palavras = new Mapa<>();
        palavras.add("hello", "mundo");
        palavras.add("foo", "bar");
        System.out.println(palavras.get("hello"));
        System.out.println(palavras.get("foo"));
    }
}


