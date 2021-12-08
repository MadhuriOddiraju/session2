package model;

import java.util.Scanner;

import java.util.*;

public class ExceptionBank {

	private String username;
	private int useraccountNo;
	private double userBal;

	public ExceptionBank(String username, int useraccountNo, int userBal) {
		this.username = username;
		this.useraccountNo = useraccountNo;
		this.userBal = userBal;

	}

	static Scanner sc = new Scanner(System.in);

	public void createAccount() {
		System.out.println("Enter accountNo");
		useraccountNo = sc.nextInt();
		System.out.println("Enter userName");
		username = sc.next();

	}

	public void searchaccount() {
		ExceptionBank n1 = new ExceptionBank("madhuri", 123456, 500);
		int acNo = sc.nextInt();
		if (n1.useraccountNo == acNo) {
			System.out.println("Entered account number is matched ");
		} else {
			System.out.println("Entered account number is not found");
		}
	}

	public void showaccount() {
		System.out.println("Name of account holder:" + username);
		System.out.println("Account number" + useraccountNo);
		System.out.println("User balance" + userBal);
	}

	public void deposit() {
		double amount;
		// Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit");
		amount = sc.nextDouble();
		try {
			if (amount >= 0) {
				userBal = userBal + amount;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Please dont enter negative amount");
		}
	}

	public void withdrawl() {
		double amount;
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw");
		amount = sc.nextDouble();
		try {
			if (userBal >= amount) {
				userBal = userBal - amount;
				System.out.println("Balance after withdrawl" + userBal);
			} else {

				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Please enter withdrawl amount lessthan or equal to user balance");
		}
	}
}
