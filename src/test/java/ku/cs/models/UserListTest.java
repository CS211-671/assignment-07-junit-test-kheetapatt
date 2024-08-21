package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Moji", "100000");
        userList.addUser("Meji", "100001");
        userList.addUser("Miji", "100002");

        // TODO: find one of them
        User user = userList.findUserByUsername("Moji");

        // TODO: assert that UserList found User
         String expected = "Moji";
         String actual = user.getUsername();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Moji", "100000");
        userList.addUser("Meji", "100001");
        userList.addUser("Miji", "100002");

        // TODO: change password of one user
        boolean actual = userList.changePassword("Meji", "100001", "333333");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Moji", "100000");
        userList.addUser("Meji", "100001");
        userList.addUser("Miji", "100002");

        // TODO: call login() with correct username and password
        User actual = userList.login("Miji", "100002");

        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("Miji");
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Moji", "100000");
        userList.addUser("Meji", "100001");
        userList.addUser("Miji", "100002");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Miji", "100000");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}