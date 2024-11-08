package az.edu.turing.instagramjdbc.entity;

import java.time.LocalDateTime;

public class Comment {
    private Integer commentId;
    private String comment;
    private String commentLikeCount;
    private String replyComment;
    private Integer commentPostId;
    private Integer commentUserId;
    private LocalDateTime postCreatedat;

    public Comment() {
    }

    public Comment(Integer commentId) {
        this.commentId = commentId;
    }

    public Comment(String comment, Integer commentPostId, Integer commentUserId) {
        this.comment = comment;
        this.commentPostId = commentPostId;
        this.commentUserId = commentUserId;
    }

    public Comment(Integer commentId, String comment, String commentLikeCount, String replyComment, Integer commentPostId, Integer commentUserId) {
        this.commentId = commentId;
        this.comment = comment;
        this.commentLikeCount = commentLikeCount;
        this.replyComment = replyComment;
        this.commentPostId = commentPostId;
        this.commentUserId = commentUserId;
        this.postCreatedat = LocalDateTime.now();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentLikeCount() {
        return commentLikeCount;
    }

    public void setCommentLikeCount(String commentLikeCount) {
        this.commentLikeCount = commentLikeCount;
    }

    public String getReplyComment() {
        return replyComment;
    }

    public void setReplyComment(String replyComment) {
        this.replyComment = replyComment;
    }

    public Integer getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(Integer commentPostId) {
        this.commentPostId = commentPostId;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public LocalDateTime getPostCreatedat() {
        return postCreatedat;
    }

    public void setPostCreatedat(LocalDateTime postCreatedat) {
        this.postCreatedat = postCreatedat;
    }

    @Override
    public String toString() {
        return "Comment [ " +
                "commentId: " + commentId + " ,comment: " + comment + " ,commentLikeCount: " + commentLikeCount +
                " ,replyComment: " + replyComment + " ,commentPostId: " + commentPostId + " ,commentUserId: " + commentUserId +
                " ,postCreatedat: " + postCreatedat + ']';
    }
}
