package Architectural.MVP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogView extends JFrame implements ViewActions, ActionListener {

    MyPresenter presenter;

    JPanel panel = new JPanel();
    JLabel loginLabel = new JLabel("Login");
    JLabel passwordLabel = new JLabel("Password");

    JTextField loginField = new JTextField(10);
    JTextField passwordField = new JTextField(10);

    JButton submitButton = new JButton("Submit");

    LogView(MyPresenter presenter) {

        this.presenter = presenter;

        setTitle("Login");
        setSize(300,200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        add(panel);

        add(loginLabel);
        add(loginField);

        add(passwordLabel);
        add(passwordField);

        add(submitButton);

        pack();

        submitButton.addActionListener(this);

        setVisible(true);

    }

    public void setPresenter (MyPresenter presenter) {
        this.presenter = presenter;
    }

    public MyPresenter getPresenter() {
        return presenter;
    }


    @Override
    public void update() {
        System.out.println("Login successful with username: " + loginField.getText() + " and password: " + passwordField.getText());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton) {

            if(!loginField.getText().equals("") && !passwordField.getText().equals("")) {
                dispose();
                presenter.setView(new MainView(presenter));
            }
            else {
                JOptionPane.showMessageDialog(this, "Input login/password please");
                System.out.println("Login attempt unsuccessful with username: " + loginField.getText() + " and password: " + passwordField.getText());
                loginField.setText("");
                passwordField.setText("");
            }
        }
    }
}
