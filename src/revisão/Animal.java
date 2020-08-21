package revisão;

public class Animal {

	String nome;
	String raca;
	public Animal(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}