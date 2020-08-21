package revisão;

import java.util.ArrayList;

public class Main {
	
	public static void main (String[] args) {
		
		Cachorro dog1 = new Cachorro(null, null);
		dog1.setNome("Danilo");
		dog1.setRaca("pinscher");
		
		Gato ga1 = new Gato(null, null);
		ga1.setNome("Gustavo");
		ga1.setRaca("Persa");
		
	System.out.println(dog1.nome + " esta " + dog1.caminha());
	System.out.println(ga1.nome + " esta " + ga1.caminha());

	System.out.println("");

	System.out.println(dog1.nome + " diz: " + dog1.late());
	System.out.println(ga1.nome + " diz: " + ga1.mia());
	
	ArrayList<Animal> array1 = new ArrayList<Animal>();
	array1.add(dog1);
	array1.add(ga1);
	
	for(Animal a:array1) {
		System.out.println(a.nome);
	}
	for(int i = 0; i< array1.size(); i++) {
		System.out.println(array1);
	}
	}
}
