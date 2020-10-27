package cinema;

import java.util.Scanner;

public class Sold {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int a = scan.nextInt();
		System.out.println("Enter the number of seats in each row");
		int b = scan.nextInt();
		char ar[][] = new char[a][b];
		boolean q = (a*b > 60);
		int cash = 0;
		for (int i = 0; i <=ar.length - 1; i++) {
			for (int j = 0; j <= ar[i].length - 1; j++) {
				if (!q) {
					cash +=10;
				} else {
						if (i+1 <= a/2) {
							cash +=10;
						} else {
							cash +=8;
					}									
			}
		}
		}
		System.out.printf("Total income:\n$%d", cash);
	}

}
	
