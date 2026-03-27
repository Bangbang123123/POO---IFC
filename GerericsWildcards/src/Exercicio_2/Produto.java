package Exercicio_2;

import java.util.Date;

public class Produto<T> {
	// Attributes
    private T id;
    private double valor;
    private Date dataFabricacao;
    private Date dataVencimento;

    // Constructor
    public Produto(T id, double valor, Date dataFabricacao, Date dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    // Getters
    public T getId() {
        return id;
    }
    public double getValor() {
        return valor;
    }
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}

	// Setters
	public void setId(T id) {
		this.id = id;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
    
}
