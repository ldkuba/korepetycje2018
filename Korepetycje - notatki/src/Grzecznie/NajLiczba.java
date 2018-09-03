package Grzecznie;

public class NajLiczba {
	public static void main(String[] args) {
		int[] t1 = {1,12,6,8,4};
		int[] t2 = {1,2,6,8,4};
		int[] t3 = {1,12,6,18,4};
		
		
		int n1 = najwieksza(t1);
		int n2 = najwieksza(t2);
		int n3 = najwieksza(t3);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

	private static int najwieksza(int[] t) {
		
		int max = 0;
		
		for(int i =0; i<t.length;i++) {
			if (t[i]>max) {
				max=t[i];
			}
			
		}
		return max;
	}
	
	
}
