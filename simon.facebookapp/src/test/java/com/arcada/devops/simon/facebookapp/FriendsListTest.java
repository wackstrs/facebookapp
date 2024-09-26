package com.arcada.devops.simon.facebookapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriendsListTest {

    @Test
    public void testGetFriendsWithInvalidName() {
    	assertEquals("No friends found for InvalidName", FriendsList.getFriends("InvalidName"));
    }
    
    @Test
    public void testGetFriendsWithEmptyInput() {
        assertEquals("No friends found for ", FriendsList.getFriends(""));
    }
    
    @Test
    public void testGetFriendsWithValidName() {
        assertEquals("Kaarlo, Lauri, Pehr, Risto, Juho, Urho, Mauno, Martti, Tarja, Sauli", FriendsList.getFriends("Alexander"));
        assertEquals("Gustav, Eric, John, Charles, Christina, Frederick, Adolf, Oscar, Carl", FriendsList.getFriends("Victoria"));
        assertEquals("George, John, Thomas, James, James, Martin, Zachary, Abraham, Andrew, Ulysses, Rutherford, James, William, Theodore, Woodrow, Warren, Calvin, Herbert, Harry, Lyndon, Richard, Gerald, Jimmy, Ronald, George, William, Barack, Donald, Joseph", FriendsList.getFriends("Kamala"));
        assertEquals("Hermione, Ron, Albus, Severus, Draco, Rubeus, Sirius, Ginny, Neville, Luna, Minerva, Dolores, Voldemort, Bellatrix, Dobby, Hagrid, Fleur, George, Fred", FriendsList.getFriends("Harry"));
    }
}

