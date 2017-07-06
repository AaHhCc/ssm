package com.jyh.domain;

import java.util.Date;

public class Article {
    private String articleId;

    private String articleTitle;

    private String articleSummary;

    private Integer commentNum;

    private Date articleDate;

    private String authorId;

    private Integer readnum;

    private String tag;

    private Integer type;

    private Integer classification;

    private String collectorId;

    private Integer state;

    private String articleContent;

    public Article(String articleId, String articleTitle, String articleSummary, Integer commentNum, Date articleDate, String authorId, Integer readnum, String tag, Integer type, Integer classification, String collectorId, Integer state, String articleContent) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.commentNum = commentNum;
        this.articleDate = articleDate;
        this.authorId = authorId;
        this.readnum = readnum;
        this.tag = tag;
        this.type = type;
        this.classification = classification;
        this.collectorId = collectorId;
        this.state = state;
        this.articleContent = articleContent;
    }

    public Article() {
        super();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary == null ? null : articleSummary.trim();
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public String getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(String collectorId) {
        this.collectorId = collectorId == null ? null : collectorId.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleSummary='" + articleSummary + '\'' +
                ", commentNum=" + commentNum +
                ", articleDate=" + articleDate +
                ", authorId='" + authorId + '\'' +
                ", readnum=" + readnum +
                ", tag='" + tag + '\'' +
                ", type=" + type +
                ", classification=" + classification +
                ", collectorId='" + collectorId + '\'' +
                ", state=" + state +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }
}