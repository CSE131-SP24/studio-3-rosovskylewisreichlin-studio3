package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main (String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("choose a number");

		int n = in.nextInt();

		boolean[ ] numbers = new boolean [n];


		for (int value = 2; value < numbers.length; value++) {

			//2 loops = 2 fingers

			for(int factor = value; factor < numbers.length; factor+=value) {
				numbers[factor] = true;
				//if numbers [ ] = false
				//System.out.println(numbers[n]);



			}
		}
		for (int i = 2; i < n; i++) {
			if (numbers[i] == false) {
				System.out.println(i);
				
			}
		}	
		}

	}

