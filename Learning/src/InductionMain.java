
public class InductionMain {



	public static void main(String[] args) {
		int[] a2 = new int[8];
		int[] a1 = {87,12,1,-2,346,2438,2346,23453};

		a2 = invert(a1,a2,8,8);
		for (int i = 0; i < 8; i++) {
			System.out.print("["+ a2[i] +"]");
		}

		System.out.println("Max de a1: "+ max(a1,8,a1[0]));
		System.out.println("Binário de 5: "+ bin_fix(bin(586)));

	}


	public static int[] invert(int[] a1,int[] a2,int n,int i) {
		if (n >= 1) {
			a2[n-1] = a1[i-n];
			return invert(a1,a2,n-1,i);
		}
		return a2;
	}

	
	public static double max(int[] a,int n, int m) {
		if (n >= 1) {
			if (a[n-1] > m) {
				m = a[n-1];
			}
			return max(a,n-1,m);
		}
		return m;
	}

	
	public static String bin(int num) {
		if (num == 0) {
			return "";
		}
		if (num % 2 == 0) {
			return "0" + bin(num/2);
		}
		return "1" + bin(num/2);
	}
	
	public static String bin_fix(String bin_text) {
		StringBuilder builder = new StringBuilder();
		for (int i = bin_text.length() - 1; i >= 0; i--) {
			builder.append(bin_text.charAt(i));
		}
		return builder.toString();
	}
}