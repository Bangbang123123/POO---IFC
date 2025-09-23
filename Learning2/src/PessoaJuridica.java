
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	public PessoaJuridica(String nome,String cnpj) {
		super(nome);
		setCnpj(cnpj);
	}
	
	public String getCpf() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() > 10) {
			this.cnpj = cnpj;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
