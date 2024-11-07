package az.edu.turing.instagramjdbc.entity;

import java.time.LocalDateTime;

public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userGender;
    private String userEmail;
    private String userCategory;
    private String userBio;
    private Integer userFollower;
    private Integer userFollowing;
    private Integer userPostCount;
    private LocalDateTime userCreatedAt;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(String userName, String userPassword, String userGender, String userEmail) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userEmail = userEmail;
    }

    public User(Integer userId, String userName, String userPassword, String userGender, String userEmail, String userCategory, String userBio, Integer userFollower, Integer userFollowing, Integer userPostCount) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userEmail = userEmail;
        this.userCategory = userCategory;
        this.userBio = userBio;
        this.userFollower = userFollower;
        this.userFollowing = userFollowing;
        this.userPostCount = userPostCount;
        this.userCreatedAt = LocalDateTime.now();
    }

    public User(Integer userId, String userName, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public Integer getUserFollower() {
        return userFollower;
    }

    public void setUserFollower(Integer userFollower) {
        this.userFollower = userFollower;
    }

    public Integer getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(Integer userFollowing) {
        this.userFollowing = userFollowing;
    }

    public Integer getUserPostCount() {
        return userPostCount;
    }

    public void setUserPostCount(Integer userPostCount) {
        this.userPostCount = userPostCount;
    }

    public LocalDateTime getUserCreatedAt() {
        return userCreatedAt;
    }

    public void setUserCreatedAt(LocalDateTime userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
    }

    @Override
    public String toString() {
        return "User [ " +
                "userId: " + userId + " ,userName: " + userName + " ,userPassword: " + userPassword +
                " ,userGender='" + userGender + " ,userEmail: " + userEmail + " ,userCategory: " + userCategory +
                " ,userBio='" + userBio + " ,userFollower=" + userFollower + " ,userFollowing: " + userFollowing +
                " ,userPostCount: " + userPostCount + " ,userCreatedAt:" + userCreatedAt + ']';
    }
}
