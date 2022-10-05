package Architectural.MVP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVPDemo {


    public static void main(String[] args) {

        LoginModel loginModel = new Model();
        LoginPresenter loginPresenter = new Presenter();
        loginPresenter.setModel(loginModel);
        LoginView loginView = new View();
        loginPresenter.setView(loginView);
        loginPresenter.setOnLogin(new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "Welcome");
            }
        });
        loginPresenter.run();

    }



}

interface LoginModel {

    String getUser();

    void setUser(String user);
}

class Model implements LoginModel {

    String user;

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }

}

interface LoginView {

    LoginPresenter getPresenter();

    void setPresenter(LoginPresenter loginPresenter);

    void updateModelFromView();

    void updateViewFromModel();

    void open();

    void close();

    void userRejected();

}

class View extends JFrame implements LoginView {

    private LoginPresenter loginPresenter;

    public View() {
        initComponents();
    }

    public void initComponents() {

        GridBagConstraints gridBagConstraints;

        JLabel label1 = new JLabel();
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel();
        JButton button1 = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,0,0);
        GridBagLayout grid = new GridBagLayout();
        grid.columnWidths = new int[] {0,7,0};
        grid.rowHeights = new int[] {0,7,0,7,0};
        getContentPane().setLayout(grid);

        label1.setFont(new Font("Tahoma", 1,11));
        label1.setText("Welcome");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(label1, gridBagConstraints);

        textField1.setColumns(13);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(textField1, gridBagConstraints);

        label2.setText("User");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(label2,gridBagConstraints);

        button1.setText("login");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getPresenter().login();
            }
        });
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(button1, gridBagConstraints);

        pack();
        setVisible(true);

    }

    public JButton button1 = new JButton();
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    public JTextField textField1 = new JTextField();
    @Override
    public LoginPresenter getPresenter() {
        return loginPresenter;
    }

    @Override
    public void setPresenter(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void updateModelFromView() {
        getPresenter().getModel().setUser(textField1.getText());
    }

    @Override
    public void updateViewFromModel() {
        textField1.setText(getPresenter().getModel().getUser());
    }

    @Override
    public void open() {
        setVisible(true);
        textField1.selectAll();
        textField1.requestFocus();
    }

    @Override
    public void close() {
        dispose();
    }

    @Override
    public void userRejected() {
        label1.setText("Try again))");
        textField1.selectAll();
        textField1.requestFocus();
    }
}

interface LoginPresenter {

    LoginModel getModel();

    void setModel(LoginModel loginModel);

    LoginView getView();

    void setView(LoginView loginView);

    void setOnLogin(Runnable onLogin);

    void run();

    void login();

}

class Presenter implements LoginPresenter {

    LoginModel loginModel;
    LoginView loginView;
    private Runnable onLogin;


    @Override
    public LoginModel getModel() {
        return loginModel;
    }

    @Override
    public void setModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public LoginView getView() {
        return loginView;
    }

    @Override
    public void setView(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void setOnLogin(Runnable onLogin) {
        this.onLogin = onLogin;
    }

    @Override
    public void run() {
        loginModel.setUser("previousUser");
        loginView.setPresenter(this);
        loginView.updateViewFromModel();
        loginView.open();
    }

    @Override
    public void login() {
        loginView.updateModelFromView();
        if (loginModel.getUser().equalsIgnoreCase("root")) {
            loginView.close();
            loginView.setPresenter(null);
            onLogin.run();
        } else loginView.userRejected();
    }
}
