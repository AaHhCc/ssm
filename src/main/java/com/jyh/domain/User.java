package com.jyh.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private String userId;

    private String userName;

    private String password;

    private String userNickname;

    private String userTruename;

    private String userImg;

    private Date birthday;

    private Integer gender;

    private String address;

    private String industry;

    private String career;

    private String email;

    private String telphone;

    private String qq;

    private String wechat;

    private String knowField;

    private String professionalSkill;

    private String province;

    private String city;

    private String introduction;

    private Integer visitedNum;

    public User(String userId, String userName, String password, String userNickname, String userTruename, String userImg, Date birthday, Integer gender, String address, String industry, String career, String email, String telphone, String qq, String wechat, String knowField, String professionalSkill, String province, String city, String introduction, Integer visitedNum) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userNickname = userNickname;
        this.userTruename = userTruename;
        this.userImg = userImg;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.industry = industry;
        this.career = career;
        this.email = email;
        this.telphone = telphone;
        this.qq = qq;
        this.wechat = wechat;
        this.knowField = knowField;
        this.professionalSkill = professionalSkill;
        this.province = province;
        this.city = city;
        this.introduction = introduction;
        this.visitedNum = visitedNum;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserTruename() {
        return userTruename;
    }

    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename == null ? null : userTruename.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getKnowField() {
        return knowField;
    }

    public void setKnowField(String knowField) {
        this.knowField = knowField == null ? null : knowField.trim();
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill == null ? null : professionalSkill.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getVisitedNum() {
        return visitedNum;
    }

    public void setVisitedNum(Integer visitedNum) {
        this.visitedNum = visitedNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userTruename='" + userTruename + '\'' +
                ", userImg='" + userImg + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", industry='" + industry + '\'' +
                ", career='" + career + '\'' +
                ", email='" + email + '\'' +
                ", telphone='" + telphone + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", knowField='" + knowField + '\'' +
                ", professionalSkill='" + professionalSkill + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", introduction='" + introduction + '\'' +
                ", visitedNum=" + visitedNum +
                '}';
    }
}