import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q1graphic extends Frame implements ActionListener {

    Button button;
    Label  label;
    int count ;

    public Q1graphic() {
        button = new Button("Click ");
        button.addActionListener(this);
        add(button);

        label = new Label("Clicks = " + count);
        add(label);

        setSize(300 , 300);
        setLayout(new FlowLayout());
        setVisible(true);

        addWindowListener(  new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Clicks = "+ count);
    }
    public static void main(String[] args) {
        new Q1graphic();
    }
}