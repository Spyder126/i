import java.util.*;

public class Railfence {
    String Encryption(String plainText, int depth) throws Exception {
        int r = depth, len = plainText.length();
        int c = (int) Math.ceil((double) len / depth);
        char mat[][] = new char[r][c];

        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (k < len) {
                    mat[i][j] = plainText.charAt(k++);
                } else {
                    mat[i][j] = ' '; // Fill remaining cells with spaces
                }
            }
        }

        StringBuilder cipherText = new StringBuilder();
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                if (mat[i][j] != ' ') {
                    cipherText.append(mat[i][j]);
                }
            }
        }
        return cipherText.toString();
    }

    String Decryption(String cipherText, int depth) throws Exception {
        int r = depth, len = cipherText.length();
        int c = (int) Math.ceil((double) len / depth);
        char mat[][] = new char[r][c];

        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (k < len) {
                    mat[i][j] = cipherText.charAt(k++);
                } else {
                    mat[i][j] = ' '; // Fill remaining cells with spaces
                }
            }
        }

        StringBuilder plainText = new StringBuilder();
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                if (mat[i][j] != ' ') {
                    plainText.append(mat[i][j]);
                }
            }
        }
        return plainText.toString();
    }
}

class RailFenceB {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int depth;
        String plainText, cipherText, decryptedText;

        System.out.println("Enter plain Text:");
        plainText = sc.nextLine();
        System.out.println("Enter Depth (No of Rails) for Encryption: ");
        depth = sc.nextInt();

        Railfence rf = new Railfence();
        cipherText = rf.Encryption(plainText, depth);
        System.out.println("Encrypted Text is: " + cipherText);

        decryptedText = rf.Decryption(cipherText, depth);
        System.out.println("Decrypted Text is: " + decryptedText);
    }
}
