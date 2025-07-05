package model.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DomainExceptions extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DomainExceptions(String msg) {
		super(msg);
	}
	

	public static Double readDouble(Scanner sc, String prompt) {
		System.out.print(prompt);
		while (true) {
			try {
				return sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.print("Invalid input! Enter again: ");
				sc.nextLine();
			}
		}
	}

	public static Integer readInteger(Scanner sc, String prompt) {
		System.out.print(prompt);
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Invalid input!Enter again: ");
				sc.nextLine();
			}
		}
	}
}
