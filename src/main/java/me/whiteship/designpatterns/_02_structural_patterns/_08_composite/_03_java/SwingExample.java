package me.whiteship.designpatterns._02_structural_patterns._08_composite._03_java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);

        JButton jButton = new JButton("클릭");
        jButton.setBounds(200, 100, 60, 40);
        jButton.addActionListener(e -> textField.setText("스윙 실행"));

        frame.add(jButton);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
