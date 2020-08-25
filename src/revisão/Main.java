//Reinaldo De Araujo Sandim Neto RA:00096475
package revis�o;

import java.util.ArrayList;

public class Main {
	
	public static void main (String[] args) {
	//EX A	
		Cachorro dog1 = new Cachorro(null, null);
		dog1.setNome("Danilo");
		dog1.setRaca("pinscher");
		
		Gato ga1 = new Gato(null, null);
		ga1.setNome("Gustavo");
		ga1.setRaca("Persa");

	//EX B 	
	System.out.println(dog1.nome + " esta " + dog1.caminha());
	System.out.println(ga1.nome + " esta " + ga1.caminha());

	System.out.println("");
	//EX C e D	
	System.out.println(dog1.nome + " diz: " + dog1.late());
	System.out.println(ga1.nome + " diz: " + ga1.mia());
	//EX E
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
