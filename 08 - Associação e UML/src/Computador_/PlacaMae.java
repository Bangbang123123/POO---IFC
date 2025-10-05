package Computador_;

public class PlacaMae {
	 private String marca;
	 private String modelo;
	 protected Processador processador;
	 protected Hd hd;
	 protected Memoria memoria;
	 
	 
	 public String getMarca() {
		 return marca;
	 }
	 public String getModelo() {
		 return modelo;
	 }
	 public Processador getProcessador() {
		 return processador;
	 }
	 public Hd getHd() {
		 return hd;
	 }
	 public Memoria getMemoria() {
		 return memoria;
	 }
	 public void setMarca(String marca) {
		 this.marca = marca;
	 }
	 public void setModelo(String modelo) {
		 this.modelo = modelo;
	 }
	 public void setProcessador(Processador processador) {
		 this.processador = processador;
	 }
	 public void setHd(Hd hd) {
		 this.hd = hd;
	 }
	 public void setMemoria(Memoria memoria) {
		 this.memoria = memoria;
	 }
	 
	 
	 @Override
	 public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlacaMae:\n[marca: ");
		builder.append(marca);
		builder.append("]\n[modelo: ");
		builder.append(modelo);
		builder.append("]\n[processador: ");
		builder.append(processador);
		builder.append("]\n[hd: ");
		builder.append(hd);
		builder.append("]\n[memoria: ");
		builder.append(memoria);
		builder.append("]");
		return builder.toString();
	 }
}
