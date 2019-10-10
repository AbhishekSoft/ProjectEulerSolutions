package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class solution8 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int largest = 1; 
		int prod = 1;
		System.out.println("give input number");
		String str = sc.nextLine();
		System.out.println("give the number of consecutive digits ");
		int consecutiveCount = sc.nextInt();
		LinkedList<Integer> numbers = new LinkedList();
		List<Integer>nums;
		int length = str.length();
		for(int i = 0;i<length;i++) {
			
			char c = str.charAt(i);
			int digit  = (int)(c -'0');
			if(digit>0) {
				if(i<consecutiveCount) {
					prod *=digit;
					numbers.add(digit);
				}else 
					{
					if(largest<prod) {
						largest = prod;
						nums = new ArrayList<>();
						nums.addAll(numbers);
						
					}
					int headItem = numbers.remove();
					prod = prod/headItem;
					prod = prod*digit;
					numbers.add(digit);
				
					
					
					
				}
			}
		}
		System.out.println(prod);
		numbers.stream().forEach(System.out::println);
	}
}
