package lab4;

import java.util.Scanner;

public class Lab4TableOfPowers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		

		do {

			System.out.println("Enter an integer: ");
			int num = scnr.nextInt();
			
			
			System.out.println("Number Squared Cubed");
			for (int i = 1; i <= num; i++) {

				System.out.println(i + " 	" + (i * i) + " 	" + (i * i * i));
			}
			System.out.println("Continue y/n?");

		} while (scnr.next().equals("y"));

	}

}