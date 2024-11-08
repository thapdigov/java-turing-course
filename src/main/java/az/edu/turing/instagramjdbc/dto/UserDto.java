package az.edu.turing.instagramjdbc.dto;

public class UserDto {
    private Integer userId;
    private String userName;
    private String userBio;
    private Integer userFollower;
    private Integer userFollowing;
    private Integer userPostCount;

    public UserDto() {
    }

    public UserDto(Integer userId) {
        this.userId = userId;
    }

    public UserDto(String userName) {
        this.userName = userName;
    }

    public UserDto(Integer userId, String userName, String userBio, Integer userFollower, Integer userFollowing, Integer userPostCount) {
        this.userId = userId;
        this.userName = userName;
        this.userBio = userBio;
        this.userFollower = userFollower;
        this.userFollowing = userFollowing;
        this.userPostCount = userPostCount;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public void setUserFollower(Integer userFollower) {
        this.userFollower = userFollower;
    }

    public void setUserFollowing(Integer userFollowing) {
        this.userFollowing = userFollowing;
    }

    public void setUserPostCount(Integer userPostCount) {
        this.userPostCount = userPostCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserBio() {
        return userBio;
    }

    public Integer getUserFollower() {
        return userFollower;
    }

    public Integer getUserFollowing() {
        return userFollowing;
    }

    public Integer getUserPostCount() {
        return userPostCount;
    }

    @Override
    public String toString() {
        return "UserDto [" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userBio='" + userBio + '\'' +
                ", userFollower=" + userFollower +
                ", userFollowing=" + userFollowing +
                ", userPostCount=" + userPostCount +
                ']';
    }
}
