
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa() {}
    public Pessoa(String nome, int idade, double peso, double altura) {
    	setNome(nome);
    	setIdade(idade);
    	setPeso(peso);
    	setAltura(altura);
    }
    public Pessoa(String nome) {
    	setNome(nome);
    	setIdade(30);
    	setPeso(74);
    	setAltura(1.8);
    }
    

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
        if (idade >= 21) {
        	idade += anos;
        } else if (idade + anos >= 21) {
        	crescer((21 - idade) * 0.005);
        	idade += anos;
        } else {
        	idade += anos;
        	crescer(anos * 0.005);
        }  
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
