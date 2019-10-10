package solution;

import java.util.Scanner;

public class solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the lower range");
		int low = sc.nextInt();
		System.out.println("Give the high range");
		int high = sc.nextInt();
		double sqSum = 0;
		double sum =0;
		double sumSq = 0;
		sqSum = calculateSquareSum(low,high);
		sum = calculateSum(low,high);	
		sumSq= Math.pow(sum, 2);
		double diff = sumSq-sqSum;
		System.out.printf("%.0f%n",diff);
	}

	private static double calculateSum(int low, int high) {
		double sum = 0;
		for(int i = low;i<=high;i++) {
			sum = sum + i;
		}
		return sum;
	}

	private static double calculateSquareSum(int low, int high) {
		double sum = 0;
		for(int i = low;i<=high;i++) {
			sum = sum + Math.pow(i, 2);
		}
		return sum;
	}

}
