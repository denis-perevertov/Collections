package Architectural.MVVM;

public class Main {

    public static void main(String[] args) {

        start();

    }

    public static void start() {
        UserList.setUpList();
        UserLoginViewModel viewModel = new UserLoginViewModel();
        new View(viewModel);
    }

}
