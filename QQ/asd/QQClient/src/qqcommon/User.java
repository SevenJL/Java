package src.qqcommon;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
   private String userID;
   private String password;
   public User(){

   }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }
}
