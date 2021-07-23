package example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getAllUsers() {
        User user = new User("Alex", 33, Sex.MALE);
        User user1 = new User("Alex1", 3, Sex.MALE);
        User user2 = new User("Ejik", 27, Sex.FEMALE);

        List<User> listUsers = User.getAllUsers();

        List<User> listUseractual = new ArrayList<>();
        listUseractual.add(new User("Alll", 23, Sex.FEMALE));
        listUseractual.add(new User("Alll1", 43, Sex.MALE));
        listUseractual.add(new User("Alll2", 13, Sex.FEMALE));

        Assert.assertEquals(listUsers, listUseractual);

    }

    @Test
    void testGetAllUsers() {
    }

    @Test
    void getHowManyUsers() {
    }

    @Test
    void testGetHowManyUsers() {
    }

    @Test
    void getAllAgeUsers() {
    }

    @Test
    void testGetAllAgeUsers() {
    }

    @Test
    void getAverageAgeOfAllUsers() {
    }

    @Test
    void testGetAverageAgeOfAllUsers() {
    }
}