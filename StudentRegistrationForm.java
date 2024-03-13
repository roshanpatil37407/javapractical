import javax.swing.*;
import java.awt.*;

public class StudentRegistrationForm extends JFrame {
    private JLabel nameLabel, emailLabel, ageLabel;
    private JTextField nameField, emailField, ageField;
    private JButton submitButton;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        ageLabel = new JLabel("Age:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        ageField = new JTextField(5);

        submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String age = ageField.getText();

            JOptionPane.showMessageDialog(this,
                    "Name: " + name + "\n" +
                            "Email: " + email + "\n" +
                            "Age: " + age,
                    "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        });

        setLayout(new GridLayout(4, 2));
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(ageLabel);
        add(ageField);
        add(new JLabel()); // Empty space for alignment
        add(submitButton);

        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentRegistrationForm form = new StudentRegistrationForm();
            form.setVisible(true);
        });
    }
}
