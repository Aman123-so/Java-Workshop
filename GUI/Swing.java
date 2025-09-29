
import java.awt.Color;
import javax.swing.*;

public class Swing{
    public static void main(String [] args){
        JFrame frame = new JFrame("Swing Example");
        JLabel label1 = new JLabel (" Hello , this is a swing label !");
        JButton button1 = new JButton ("click me!");
        JLabel label2 = new JLabel (" Hello , Know About Us!");
        JButton button2 = new JButton ("Contact Me!");
        JLabel label3 = new JLabel (" Submit HERE !");
        JButton button3 = new JButton ("Submit !");

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        button1.setForeground(Color.BLACK);
        button2.setForeground(Color.YELLOW);
        button3.setBackground(Color.BLUE);


        frame.setLayout(new java.awt.FlowLayout());
        frame.getContentPane().setBackground(Color.RED);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        }
}