package com.company;

public class Main {

    public static void main(String[] args) {
        RSA rsa = new RSA();
        try {
            String encryptedMessage = rsa.encrypt("HELLO WORLD");
            String decryptedMessage = rsa.decrypt(encryptedMessage);

            System.out.println("Encrypted:\n"+encryptedMessage);
            System.out.println("Decrypted:\n"+decryptedMessage);

        } catch (Exception ignored) {

        }
    }
}
