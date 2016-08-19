package com.encryption;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		String encrypted;
		String decrypted;
		String menuInput;
		String encryptThis;
		String decryptThis;
		boolean userQuit = false;
		boolean menuInputValid = false;
		
		do {
			do {
				System.out.println("What would you like to do?");
				System.out.println("(1) Encrypt a message & display.");
				System.out.println("(2) Decrypt a message you input.");
/*				System.out.println("(3) Encrypt using a less crackable algorithm.");
				System.out.println("(4) Decrypt a message using the strong encryption.");    */
				System.out.println("(5) Exit program.");
			
				menuInput = userInput.nextLine();
				menuInputValid = Validation.menuValidation(menuInput);
				
			} while (!(menuInputValid));
			
			switch (menuInput) {
			case "1":
				System.out.println("Enter your message.");
				encryptThis = userInput.nextLine();
				encrypted = Encrypt.encryptionizer(encryptThis);
				System.out.println(encrypted);
				break;
			case "2":
				System.out.println("Enter the encrypted message.");
				decryptThis = userInput.nextLine();
				decrypted = Decrypt.decryptionizer(decryptThis);
				System.out.println(decrypted);
				break;
				
				
			case "5":
				userQuit = true;
				System.out.println("Encryption app closed.");
				break;	
			}
			
		} while (!(userQuit));
	
		userInput.close();
	}//main method
}//class
