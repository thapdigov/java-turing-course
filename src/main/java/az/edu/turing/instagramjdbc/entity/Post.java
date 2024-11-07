package az.edu.turing.instagramjdbc.entity;

import java.time.LocalDateTime;

public class Post {
    private Integer postId;
    private String postTitle;
    private String postLocation;
    private String postUrl;
    private Integer postlikeCount;
    private Integer postCommentCount;
    private Integer postSavedCount;
    private Integer postSendCount;
    private Integer postUserId;
    private LocalDateTime postCreatedat;

    public Post() {
    }

    public Post(Integer postId) {
        this.postId = postId;
    }

    public Post(String postUrl, Integer postUserId) {
        this.postUrl = postUrl;
        this.postUserId = postUserId;
    }

    public Post(Integer postId, String postTitle, String postLocation, String postUrl, Integer postlikeCount, Integer postCommentCount, Integer postSavedCount, Integer postSendCount, Integer postUserId) {
        this.postId = postId;
        this.postTitle = postTitle;
        this.postLocation = postLocation;
        this.postUrl = postUrl;
        this.postlikeCount = postlikeCount;
        this.postCommentCount = postCommentCount;
        this.postSavedCount = postSavedCount;
        this.postSendCount = postSendCount;
        this.postUserId = postUserId;
        this.postCreatedat = LocalDateTime.now();
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostLocation() {
        return postLocation;
    }

    public void setPostLocation(String postLocation) {
        this.postLocation = postLocation;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public Integer getPostlikeCount() {
        return postlikeCount;
    }

    public void setPostlikeCount(Integer postlikeCount) {
        this.postlikeCount = postlikeCount;
    }

    public Integer getPostCommentCount() {
        return postCommentCount;
    }

    public void setPostCommentCount(Integer postCommentCount) {
        this.postCommentCount = postCommentCount;
    }

    public Integer getPostSavedCount() {
        return postSavedCount;
    }

    public void setPostSavedCount(Integer postSavedCount) {
        this.postSavedCount = postSavedCount;
    }

    public Integer getPostSendCount() {
        return postSendCount;
    }

    public void setPostSendCount(Integer postSendCount) {
        this.postSendCount = postSendCount;
    }

    public Integer getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(Integer postUserId) {
        this.postUserId = postUserId;
    }

    public LocalDateTime getPostCreatedat() {
        return postCreatedat;
    }

    public void setPostCreatedat(LocalDateTime postCreatedat) {
        this.postCreatedat = postCreatedat;
    }

    @Override
    public String toString() {
        return "Post [ " +
                "postId: " + postId + " ,postTitle: " + postTitle + " ,postLocation: " + postLocation +
                " ,postUrl: " + postUrl + " ,postlikeCount: " + postlikeCount + " ,postCommentCount: " + postCommentCount +
                " ,postSavedCount: " + postSavedCount + " ,postSendCount: " + postSendCount + " ,postUserId: " + postUserId +
                " ,postCreatedat: " + postCreatedat + ']';
    }
}
