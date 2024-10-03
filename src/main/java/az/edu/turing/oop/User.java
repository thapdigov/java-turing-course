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

    @Override
    public String toString() {
        return "User { " + "name: " + name + " ,score: " + score + " ,age: " + age + " ,gender: " + gender + '}';
    }
}
