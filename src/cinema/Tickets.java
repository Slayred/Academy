package cinema;

import java.util.Scanner;

public class Tickets {
	Scanner scan = new Scanner(System.in);

	public static void printAr(char ar[][]) {
		System.out.println("Cinema:");
		for(int i = 0; i <= ar.length-1; i++) { 
			for (int j = 0; j <= ar[i].length -1; j++) System.out.print(ar[i][j] + " ");
			System.out.println();
		}
	}
	public static char[][] greatArr(int a, int b){

		char ar[][] = new char[a+1][b+1];
		for (int i = 1; i <=ar.length - 1; i++) ar[i][0] = (char) (48 + i);
		for (int i= 1; i <=ar[0].length - 1;i++) ar[0][i] = (char) (48 + i);
		for (int i = 1; i<=ar.length - 1; i++) {
			for(int j = 1; j<=ar[i].length-1; j++) if (ar[i][j] != ' ') ar[i][j] = 'S';
		}
		return ar;
	}
	public static void stats(char[][] ar, int price){
		double buy = 0;
		double count = 0;
		int priceT = 0;
		//System.out.println("ar.length " + ar.length );
		for (int i = 1; i <= ar.length - 1; i++){
			//System.out.println("ari.length " + ar[i].length );
			for (int j = 1; j <=ar[i].length - 1; j++){
				if (ar[i][j] == 'B') {
					buy++;
				}
				count++;
			}
		}
		int q = (ar.length-1) * (ar[0].length-1);
		for (int i = 1; i <=ar.length - 1; i++) {
			for (int j = 1; j <= ar[i].length - 1; j++) {
				if (q<60) {
					priceT+=10;
				} else {
					if (i+1 <= ((ar.length - 1)/2)) {
						priceT +=10;
					} else {
						priceT +=8;
					}
				}
			}
		}
		double d = buy * 100 / count;
		System.out.println("Number of purchased tickets: " + buy);
		System.out.printf("Percentage: %.2f%% \n", d);
		System.out.println("Current income: $" +price);
		System.out.println("Total income: $" + priceT);
	}

	public static int Tick(char ar[][]) {
		Scanner scan = new Scanner(System.in);
		int q = 0;
		int price = 0;
		while (q == 0) {
		System.out.println("Enter a row number:");
		int a1 = scan.nextInt();
		System.out.println("Enter a seat number in that row:");
		int b1 = scan.nextInt();
		if ((a1 > ar.length-1 && b1 > ar[0].length-1) || ( a1 < 1 && b1 < 1)) {
			System.out.println("Wrong input!");
			break;
		} else if (ar[a1][b1] == 'B') {
			System.out.println("That ticket has already been purchased");
			break;
		}
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
		q = 1;
		}
		return price;

	}
	public static void chs(char[][] ar) {
		Scanner scan = new Scanner(System.in);
		int price = 0;
		int priceT = 0;
		int q = 0;
		while (q == 0) {
			System.out.println();
			System.out.println("1. Show the seats");
			System.out.println("2. Buy a ticket");
			System.out.println("3. Statistics");
			System.out.println("0. Exit");
			int a = scan.nextInt();
			switch (a) {
			case 1:
				printAr(ar);
				break;
			case 2:
				Tick(ar);
				price = Tick(ar);
				priceT += Tick(ar);
				break;
			case 0:
				q = 1;
				break;
			case 3:
				stats(ar, price);
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
