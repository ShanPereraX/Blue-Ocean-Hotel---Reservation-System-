package model;

public class User{
    String userName;
    String passWord;
    String passWordHint;

    public User(String userName, String passWord, String passWordHint) {
        this.userName = userName;
        this.passWord = passWord;
        this.passWordHint = passWordHint;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWordHint() {
        return passWordHint;
    }

    public void setPassWordHint(String passWordHint) {
        this.passWordHint = passWordHint;
    }
}
