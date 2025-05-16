
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4graphic {

    public static void main(String[] args) {

        JFrame frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        JLabel username = new JLabel("USERNAME : ");
        username.setBounds(10, 10, 100, 20);
        frame.add(username);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 10, 200, 20);
        frame.add(usernameField);

        JLabel email = new JLabel("EMAIL : ");
        email.setBounds(10, 50, 100, 20);
        frame.add(email);

        JTextField emailField = new JTextField();
        emailField.setBounds(100, 50, 200, 20);
        frame.add(emailField);

        JLabel password = new JLabel("PASSWORD : ");
        password.setBounds(10, 90, 100, 20);
        frame.add(password);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 90, 200, 20);
        frame.add(passwordField);

        JLabel gender = new JLabel("GENDER : ");
        gender.setBounds(10, 130, 100, 20);
        frame.add(gender);

        JRadioButton rbMALE = new JRadioButton("MALE");
        rbMALE.setBounds(100, 130, 100, 20);
        frame.add(rbMALE);

        JRadioButton rbFEMALE = new JRadioButton("FEMALE");
        rbFEMALE.setBounds(200, 130, 100, 20);
        frame.add(rbFEMALE);

        // Create a ButtonGroup to group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMALE);
        genderGroup.add(rbFEMALE);

        JLabel interest = new JLabel("INTEREST IN : ");
        interest.setBounds(10, 170, 100, 20);
        frame.add(interest);

        JCheckBox java = new JCheckBox("JAVA");
        java.setBounds(100, 170, 100, 20);
        frame.add(java);

        JCheckBox python = new JCheckBox("PYTHON");
        python.setBounds(200, 170, 110, 20);
        frame.add(python);

        JCheckBox cPP = new JCheckBox("C++");
        cPP.setBounds(300, 170, 100, 20);
        frame.add(cPP);

        JButton button = new JButton("SUBMIT");
        button.setBounds(100, 210, 100, 30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                StringBuilder selectedOptions = new StringBuilder("INTERESTS : ");
                if (java.isSelected()) {
                    selectedOptions.append("JAVA");
                }
                if (python.isSelected()) {
                    selectedOptions.append("PYTHON");
                }
                if (cPP.isSelected()) {
                    selectedOptions.append("C++");
                }

                if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please Fill All Fields");
                } else {
                    String selectedGender = rbMALE.isSelected() ? "MALE" : (rbFEMALE.isSelected() ? "FEMALE" : "Not Specified");
                    JOptionPane.showMessageDialog(frame,
                            "USERNAME : " + username + '\n' +
                                    "EMAIL : " + email + '\n' +
                                    "PASSWORD : " + password + '\n' +
                                    "GENDER : " + selectedGender + '\n' +
                                    "INTERESTS : " + selectedOptions );
                }
            }
        });

        frame.setVisible(true);
    }
}
