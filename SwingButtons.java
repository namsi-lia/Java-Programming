import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingButtons {
    JLabel label;
    JTextField textField;
    JButton button;

    public SwingButtons() {
        label = new JLabel("");
        button = new JButton("enter text into the label");
        textField = new JTextField("Type Text Here");
        JFrame frame = new JFrame("using textfileds");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText(textField.getText());
            }

        });
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText(textField.getText());
            }


        });
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingButtons();
            }
        });
    }
}
