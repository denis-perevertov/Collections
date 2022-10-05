package Architectural.MVVM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    UserLoginViewModel viewModel;

    JButton button = new JButton("Submit");

    JTextField textField1 = new JTextField(10);
    JTextField textField2 = new JTextField(10);
    JTextField textField3 = new JTextField(10);

    View(UserLoginViewModel viewModel) {

        this.viewModel = viewModel;

        setSize(300,300);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1,2,10,10));
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBounds(20,50,280,280);
        panel.setLayout(new GridLayout(4,2,10,10));
        textField1.setToolTipText("Username");


        JLabel login_label = new JLabel("Username");
        JLabel pass_label = new JLabel("Password");
        JLabel confirm_label = new JLabel("Confirm password");

        panel.add(login_label);
        panel.add(textField1);
        panel.add(pass_label);
        panel.add(textField2);
        panel.add(confirm_label);
        panel.add(textField3);

        JButton button2 = new JButton();

        button2.setVisible(false);

        button.addActionListener(this);

        panel.add(button2);
        panel.add(button);

        add(panel);

        pack();

        setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button) {
            if(UserLoginViewModel.checkInput(textField1.getText(), textField2.getText(), textField3.getText())) {
                System.out.println("View got the info that login data was correct");
                JOptionPane.showMessageDialog(this, "Successfully logged in!");
                dispose();
            }
        }


    }
}
