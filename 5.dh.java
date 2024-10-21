

import java.util.Scanner;
import java.util.concurrent.*;

public class DH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prime no 1p: ");
		int p = sc.nextInt();
		System.out.println("Enter prime no 1g: ");
		int g = sc.nextInt();
		System.out.println("Choose 1 secret no(Alice): 'a' ");
		int a = sc.nextInt();
		System.out.println("Choose 1 secret no(Bob): 'b' ");
		int b = sc.nextInt();
		int A = (int) Math.pow(g, a);
		int B = (int) Math.pow(g, b);
		System.out.println("Public key of Alice: "+A);
		System.out.println("Public key of Bob: "+B);
		int S_A = (int) Math.pow(B, a)%p;
		int S_B = (int) Math.pow(A, b)%p;
		System.out.println("Shared key of Alice S_A: "+ S_A);
		System.out.println("Shared key of Bob S_B: "+ S_B);
		
		if(S_A == S_B) {
			System.out.println("Alice & Bob can Communicate with each other");
			System.out.println("They Shared a secret key no: "+S_A);
		} else {
			System.out.println("Alice & Bob cannot Communicate with each other");
		}
	}

}