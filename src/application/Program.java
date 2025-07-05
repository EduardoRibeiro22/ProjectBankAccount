package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.enums.TypeAccount;
import model.exceptions.DomainExceptions;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer number = DomainExceptions.readInteger(sc, "Number: ");
		sc.nextLine();

		String accountType = null;
		TypeAccount typeAcc = null;
		
		while (true) {
			try {
				System.out.print("Enter type Account: ");
				accountType = sc.nextLine();
				typeAcc = TypeAccount.valueOf(accountType.toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid Type Account, Enter a valid type: ");
			}

		}

		System.out.print("Holder: ");
		String holder = sc.nextLine();

		Double balance = DomainExceptions.readDouble(sc, "Initial balance: ");
		Double withdrawlimit = DomainExceptions.readDouble(sc, "Withdraw limit: ");
		
		Account account = new Account(number, typeAcc, holder, balance, withdrawlimit);
		
		try {
		System.out.println("-------------------");
		System.out.print("Enter amount for withdraw: ");
		account.withdraw(sc.nextDouble());
		}catch(DomainExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}
}
