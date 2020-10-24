package cinema;

public class Arragnement {
	public static void printAr(char ar[][]) {
		for(int i = 0; i <= ar.length-1; i++) { 
			for (int j = 0; j <= ar[i].length -1; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		char ar[][] = new char[8][9];
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
		System.out.println("Cinema:");
		printAr(ar);
	}

}
