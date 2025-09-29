import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AWT {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Swing Example");

        JLabel label1 = new JLabel("Hello, this is a swing label!");
        JButton button1 = new JButton("Click Me!");
        JLabel label2 = new JLabel("Hello, Know About Us!");
        JButton button2 = new JButton("Contact Me!");
        JLabel label3 = new JLabel("Submit HERE!");
        JButton button3 = new JButton("Submit!");

        // Layout first
        frame.setLayout(new FlowLayout());

        // Add components
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Set colors
        button1.setForeground(Color.BLACK);
        button2.setForeground(Color.YELLOW);
        button3.setBackground(Color.BLUE);

        frame.getContentPane().setBackground(Color.RED);

        // Frame settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add Window Listener (optional, since EXIT_ON_CLOSE already works)
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}
