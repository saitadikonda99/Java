package com.sai.leet.pro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class HotelBookingSystem extends JFrame implements ActionListener {
    private JLabel nameLabel, ageLabel, genderLabel, checkinLabel, checkoutLabel, peopleLabel, roomLabel;
    private JTextField nameField, ageField, genderField, checkinField, checkoutField, peopleField, roomField;
    private JButton submitButton;

    public HotelBookingSystem() {
        setTitle("Hotel Booking System");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        genderLabel = new JLabel("Gender:");
        checkinLabel = new JLabel("Check-in Date:");
        checkoutLabel = new JLabel("Check-out Date:");
        peopleLabel = new JLabel("No of People:");
        roomLabel = new JLabel("Room Preference:");

        nameField = new JTextField();
        ageField = new JTextField();
        genderField = new JTextField();
        checkinField = new JTextField();
        checkoutField = new JTextField();
        peopleField = new JTextField();
        roomField = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(8, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(genderLabel);
        panel.add(genderField);
        panel.add(checkinLabel);
        panel.add(checkinField);
        panel.add(checkoutLabel);
        panel.add(checkoutField);
        panel.add(peopleLabel);
        panel.add(peopleField);
        panel.add(roomLabel);
        panel.add(roomField);
        panel.add(new JLabel(""));
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String gender = genderField.getText();
            String checkin = checkinField.getText();
            String checkout = checkoutField.getText();
            int people = Integer.parseInt(peopleField.getText());
            String room = roomField.getText();

            if (name.equals("") || gender.equals("") || checkin.equals("") || checkout.equals("") || room.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill in all the details.");
            } else if (age < 18 || age > 120) {
                JOptionPane.showMessageDialog(this, "Please enter a valid age.");
            } else if (people < 1) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number of people.");
            } else {
                try {
                    FileWriter writer = new FileWriter("bookings.txt", true);
                    writer.write(name + "," + age + "," + gender + "," + checkin + "," + checkout + "," + people + "," + room + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Booking confirmed!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                nameField.setText("");
                ageField.setText("");
                genderField.setText("");
                checkinField.setText("");
                checkoutField.setText("");
                peopleField.setText("");
                roomField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new HotelBookingSystem();
    }
}
