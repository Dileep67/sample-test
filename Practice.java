package simpleprograms;

public class Practice {
	public int factoRial(int n) {
		
		if (n==0) {
			return 1;
		}
		return n*factoRial(n-1);
		
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		System.out.println(p.factoRial(3));
	
		
	}

}
