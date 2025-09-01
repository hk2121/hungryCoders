package regexJcaOthers;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyPairExample {
    public static void main(String[] args) {
        try {
            // Step 1: Choose the algorithm and initialize the KeyPairGenerator
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(2048); // You can choose different key sizes like 2048 or 4096 bits

            // Step 2: Generate the key pair
            KeyPair keyPair = keyPairGen.generateKeyPair();

            // Step 3: Retrieve the public and private keys from the key pair
            java.security.PublicKey publicKey = keyPair.getPublic();
            java.security.PrivateKey privateKey = keyPair.getPrivate();

            // Step 4: Use the keys as needed (e.g., print them out or store them securely)
            System.out.println("Public Key: " + publicKey);
            System.out.println("Private Key: " + privateKey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
