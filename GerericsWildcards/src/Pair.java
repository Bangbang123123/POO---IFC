
public class Pair<K,V> {
	// Attributes
	private K key;
	private V value;
	
	// Constructor
	public Pair(K key, V value) {
		setKey(key);
		setValue(value);
	}

	// Getters
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}

	// Setters
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}

	// To String
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pair [key=");
		builder.append(key);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
}
