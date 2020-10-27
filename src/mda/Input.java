package mda;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		System.out.print("Enter the coordinates:");
		Scanner scan = new Scanner(System.in);
		int q = 0;
		int a = -1;
		int b = -1;
		int[][] ar = new int[3][3];
		
	while (q == 0) {
		if (!scan.hasNextInt()) {
			System.out.println("You should enter numbers!");
			scan.nextLine();
			continue;
		} else {
		a = scan.nextInt();
		b = scan.nextInt();
		}
		if ((a>3) || (b>3)) {
			System.out.println("Coordinates should be from 1 to 3!");
	}else if (ar[a-1][Math.abs(b-3)] == '_') {
		ar[a-1][Math.abs(b-3)] = 'O';
		q = 1;
	}else {System.out.println("This cell is occupied! Choose another one!");}
		}
	}
}
