package az.edu.turing.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Aydan", 80, 24, false);
        User user2 = new User("Aydan", 80, 25, false);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        Collections.sort(list, new UserComporator());
        list.forEach(System.out::println);


    }


}
