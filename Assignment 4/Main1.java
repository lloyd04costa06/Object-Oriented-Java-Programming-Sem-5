
// WAP to implement BorderLayout
import java.awt.*;
import javax.swing.*;

public class Main1 {
    static void addComponentsToPane(Container pane) {

        JButton button = new JButton("TOP");
        pane.add(button, BorderLayout.NORTH);

        button = new JButton("CENTER");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);

        button = new JButton("LEFT");
        pane.add(button, BorderLayout.WEST);

        button = new JButton("BOTTOM");
        pane.add(button, BorderLayout.SOUTH);

        button = new JButton("RIGHT");
        pane.add(button, BorderLayout.EAST);
    }

    private static void GUI() {
        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI();
    }
}