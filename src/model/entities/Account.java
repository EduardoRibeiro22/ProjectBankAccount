package model.entities;

import model.enums.TypeAccount;
import model.exceptions.DomainExceptions;

public class Account {

	private Integer number;
	private String holder;
	private TypeAccount type;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
		super();
	}

	public Account(Integer number, TypeAccount type, String holder, Double balance, Double withdrawLimit) {

		this.number = number;
		this.type = type;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;

	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public TypeAccount getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
				+ withdrawLimit + "]";
	}

	public void deposit(Double amount) throws DomainExceptions{
		if (amount < 0) {
			throw new DomainExceptions("deposit error: negative amounts cannot be deposited!");
		} else {
			this.balance += amount;
		}
	}

	public void withdraw(Double amount) throws DomainExceptions {
		if (this.withdrawLimit < amount) {
			throw new DomainExceptions("The amount exceeds withdraw limit");
		} else if(this.balance < amount) {
			throw new DomainExceptions("Not enough balance! ");
		} else {
			this.balance -= amount;
			System.out.println("New balance:" + this.balance);
		}
	}
}
