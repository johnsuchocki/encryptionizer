package com.encryption;

public class Encrypt {

	protected static String encryptionizer(String encryptThis) {
		int stringLength = encryptThis.length();
		String encrypted = "";
		int newCharValue;
		char newChar;
		int key = 4;
		
		for (int character = 0; character < stringLength; character++) {
			char currentChar = encryptThis.charAt(character);
			newCharValue = (int) currentChar + key;
			newChar = (char) newCharValue;
			encrypted += Character.toString(newChar);
		}//for loop iterating through characters in string
		
		return encrypted;
	}//method
}//class
