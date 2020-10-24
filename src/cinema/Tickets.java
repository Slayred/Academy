package cinema;

import java.util.Scanner;

public class Tickets {
	public static void printAr(char ar[][]) {
		for(int i = 0; i <= ar.length-1; i++) { 
			for (int j = 0; j <= ar[i].length -1; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static char[][] greatArr(int a, int b){

		char ar[][] = new char[a+1][b+1];
		for (int i = 1; i <=ar.length - 1; i++) {
			ar[i][0] = (char)(48+i);			
		}
		for (int i= 1; i <=ar[0].length - 1;i++) {
			ar[0][i] = (char)(48+i);	
		}
		for (int i = 1; i<=ar.length - 1; i++) {
			for(int j = 1; j<=ar[i].length-1; j++) {
				if (ar[i][j] != ' ') {
					ar[i][j] = 'S';
				}
			}
		}
		return ar;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int a = scan.nextInt();
		System.out.println("Enter the number of seats in each row");
		int b = scan.nextInt();
		char ar[][] = greatArr(a,b);
		System.out.println("Cinema:");
		printAr(ar);
		System.out.println("Enter a row number:");
		int a1 = scan.nextInt();
		System.out.println("Enter a seat number in that row:");
		int b1 = scan.nextInt();
		int price;
		if(a*b < 60) {
			price = 10;
			}else {
				if (a1 <= a/2) {
					price = 10;
				} else {
					price = 8;
				}
			}
		ar[a1][b1] = 'B';
		System.out.printf("Ticket price: $%d\n", price);
		System.out.println("Cinema:");
		printAr(ar);
	}

}
