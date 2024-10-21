import java.io.*;
import java.util.Scanner;
public class SCT {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your plain text: ");
		String accept = sc.nextLine();
		System.out.println("Enter the no. of rows");
		int r = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the no. of cols");
		int c = Integer.parseInt(sc.nextLine());
		int count = 0;
		char cont[][] = new char[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				    if (count >= accept.length()) {
					  cont[i][j] = ' ';
					} else {
						cont[i][j] = accept.charAt(count);
						count++;
                    }
            }
        }
        for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("\t" + cont[i][j]);
            }
        System.out.print("\n");
        }
        System.out.println("\nEnter the order of cols you want to view them in");
		int choice[] = new int[c];
		for (int k = 0; k < c; k++) {
			System.out.println("Choice " + k + " -> ");
			choice[k] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("\ncipher text in matrix is -> ");
		String cipher = "";
		for (int j = 0; j < c; j++) {
			int k = choice[j];
			for (int i = 0; i < r; i++) {
				cipher += cont[i][k];
            }
        }
        System.out.println(cipher);
    }
}
