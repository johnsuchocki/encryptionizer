package com.encryption;

public class Decrypt {
	
	protected static String decryptionizer(String encrypted) {
		int stringLength = encrypted.length();
		String decrypted = "";
		int newCharValue;
		char newChar;
		int key = 4;
		
		for (int character = 0; character < stringLength; character++) {
			char currentChar = encrypted.charAt(character);
			newCharValue = (int) currentChar - key;
			newChar = (char) newCharValue;
			decrypted += Character.toString(newChar);
		}//for loop iterating through characters in string
		
		return decrypted;
	}//method
}//class
