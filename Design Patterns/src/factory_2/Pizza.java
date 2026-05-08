package factory_2;

import java.util.Arrays;

public class Pizza {
	private String base;
	private String[] ingredientes;
	private String borda;
	
	public Pizza() {}
	
	public String getBase() {
		return base;
	}
	public String[] getIngredientes() {
		return ingredientes;
	}
	public String getBorda() {
		return borda;
	}
	
	public void setBase(String base) {
		this.base = base;
	}
	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	public void setBorda(String borda) {
		this.borda = borda;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [base=");
		builder.append(base);
		builder.append(", ingredientes=");
		builder.append(Arrays.toString(ingredientes));
		builder.append(", borda=");
		builder.append(borda);
		builder.append("]");
		return builder.toString();
	}
}
