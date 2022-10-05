package Architectural.MVP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame implements ViewActions {

    MyModel model;
    MyPresenter presenter;

    MainView(MyPresenter presenter) {

        this.presenter = presenter;
        model = presenter.getModel();

        setTitle("Main Page");
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("This is the main page");

        JButton button = new JButton("Update");

        panel.setPreferredSize(new Dimension(600,600));

        panel.add(label);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.update();
            }
        });

        add(panel);

        pack();

        setVisible(true);

        presenter.update();

    }

    @Override
    public void update() {
        for(MyModel.Customer c : model.getList()) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void setPresenter(MyPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public MyPresenter getPresenter() {
        return presenter;
    }
}
