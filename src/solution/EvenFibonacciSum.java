package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenFibonacciSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Give the limit of maximum term");
		int limit = sc.nextInt();
		
		Long sum =0L;
		long first = 0L;
		long second = 1L;
		List<Long> fibSeries = new ArrayList<Long>(); 
		fibSeries.add(first);
		fibSeries.add(second);
		fibSeries = fibbonaciSum(first,second,limit,fibSeries);
		fibSeries.stream().forEach(System.out::println);
//		sum = fibSeries.stream().filter(x->x%2==0).flatMapToLong((x,y)->);
		for (Long long1 : fibSeries) {
			if(long1%2==0) {
				sum+=long1;
			}
		}
		System.out.println(sum);
	}

	private static List<Long> fibbonaciSum(long first, long second, int limit, List<Long> fibSeries) {
		long third = 0L;
		while(first+second<=limit) {
			third = first+second;
			first = second;
			second = third;
			fibSeries.add(third);
		}
		
		return fibSeries;
	}

}
