package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution7 {

	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the count of prime number");
		int count = sc.nextInt();
		List<Integer> primeList = new ArrayList<Integer>();
		int primeCount = 0;
		int num =2;
		while(primeCount!=count) {
			boolean isPrime = checkPrime(num);
			if(isPrime) {
				primeCount +=1;
				primeList.add(num);
				num++;
			}else {
				num++;
			}
		}
		System.out.println(num-1);
		primeList.stream().forEach(System.out::println);
	}

	private static boolean checkPrime(int num) {
		boolean isPrime = true;
		for(int i = num-1;i>1;i--) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
