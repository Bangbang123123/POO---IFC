
public class Documento {
	private String texto;
	
	public Documento() {}
	public Documento(String texto) {
		setTexto(texto);
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTexto() {
		return texto;
	}
}
