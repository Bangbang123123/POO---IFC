
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public void envelhecer(double anos) {
        if (idade + anos > 21) {
            crescer((idade + anos - 21) * 0.005);
        }
        idade += anos;
    }
    public void engordar(double quilos) {
        peso += quilos;
    }
    public void emagrecer(double quilos) {
        peso -= quilos;
        if (peso < 0) {
            peso = 0;
        }
    }
    public void crescer(double metros) {
        altura += metros;
    }
}
