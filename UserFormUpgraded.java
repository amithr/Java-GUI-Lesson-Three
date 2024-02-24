/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonthree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author amith
 */
public class UserFormUpgraded extends JFrame {
    // Constructor
    public UserFormUpgraded() {
        // Frame setup
        setTitle("User Information Form");
        setSize(600, 450); // Adjusted size for additional components
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT)); // Adjusted for spacing

        JPanel idPanel = new JPanel();
        // Name field
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        idPanel.add(nameLabel);
        idPanel.add(nameField);

        // Email field
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        idPanel.add(emailLabel);
        idPanel.add(emailField);
        
        add(idPanel);
        
        JPanel passwordPanel = new JPanel();

        // Password field
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        
        add(passwordPanel);
        
     
        // Checkbox
        JCheckBox newsletterCheckbox = new JCheckBox("Subscribe to newsletter?");
        add(newsletterCheckbox);
        
        JPanel genderPanel = new JPanel();

        // Radio buttons
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        // Group the radio buttons.
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(genderLabel);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        
        add(genderPanel);
        
        JPanel departmentPanel = new JPanel();
        
        // Dropdown (ComboBox)
        JLabel departmentLabel = new JLabel("Department:");
        String[] departments = {"IT", "HR", "Finance", "Marketing"};
        JComboBox<String> departmentComboBox = new JComboBox<>(departments);
        departmentPanel.add(departmentLabel);
        departmentPanel.add(departmentComboBox);
        
        add(departmentPanel);
        
        JPanel agePanel = new JPanel();

        // Slider for age
        JLabel ageLabel = new JLabel("Age:");
        JSlider ageSlider = new JSlider(18, 100, 25); // Range between 18 and 100, starting at 25
        ageSlider.setMajorTickSpacing(10);
        ageSlider.setMinorTickSpacing(1);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);
         // Create a label to display the value
        JLabel valueLabel = new JLabel("Value: 50");

        // Add a change listener to the slider
        ageSlider.addChangeListener(e -> {
            int value = ((JSlider)e.getSource()).getValue();
            valueLabel.setText("Value: " + value);
        });
      
        agePanel.add(ageLabel);
        agePanel.add(ageSlider);
        agePanel.add(valueLabel);
        add(agePanel);
        
        JPanel commentsPanel = new JPanel();

        // Text area for comments
        JLabel commentsLabel = new JLabel("Comments:");
        JTextArea commentsTextArea = new JTextArea(5, 20); // 5 rows, 20 columns
        JScrollPane commentsScrollPane = new JScrollPane(commentsTextArea);
        commentsPanel.add(commentsLabel);
        commentsPanel.add(commentsScrollPane);

        // Submit button
        JButton submitButton = new JButton("Submit");
        
        add(submitButton);

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                boolean newsletter = newsletterCheckbox.isSelected();
                String gender = maleRadio.isSelected() ? "Male" : "Female";
                String department = (String) departmentComboBox.getSelectedItem();
                int age = ageSlider.getValue();
                String comments = commentsTextArea.getText();

                // Show information in a popup
                JOptionPane.showMessageDialog(UserFormUpgraded.this,
                        "Name: " + name + "\nEmail: " + email + "\nPassword: " + password + 
                        "\nNewsletter: " + newsletter + "\nGender: " + gender + 
                        "\nDepartment: " + department + "\nAge: " + age + 
                        "\nComments: " + comments,
                        "User Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
