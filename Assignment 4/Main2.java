
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main2 extends JFrame {
    JRadioButton RtoLbutton;
    JRadioButton LtoRbutton;
    FlowLayout experimentLayout = new FlowLayout();
    final String RtoL = "RIGHT TO LEFT";
    final String LtoR = "LEFT TO RIGHT";
    JButton applyButton = new JButton("APPLY COMPONENT ORIENTATION");

    Main2(String name) {
        super(name);
    }

    public void addComponentsToPane(final Container pane) {
        JPanel panel = new JPanel();
        panel.setLayout(experimentLayout);
        experimentLayout.setAlignment(FlowLayout.TRAILING);
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());

        LtoRbutton = new JRadioButton(LtoR);
        LtoRbutton.setActionCommand(LtoR);
        LtoRbutton.setSelected(true);
        RtoLbutton = new JRadioButton(RtoL);
        RtoLbutton.setActionCommand(RtoL);

        panel.add(new JButton("BUTTON 1"));
        panel.add(new JButton("BUTTON 2"));
        panel.add(new JButton("BUTTON 3"));
        panel.add(new JButton("BUTTON 4"));
        panel.add(new JButton("BUTTON 5"));

        ButtonGroup group = new ButtonGroup();
        group.add(LtoRbutton);
        group.add(RtoLbutton);
        controls.add(LtoRbutton);
        controls.add(RtoLbutton);
        controls.add(applyButton);

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = group.getSelection().getActionCommand();
                if (command.equals("LEFT TO RIGHT")) {
                    panel.setComponentOrientation(
                            ComponentOrientation.LEFT_TO_RIGHT);
                } else {
                    panel.setComponentOrientation(
                            ComponentOrientation.RIGHT_TO_LEFT);
                }
                panel.validate();
                panel.repaint();
            }
        });
        pane.add(panel, BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH);
        ;
    }

    static void GUI() {
        Main2 frame = new Main2("FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI();
    }
}