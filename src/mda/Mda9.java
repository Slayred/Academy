package mda;

import java.util.Scanner;

public class Mda9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[][] ar = new int[a][a];
		int s = 1;
		
		over: for (int k = 0; s <= a*a; k++) {
		for(int i = 0; i<=ar.length - 1; i++) {
			if (ar[k][i] == 0) {
				ar[k][i] = s;
				s++;
				}
		}
		for (int i = 0; i<=ar.length - 1; i++) {
			if (ar[i][a -(k+1)] == 0) {
			ar[i][a- (k+1)] = s;
			s++;
			}
		}
		//test
		for (int i = ar[a-1].length - 1; i >= 0 ; i--) {
			if (ar[a -(k+1)][i] == 0) {
				ar[a-(k+1)][i] = s;
				s++;
				}
		}
		
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i][k] == 0) {
				ar[i][k] = s;
				s++;
			}
		}
		}		
		for(int i = 0; i <= ar.length - 1; i++) {
			for (int j = 0; j <= ar[i].length - 1; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
