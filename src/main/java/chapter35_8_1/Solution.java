package chapter35_8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        List<ConvertableUser> users = new ArrayList<>();
        users.add(new ConvertableUser(234, "First user"));
        users.add(new ConvertableUser(235, "Second user"));
        users.add(new ConvertableUser(236, "Third user"));

        Map<Integer, ConvertableUser> mapUsers = ConvertableUtil.convert(users);
        System.out.println(mapUsers);

        List<ConvertableBook> books = new ArrayList<>();
        books.add(new ConvertableBook("First book"));
        books.add(new ConvertableBook("Second book"));
        books.add(new ConvertableBook("Third book"));

        Map<Integer, ConvertableBook> mapBooks = ConvertableUtil.convert(books);
        System.out.println(mapBooks);
    }
}

