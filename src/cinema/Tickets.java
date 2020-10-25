package cinema;

import java.util.Scanner;

public class Tickets {
	public static void printAr(char ar[][]) {
		System.out.println("Cinema:");
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
	public static void Tick(char ar[][]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a row number:");
		int a1 = scan.nextInt();
		System.out.println("Enter a seat number in that row:");
		int b1 = scan.nextInt();
		int price;
		if((ar.length-1)*(ar[0].length-1) < 60) {
			price = 10;
			}else {
				if (a1 <= (ar.length-1)/2) {
					price = 10;
				} else {
					price = 8;
				}
			}
		ar[a1][b1] = 'B';
		System.out.printf("Ticket price: $%d\n", price);
	}
	public static void chs(char[][] ar) {
		Scanner scan = new Scanner(System.in);
		int q = 0;
		while (q == 0) {
			System.out.println();
			System.out.println("1. Show the seats");
			System.out.println("2. Buy a ticket");
			System.out.println("0. Exit");
			int a = scan.nextInt();
			switch (a) {
			case 1:
				printAr(ar);
				break;
			case 2:
				Tick(ar);
				break;
			case 0:
				q = 1;
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int a = scan.nextInt();
		System.out.println("Enter the number of seats in each row");
		int b = scan.nextInt();
		char ar[][] = greatArr(a,b);
		chs(ar);
		
	}

}
