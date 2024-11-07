package az.edu.turing.oop;

import java.util.Comparator;

public class UserComporator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        int scoreComparison = user1.getScore().compareTo(user1.getScore());
        if (scoreComparison != 0) {
            return scoreComparison;
        }

        int nameComparison = user1.getName().compareTo(user2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        int genderComparison = Boolean.compare(user1.isGender(), user2.isGender());
        if (genderComparison != 0) {
            return genderComparison;
        }

        return user1.getAge().compareTo(user2.getAge());


    }

}
