
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main3 extends JFrame {
    String gapList[] = { "0", "5", "10", "15", "20" };
    int maxGap = 20;
    JComboBox horizontalGapComboBox;
    JComboBox verticalGapComboBox;
    JButton applyButton = new JButton("APPLY GAPS");
    GridLayout experimentLayout = new GridLayout(0, 2);

    Main3(String name) {
        super(name);
        setResizable(false);
    }

    public void initGaps() {
        horizontalGapComboBox = new JComboBox(gapList);
        verticalGapComboBox = new JComboBox(gapList);
    }

    public void addComponentsToPane(final Container pane) {
        initGaps();
        JPanel panel = new JPanel();
        panel.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2, 3));

        JButton b = new JButton("Fake button");
        Dimension buttonSize = b.getPreferredSize();
        panel.setPreferredSize(new Dimension((int) (buttonSize.getWidth() * 2.5) + maxGap,
                (int) (buttonSize.getHeight() * 3.5) + maxGap * 2));

        panel.add(new JButton("BUTTON 1"));
        panel.add(new JButton("BUTTON 2"));
        panel.add(new JButton("BUTTON 3"));
        panel.add(new JButton("BUTTON 4"));
        panel.add(new JButton("BUTTON 5"));

        controls.add(new Label("HORIZONTAL GAP:"));
        controls.add(new Label("VERTICAL GAP:"));
        controls.add(new Label(" "));
        controls.add(horizontalGapComboBox);
        controls.add(verticalGapComboBox);
        controls.add(applyButton);

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String horizontalGap = (String) horizontalGapComboBox.getSelectedItem();
                String verticalGap = (String) verticalGapComboBox.getSelectedItem();
                experimentLayout.setHgap(Integer.parseInt(horizontalGap));
                experimentLayout.setVgap(Integer.parseInt(verticalGap));
                experimentLayout.layoutContainer(panel);
            }
        });
        pane.add(panel, BorderLayout.NORTH);
        pane.add(new JSeparator(), BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH);
    }

    static void createAndShowGUI() {

        Main3 frame = new Main3("GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}