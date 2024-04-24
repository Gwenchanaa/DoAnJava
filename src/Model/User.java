package model;

public class User {
    
    String UserID, UserName, UserPassword;

    public User(String UserID, String UserName) {
        this.UserID = UserID;
        this.UserName = UserName;
    }

    public User(String UserID, String UserName, String UserPassword) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.UserPassword = UserPassword;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    @Override
    public String toString() {
        return "User{" + "UserID=" + UserID + ", UserName=" + UserName + ", UserPassword=" + UserPassword + '}';
    }

}
