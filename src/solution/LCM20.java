package solution;

public class LCM20 {
	public static int count = 0;
	public static void main (String[] args) {
		
		int n1 =1;
		int n2 = 2;
		int lcm=1;
		for (int i = 0;i<19;i++) {
			lcm = calculateLcm(n2+i, lcm,lcm);
		}
		System.out.println(lcm);
		System.out.println(count);
	}

	private static int calculateLcm(int n1, int n2, int lcm) {
//		lcm = (n1>n2)?n1 :n2 ;
		while(true) {
			
			if( lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println("LCM for "+n1+"\t"+n2+"\tis\t"+lcm);
				break;
			}
			
			lcm = lcm + 1;
			count = count+1;
		}
		return lcm;
	}
}
