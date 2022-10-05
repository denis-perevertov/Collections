package Architectural.MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class View extends JFrame implements ActionListener {

    JLabel label1 = new JLabel("Enter the number you want to convert.");
    JTextField textField = new JTextField(5);
    JRadioButton dollar1 = new JRadioButton("dollars", true);
    JRadioButton euro1 = new JRadioButton("euros", false);
    JRadioButton rubles1 = new JRadioButton("rubles", false);
    JRadioButton hryvnas1 = new JRadioButton("hryvnas", false);
    ButtonGroup bgrp1 = new ButtonGroup();

    JRadioButton dollar2 = new JRadioButton("dollars", false);
    JRadioButton euro2 = new JRadioButton("euros", true);
    JRadioButton rubles2 = new JRadioButton("rubles", false);
    JRadioButton hryvnas2 = new JRadioButton("hryvnas", false);
    ButtonGroup bgrp2 = new ButtonGroup();

    JButton convertButton = new JButton("Convert");
    JButton showAllConversionsButton = new JButton("Show");

    JLabel label2 = new JLabel("Converted value is: ");
    JTextField textField2 = new JTextField(5);

    JLabel label3 = new JLabel();

    View() {
        setLayout(new FlowLayout());
        setSize(350,180);
        setResizable(false);
        setTitle("Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        bgrp1.add(dollar1);
        bgrp1.add(euro1);
        bgrp1.add(rubles1);
        bgrp1.add(hryvnas1);

        bgrp2.add(dollar2);
        bgrp2.add(euro2);
        bgrp2.add(rubles2);
        bgrp2.add(hryvnas2);


        add(label1);
        add(textField);
        add(dollar1);
        add(euro1);
        add(rubles1);
        add(hryvnas1);
        add(dollar2);
        add(euro2);
        add(rubles2);
        add(hryvnas2);
        add(convertButton);
        add(label2);
        add(textField2);

        add(showAllConversionsButton);

        add(label3);

        label3.setMaximumSize(new Dimension(350,300));

        convertButton.addActionListener(this);
        showAllConversionsButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == convertButton) {
            String type1 = "";
            String type2 = "";
            if(dollar1.isSelected()) type1 = CurrencyTypes.DOLLAR.name();
            else if(euro1.isSelected()) type1 = CurrencyTypes.EURO.name();
            else if(rubles1.isSelected()) type1 = CurrencyTypes.RUBLE.name();
            else if(hryvnas1.isSelected()) type1 = CurrencyTypes.HRYVNA.name();

            if (dollar2.isSelected()) type2 = CurrencyTypes.DOLLAR.name();
            else if(euro2.isSelected()) type2 = CurrencyTypes.EURO.name();
            else if(rubles2.isSelected()) type2 = CurrencyTypes.RUBLE.name();
            else if(hryvnas2.isSelected()) type2 = CurrencyTypes.HRYVNA.name();

            double convertedValue = (Controller.convert(Integer.parseInt(textField.getText()),type1,type2));

            textField2.setText(new DecimalFormat("0.00").format(convertedValue));

            System.out.println("Added transaction");

            label3.setFont(new Font("Arial", 1,8));
            label3.setText(Model.conversionList.get(Model.conversionList.size()-1).toString());

        }
        else if(e.getSource() == showAllConversionsButton) {
            Controller.showConversions();
        }

    }
}

enum CurrencyTypes {
    DOLLAR,
    EURO,
    RUBLE,
    HRYVNA
}
