package ocp.oop.test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class PKCEGenerator {

  // Method to generate the code_verifier
  public static String generateCodeVerifier() {
    // Generate 32 bytes of secure random data (256 bits)
    SecureRandom secureRandom = new SecureRandom();
    byte[] codeVerifierBytes = new byte[32];
    secureRandom.nextBytes(codeVerifierBytes);

    // Base64-url encode the verifier without padding
    return Base64.getUrlEncoder().withoutPadding().encodeToString(codeVerifierBytes);
  }

  // Method to generate the code_challenge using SHA-256
  public static String generateCodeChallenge(String codeVerifier) throws NoSuchAlgorithmException {
    // Compute SHA-256 hash of the code_verifier
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] hashedBytes = digest.digest(codeVerifier.getBytes());

    // Base64-url encode the result without padding
    return Base64.getUrlEncoder().withoutPadding().encodeToString(hashedBytes);
  }

  public static void main(String[] args) {
    try {
      // Generate code_verifier
      String codeVerifier = generateCodeVerifier();
      System.out.println("Code Verifier: " + codeVerifier);

      // Generate code_challenge (S256)
      String codeChallenge = generateCodeChallenge(codeVerifier);
      System.out.println("Code Challenge: " + codeChallenge);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
  }
}
