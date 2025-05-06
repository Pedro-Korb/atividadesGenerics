package atividadeGenerics04;

import java.util.ArrayList;

public class Mapa<T> {
	
	private ArrayList<Entry> entries;
	
	 private class Entry {
	     String key;
	     T value;
	
	     Entry(String key, T value) {
	         this.key = key;
	         this.value = value;
	     }
	 }
	
	 public Mapa() {
	     entries = new ArrayList<>();
	 }
	
	 public boolean add(String key, T value) {
	     for (Entry entry : entries) {
	         if (entry.key.equals(key)) {
	             return false;
	         }
	     }
	     entries.add(new Entry(key, value));
	     return true;
	 }
	
	 public String get(String key) {
	     for (Entry entry : entries) {
	         if (entry.key.equals(key)) {
	             return "Chave: " + entry.key + ", Valor: " + entry.value;
	         }
	     }
	     return "Chave não encontrada.";
	 }
}

