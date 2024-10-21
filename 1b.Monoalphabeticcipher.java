import java.util.Scanner;
public class MonoalplabetCipher {
	public static void main(String args[]) {
		final char RALPHABETS[] = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		final char MALPHABETS[] ={'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','B','N','M'};
		Scanner s = new Scanner(System.in);
		String pltext;
		char citext[] = new char[20];
		char detext[] = new char[20];
		int i, l;
		System.out.print("Enter Plain Text: ");
		pltext = s.nextLine();
		pltext = pltext.toLowerCase();
		l = (pltext.length());
		for (i = 0; i < l; i++) {
			for (int j = 0; j < 26; j++) {
				if (RALPHABETS[j] == pltext.charAt(i)) {
					citext[i] = MALPHABETS[j];
					break;
				}
		    }
}
 System.out.print("Cipher Text: ");
 for (i = 0; i < l; i++) {
	 System.out.print(citext[i]);
 }
 String b = new String(citext);
 for (i = 0; i < l; i++) {
	 for (int j = 0; j < 26; j++) {
		 if (MALPHABETS[j] == b.charAt(i)) {
			 detext[i] = RALPHABETS[j];
			 break;
        }
    }
 }
 System.out.println("\nPlain text:");
 for (i = 0; i < l; i++) {
	 System.out.print(detext[i]);
 }
 }
}
