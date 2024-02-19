/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonthree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends JFrame {
    // Constructor
    public UserForm() {
        // Frame setup
        setTitle("User Information Form");
        setSize(300, 200); // Set size of the frame
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Create and add components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        add(nameLabel);
        add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        add(emailLabel);
        add(emailField);

        JButton submitButton = new JButton("Submit");
        add(submitButton);

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();

                // Show information in a popup
                JOptionPane.showMessageDialog(UserForm.this,
                        "Name: " + name + "\nEmail: " + email,
                        "User Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
