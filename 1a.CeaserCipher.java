import java.util.*;

public class CeasarCipher {

    // For encryption
    static String encryptCeasar(String message1, int key1) {
        StringBuilder encryptedMessage = new StringBuilder();
        char ch;
        for (int i = 0; i < message1.length(); i++) {
            ch = message1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key1);
                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                encryptedMessage.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + key1);
                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                encryptedMessage.append(ch);
            } else {
                encryptedMessage.append(ch);
            }
        }
        return encryptedMessage.toString();
    }

    // For decryption
    static String decryptCeasar(String message1, int key1) {
        StringBuilder decryptMessage = new StringBuilder();
        char ch;
        for (int i = 0; i < message1.length(); i++) {
            ch = message1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key1);
                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }
                decryptMessage.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - key1);
                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }
                decryptMessage.append(ch);
            } else {
                decryptMessage.append(ch);
            }
        }
        return decryptMessage.toString();
    }

    // Main method
    public static void main(String[] args) {
        String plainText;
        int key;
        String cipherText;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter msg: ");
        plainText = sc.nextLine();
        System.out.print("Enter key: ");
        key = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leaks

        cipherText = encryptCeasar(plainText, key);
        System.out.println("Cipher txt: " + cipherText);
        System.out.println("Original txt: " + decryptCeasar(cipherText, key));
    }
}