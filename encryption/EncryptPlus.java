package com.encryption;

public class EncryptPlus {

	// currently unused method with enhanced encryption security
	protected static String encryptionizer(String encryptThis) {
		int stringLength = encryptThis.length();
		String encrypted = "";
		int newCharValue;
		char newChar;

		for (int character = 0; character < stringLength; character++) {
			char currentChar = encryptThis.charAt(character);
			if (character == 4 || character == 16) {
				newCharValue = (int) currentChar * 2;

			} else if (character % 7 == 0) {
				newCharValue = (int) currentChar - 9;

			} else if (character % 3 == 1) {
				newCharValue = (int) currentChar + 14;

			} else if (character % 2 == 0) {
				newCharValue = (int) currentChar - 3;
				
			} else {
				newCharValue = (int) currentChar + 23;
			}
			newChar = (char) newCharValue;
			encrypted += Character.toString(newChar);
		} // for loop iterating through characters in string

		return encrypted;
	}// method
}// class
