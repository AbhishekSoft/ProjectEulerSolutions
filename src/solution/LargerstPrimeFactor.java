package solution;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class LargerstPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Number");
		Long num = sc.nextLong();
		Set<Integer> factors = new HashSet<Integer>();
		int i =2;
		while(i<=num) {
			while(num%i==0) {
				num = num/i;
				factors.add(i);
			}
			i = i+1;
		}
		factors.stream().forEach(System.out::println);
		Optional<Integer>max = factors.stream().reduce((t1,t2)->t1>t2?t1:t2);
		max.ifPresent(x->{
			System.out.println("Maximum Prime factor is \t"+x);
		});
		
	}

}
