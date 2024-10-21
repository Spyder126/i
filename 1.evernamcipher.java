import java.lang.Math;
import java.util.Scanner;
public class Vernam {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String plainText = null, key = null;
		System.out.println("Enter plain Text");
		plainText = sc.nextLine();
		char[] arText = plainText.toCharArray();
		System.out.println("Enter the Key ");
		key = sc.nextLine();
		char[] arKey = key.toCharArray();
		char[] cipherText= new char[plainText.length()];;
		System.out.println("Encoded " + plainText + " to be....");
		for (int i = 0; i < arText.length; i++) {
			cipherText[i] = (char) (arText[i] ^ arKey[i]);
			System.out.print(cipherText[i]);
        }
        System.out.println("\nDecoded to be...");
		for (int i = 0; i < cipherText.length; i++) {
			char temp = (char) (cipherText[i] ^ arKey[i]);
			System.out.print(temp);
        }
    }
}