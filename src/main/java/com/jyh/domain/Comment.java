package com.jyh.domain;

import java.util.Date;

public class Comment {
    private String commentId;

    private String commentUser;

    private String commentArticle;

    private String replyUser;

    private String commentContent;

    private Date commentDate;

    private Integer floor;

    public Comment(String commentId, String commentUser, String commentArticle, String replyUser, String commentContent, Date commentDate, Integer floor) {
        this.commentId = commentId;
        this.commentUser = commentUser;
        this.commentArticle = commentArticle;
        this.replyUser = replyUser;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.floor = floor;
    }

    public Comment() {
        super();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser == null ? null : commentUser.trim();
    }

    public String getCommentArticle() {
        return commentArticle;
    }

    public void setCommentArticle(String commentArticle) {
        this.commentArticle = commentArticle == null ? null : commentArticle.trim();
    }

    public String getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(String replyUser) {
        this.replyUser = replyUser == null ? null : replyUser.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId='" + commentId + '\'' +
                ", commentUser='" + commentUser + '\'' +
                ", commentArticle='" + commentArticle + '\'' +
                ", replyUser='" + replyUser + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentDate=" + commentDate +
                ", floor=" + floor +
                '}';
    }
}