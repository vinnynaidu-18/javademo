package SwiggyOrder;

public class Login {
    public String userName;
    public String password;

    public String Login(Login details) {
        String localUserName = "Tech Junkies";
        String localpassword = "Neoteric";

        if (localUserName.equals(details.userName) && localpassword.equals(details.password)) {

        }
            return "login successful";

        }

}


































