import java.awt.*;
import javax.swing.*;

public class LayoutManager {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Layout Manager Example");
        frame.setLayout(new BorderLayout());

        frame.add(new Button("North"), BorderLayout.NORTH);
        frame.add(new Button("South"), BorderLayout.SOUTH);
        frame.add(new Button( "East"), BorderLayout.EAST);
        frame.add(new Button("West"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);


        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}