package az.edu.turing.oop;


import java.util.Comparator;

public class User {

    private String name;
    private Integer score;
    private Integer age;
    private boolean gender;

    public User(String name, Integer score, Integer age, boolean gender) {
        this.name = name;
        this.score = score;
        this.age = age;
        this.gender = gender;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }



    static class UserComporator implements Comparator<User> {


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
    @Override
    public String toString() {
        return "User { " + "name: " + name + " ,score: " + score + " ,age: " + age + " ,gender: " + gender + '}';
    }
}
