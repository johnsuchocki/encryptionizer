package com.encryption;

public class Validation {

	protected static boolean menuValidation(String menuInput) {
		if (menuInput.equals("1") || menuInput.equals("2") || menuInput.equals("3")) {
			return true;
		} else {
			System.out.println("You input is invalid. Try again.");
			return false;
		}
	}
}
