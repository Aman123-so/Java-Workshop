import javax.swing.*;

public class Component {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components and Containers");
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JLabel label1 = new JLabel("Enter Age:");
        JTextField textField1 = new JTextField(15);
        JButton button1 = new JButton("Reset");

        JPanel panel = new JPanel(); // Container
        panel.add(label);
        panel.add(textField);
        panel.add(label1);
        panel.add(textField1);
        panel.add(button);
        panel.add(button1);

        frame.add(panel);

        frame.setSize(600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}