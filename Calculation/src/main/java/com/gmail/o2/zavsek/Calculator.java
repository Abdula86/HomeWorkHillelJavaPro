package com.gmail.o2.zavsek;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] buttons;
    String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "%", "+/-"
    };
    JPanel panel;
    JPanel buttonPanel;

    Calculator() {
        frame = new JFrame("Calculator");
        textField = new JTextField(20);
        buttons = new JButton[buttonLabels.length];
        panel = new JPanel(new BorderLayout());

        buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        panel.add(textField, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        switch (buttonText) {
            case "=":
                textField.setText(String.valueOf(eval(textField.getText())));
                break;
            case "C":
                textField.setText("");
                break;
            case "%":
            case "+/-":
                double currentValue = Double.parseDouble(textField.getText());
                if (buttonText.equals("%")) {
                    textField.setText(String.valueOf(currentValue / 100));
                } else {
                    textField.setText(String.valueOf(-currentValue));
                }
                break;
            default:
                textField.setText(textField.getText() + buttonText);
                break;
        }
    }

    public static double eval(String expression) {
        return 0;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
