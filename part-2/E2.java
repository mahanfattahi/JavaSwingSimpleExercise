import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2graphic {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Greeting App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 300, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Please Enter Your Name : ");
        label.setBounds(50, 20, 200, 30);
        frame.add(label);

        JTextField textfield = new JTextField();
        textfield.setBounds(50, 60, 200, 30);
        frame.add(textfield);

        JButton button = new JButton("Greet");
        button.setBounds(50, 100, 200, 30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textfield.getText();
                if(name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please Enter Your Name");
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Hello " + name + "!");
                    JOptionPane.showMessageDialog(frame, "How Are You ?  " + name );
                }

            }
        });

        frame.setVisible(true);

    }
}
