package az.edu.turing.instagramjdbc.entity;

import java.time.LocalDateTime;

public class Like {
    private Integer likeId;
    private Integer likePostId;
    private String likeUserId;
    private LocalDateTime postCreatedat;

    public Like() {
    }

    public Like(Integer likeId) {
        this.likeId = likeId;
    }

    public Like(Integer likePostId, String likeUserId) {
        this.likePostId = likePostId;
        this.likeUserId = likeUserId;
    }

    public Like(Integer likeId, Integer likePostId, String likeUserId) {
        this.likeId = likeId;
        this.likePostId = likePostId;
        this.likeUserId = likeUserId;
        this.postCreatedat = LocalDateTime.now();
    }

    public Integer getLikeId() {
        return likeId;
    }

    public Integer getLikePostId() {
        return likePostId;
    }

    public String getLikeUserId() {
        return likeUserId;
    }

    public LocalDateTime getPostCreatedat() {
        return postCreatedat;
    }

    @Override
    public String toString() {
        return "Like [ " + "likeId: " + likeId + " ,likePostId: " + likePostId + " ,likeUserId: "
                + likeUserId + " ,postCreatedat: " + postCreatedat + ']';
    }
}
