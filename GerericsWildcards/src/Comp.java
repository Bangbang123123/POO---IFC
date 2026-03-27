
public class Comp {
	public static <T extends Comparable<T>> int maior(T[] array, T element) {
		
		int j = 0;
		for (T e : array) {
			if (e.compareTo(element) > 0) {
				j++;
			}
		}
		return j;
	}
}
