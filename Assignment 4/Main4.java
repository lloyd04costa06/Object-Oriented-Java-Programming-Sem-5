
// WAP to implement CardLayout
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main4 implements ItemListener {
    JPanel cards; // a panel that uses CardLayout
    final static String BUTTONPANEL = "CARD WITH BUTTON";
    final static String TEXTPANEL = "CARD WITH TEXTFIELD";

    public void addComponentToPane(Container pane) {
        JPanel comboBoxPane = new JPanel(); // use FlowLayout
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);

        JPanel card1 = new JPanel();
        card1.add(new JButton("BUTTON 1"));
        card1.add(new JButton("BUTTON 2"));
        card1.add(new JButton("BUTTON 3"));

        JPanel card2 = new JPanel();
        card2.add(new JTextField("ENTER HERE ", 20));

        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);

        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, (String) evt.getItem());
    }

    private static void GUI() {
        JFrame frame = new JFrame("CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Main4 demo = new Main4();
        demo.addComponentToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI();
    }
}