package com.feidian.logon;

public class User {
    String cardId,name,phoneId,passWord;

    public User() {
    }

    public User(String cardId, String name, String phoneId, String passWord) {
        this.cardId = cardId;
        this.name = name;
        this.phoneId = phoneId;
        this.passWord = passWord;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
