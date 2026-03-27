package Exercicio_1;

public class Item {
	// Attributes
	private String name;
	private String description;
	
	// Constructor
	public Item(String name,String description) {
		setName(name);
		setDescription(description);
	}
	
	// Getters
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
