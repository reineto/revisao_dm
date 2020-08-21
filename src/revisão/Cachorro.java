package revisão;

public class Cachorro extends Animal{

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	public String late() {
		return "grrr";
	}
	public String caminha() {
		return "caminhando";
	}
	
}
