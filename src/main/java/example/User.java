package example;

import java.util.*;

public class User {
    private static Map<Integer, User> allUsers;
    private static int countId = 0;

    private int id;
    private String name;
    private int age;
    private Sex sex;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.age == user.age && Objects.equals(this.name, user.name) && this.sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age, this.sex);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public User(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        if (allUsers.isEmpty()) allUsers = new HashMap<>();
        if (!allUsers.containsValue(this)) {
            countId++;
            this.id = countId;
            allUsers.put(this.id, this);
        }
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(Sex sex) {
        List<User> list = new ArrayList<>();
        for (User user : allUsers.values()) {
            if (user.sex == sex) list.add(user);
        }
        return list;
    }

    public static int getHowManyUsers() {
        return allUsers.size();
    }

    public static int getHowManyUsers(Sex sex) {
        return getAllUsers(sex).size();
    }

    public static int getAllAgeUsers() {
        int count = 0;
        for (User user : allUsers.values()) {
            count += user.age;
        }
        return count;
    }

    public static int getAllAgeUsers(Sex sex) {
        int count = 0;
        for (User user : getAllUsers(sex)) {
            count += user.age;
        }
        return count;
    }

    public static int getAverageAgeOfAllUsers() {
        return getAllAgeUsers() / getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Sex sex) {
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }
}
