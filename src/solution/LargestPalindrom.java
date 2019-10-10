package solution;

import java.util.ArrayList;
import java.util.List;

public class LargestPalindrom {

	
	public static void main(String [] args) {
		long max = 999*999;
		System.out.println( max);
		long num = 0;
		
		for(int j = 999;j>99;j--) {
			for (int i = 999; i >99;i--) {
				num = j*i;
				boolean flag = checkPallindrom(num,j,i);
				if(flag) {
					System.exit(0);
				}
			}
		}
	}



	private static boolean checkPallindrom(long num, int j, int i) {
		// count number of digits
		int count = 0;
		boolean isPallindrome = true;
		List<Integer> digitList = new ArrayList<>();
		long copy = num;
		while(copy >0) {
			int lastDigit = (int) (copy%10);
			digitList.add(lastDigit);
			copy = copy / 10;
			count = count+1;
		}
		int mid = count/2;
		if(count%2==0) {
			// even number of digits
			for (int k = 0;k<mid;k++) {
				if(digitList.get(k)!=digitList.get((count-1)-k)) {
					isPallindrome = false;
					break;
				}
			}
		}else {
			for(int k = 0;k<mid;k++) {
				if(digitList.get(k)!=digitList.get((count-1)-k)) {
					isPallindrome = false;
					break;
				}
			}
		}
		if(isPallindrome) {
			System.out.println(num) ;
			System.out.println(i) ;
			System.out.println(j) ;
			
		}
		
		return isPallindrome;
	}
}
