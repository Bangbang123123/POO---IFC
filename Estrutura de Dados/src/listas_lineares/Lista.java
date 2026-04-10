package listas_lineares;

public class Lista {
	private Nodo nodo_start;
	
	public Nodo getNodoStart() {
		return this.nodo_start;
	}
	
	public Lista() {}
	public Lista(Nodo nodo_start) {
		this.nodo_start = nodo_start;
	}
	
	public Nodo get(int index) {
		Nodo nodo_target = nodo_start;
		if (index >= 0 && size() != 0 && nodo_target != null) {
			for (int i = 0; i < index; i++) {
				nodo_target = nodo_target.getProx();
			}
			
			return nodo_target;
		} else {
			return null;
		}
	}
	
	public void set(int index, int dado) {
		Nodo nodo_target = get(index);
		nodo_target.setDado(dado);
	}
	
	public int size() {
		if (nodo_start != null) {
			Nodo final_nodo = nodo_start;
			int nodo_count = 0;
			while (final_nodo != null) {
				nodo_count++;
				final_nodo = final_nodo.getProx();
			}
			return nodo_count;
		}
		return 0;
	}
	
	public void add(Nodo new_nodo) {
		Nodo final_nodo = get(size()-1);
		if (final_nodo == null) {
			nodo_start = new_nodo;
		} else {
			final_nodo.setProx(new_nodo);
		}
	}
	
	public void add(Nodo new_nodo, int index) {
		Nodo back_nodo = get(index - 1);
		Nodo front_nodo;
		
		if (back_nodo == null) {
			front_nodo = get(index);
		} else {
			front_nodo = back_nodo.getProx();
		}
		
		if (front_nodo != null) {
			if (back_nodo != null) {
				back_nodo.setProx(new_nodo);
				new_nodo.setProx(front_nodo);
			} else {
				new_nodo.setProx(front_nodo);
				this.nodo_start = new_nodo;
			}
		} else {
			if (back_nodo != null) {
				back_nodo.setProx(new_nodo);
			} else {
				nodo_start = new_nodo;
			}
		}
		
	}
	
	public void removeDado(int dado) {
		if (size() > 0) {
			Nodo nodo_search = nodo_start;
			Nodo aux = null;
			
			while (nodo_search != null && nodo_search.getDado() != dado) {
				aux = nodo_search;
				nodo_search = nodo_search.getProx();
			}
			
			if (nodo_search != null && aux != null) {
				aux.setProx(nodo_search.getProx());
			}
		}
	}
	
	public void removeTodos(int dado) {
		if (size() > 0) {
			Nodo nodo_search = nodo_start;
			Nodo aux = null;
			
			while (nodo_search != null) {
				if (nodo_search.getDado() == dado) {
					aux.setProx(nodo_search.getProx());
				} else {
					aux = nodo_search;
				}
				
				nodo_search = nodo_search.getProx();
				
			}
		}
	}
	
	public String toString() {
		String content = "";
		Nodo nodo_search = nodo_start;
		for (int i = 0; i < size(); i++) {
			content += "Nodo ["+ i +"]: "+ nodo_search.getDado() +"\n";
			nodo_search = nodo_search.getProx();
		}
		return content;
	}
}
