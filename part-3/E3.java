import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3graphic {

    public static void main(String[] args) {

        JFrame frame = new JFrame("ColorChanger");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        JButton redButton = new JButton("RED");
        redButton.setBounds(20, 40, 100, 30);
        frame.add(redButton);

        JButton greenButton = new JButton("GREEN");
        greenButton.setBounds(120, 40, 100, 30);
        frame.add(greenButton);

        JButton blueButton = new JButton("BLUE");
        blueButton.setBounds(220, 40, 100, 30);
        frame.add(blueButton);

        redButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                frame.getContentPane().setBackground(Color.RED);
            }
        });

        greenButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                frame.getContentPane().setBackground(Color.GREEN);
            }
        });

        blueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                frame.getContentPane().setBackground(Color.BLUE);
            }
        });

        frame.setVisible(true);
    }
}
