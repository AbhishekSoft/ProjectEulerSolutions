package solution;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MultipleOf3And5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the range to find multiples of 3 and 5");
		int limit = sc.nextInt();
		int sum = 0;
		Set<Integer> numbers = new HashSet<>();
		for(int i = 0 ; i<limit;i++) {
			if(i%3==0||i%5==0) {
				numbers.add(i);
				
			}
		}
		for (Integer integer : numbers) {
			sum+=integer;
		}
		System.out.println(sum);
		
		
	}

}
