package com.arcada.devops.simon.facebookapp;

public class FriendsList {

	private static final String[] people = { "Alexander", "Victoria", "Kamala", "Harry" };
	private static final String[][] friends = {
			{ "Kaarlo", "Lauri", "Pehr", "Risto", "Juho", "Urho", "Mauno", "Martti", "Tarja", "Sauli" },
			{ "Gustav", "Eric", "John", "Charles", "Christina", "Frederick", "Adolf", "Oscar", "Carl" },
			{ "George", "John", "Thomas", "James", "James", "Martin", "Zachary", "Abraham", "Andrew", "Ulysses",
					"Rutherford", "James", "William", "Theodore", "Woodrow", "Warren", "Calvin", "Herbert", "Harry",
					"Lyndon", "Richard", "Gerald", "Jimmy", "Ronald", "George", "William", "Barack", "Donald",
					"Joseph" },
			{ "Hermione", "Ron", "Albus", "Severus", "Draco", "Rubeus", "Sirius", "Ginny", "Neville", "Luna", "Minerva",
					"Dolores", "Voldemort", "Bellatrix", "Dobby", "Hagrid", "Fleur", "George", "Fred" } };

	// Getters for people and friends
	public static String[] getPeople() {
		return people; // array of people's names
	}

	public static String getFriends(String person) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equalsIgnoreCase(person)) {
				return String.join(", ", friends[i]);
			}
		}
		return "No friends found for " + person;
	}
}