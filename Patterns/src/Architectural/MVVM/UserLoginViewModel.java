package Architectural.MVVM;

import java.util.List;

public class UserLoginViewModel {

    static User user;
    static List<User> userList;

    UserLoginViewModel() {
        userList = UserList.userList;
    }

    public static boolean checkInput(String login, String password, String conf_password) {

        int i = 0;
        while(i < userList.size()) {
            user = userList.get(i);
            if(user.username.equalsIgnoreCase(login)
                    && user.password.equalsIgnoreCase(password)
                    && user.password.equalsIgnoreCase(conf_password)) {
                System.out.println("View model found match, returning info to the view");
                return true;
            }
            else if(!user.password.equalsIgnoreCase(password)) {
                System.out.println("Wrong password!");
                i++;
            }
            else if(!user.password.equalsIgnoreCase(conf_password)) {
                System.out.println("Please confirm your password!");
                i++;
            }
            else i++;
        }
        System.out.println("Login unsuccessful");
        return false;
    }

}
