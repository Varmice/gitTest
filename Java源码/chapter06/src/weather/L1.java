package weather;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L1 {
    private JTextField text1;
    private JButton button1;
    private JPanel JP1;
    private JTextArea text2;

    public L1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String city = text1.getText();
                text2.setText(city + "    " + "test by songjp.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("L1");
        frame.setContentPane(new L1().JP1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        JP1 = new JPanel();
        JP1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        text1 = new JTextField();
        text1.setColumns(20);
        text1.setHorizontalAlignment(2);
        JP1.add(text1);
        button1 = new JButton();
        button1.setText("Button");
        JP1.add(button1);
        text2 = new JTextArea();
        text2.setColumns(20);
        text2.setRows(10);
        JP1.add(text2);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return JP1;
    }

}
