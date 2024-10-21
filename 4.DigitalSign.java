

import java.security.*;
import java.util.Base64;

public class DigitalSign {

    private static final String SIGNING_ALGORITHM = "SHA256withRSA";
    private static final String RSA = "RSA";

    // Method to create a digital signature
    public static byte[] Create_Digital_Signature(byte[] input, PrivateKey key) throws Exception {
        Signature signature = Signature.getInstance(SIGNING_ALGORITHM);
        signature.initSign(key);
        signature.update(input);
        return signature.sign();
    }

    // Method to generate RSA key pair
    public static KeyPair Generate_RSA_KeyPair() throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSA);
        keyPairGenerator.initialize(2048, secureRandom);
        return keyPairGenerator.genKeyPair();
    }

    // Method to verify the digital signature
    public static boolean Verify_Digital_Signature(byte[] input, byte[] signatureToVerify, PublicKey key) throws Exception {
        Signature signature = Signature.getInstance(SIGNING_ALGORITHM);
        signature.initVerify(key);
        signature.update(input);
        return signature.verify(signatureToVerify);
    }

    // Method to convert byte array to hex string
    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder(2 * bytes.length);
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) throws Exception {
        String input = "Good Morning";
        KeyPair keyPair = Generate_RSA_KeyPair();

        byte[] signature = Create_Digital_Signature(input.getBytes(), keyPair.getPrivate());
        System.out.println("Signature Value: \n" + bytesToHex(signature));
        System.out.println("Verification: " + Verify_Digital_Signature(input.getBytes(), signature, keyPair.getPublic()));
    }
}
