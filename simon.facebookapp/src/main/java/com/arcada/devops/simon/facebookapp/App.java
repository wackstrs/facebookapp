package com.arcada.devops.simon.facebookapp;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Friend Checker App!");

		while (true) {
			System.out.println("Whose friends would you like to see?");
			System.out.println("Your options are: ");

			// list the available people
			for (String person : FriendsList.getPeople()) {
				System.out.println(person);
			}

			// user's input
			String person = scanner.nextLine().trim();

			// if the input is empty
			if (person.isEmpty()) {
				System.out.println("The input can't be empty. Please enter a name.");
				continue;
			}

			String friendList = FriendsList.getFriends(person);
			System.out.println(friendList);

			// Prompt to re-run or exit
			System.out.println("Would you like to re-run the program? (yes/no)");
			String response = scanner.nextLine().trim();
			if (!response.equalsIgnoreCase("yes")) {
				System.out.println("Exiting the program. Goodbye!");
				break;
			}
		}

		scanner.close();
	}
}
