package Architectural.MVVM;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    static List<User> userList = new ArrayList<>();

    static void setUpList() {
        userList.add(new User("Denis", 22, "dp1999", "30091999"));
    }

}
