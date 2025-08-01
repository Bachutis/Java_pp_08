import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My first App");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JLabel text = new JLabel("Hello World!");

        JButton btn = new JButton("Click me");

        frame.add(text);
        frame.add(btn);

        frame.setVisible(true);

    }
}