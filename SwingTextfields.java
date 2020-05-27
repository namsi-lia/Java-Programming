import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingTextfields {
JLabel label;
JTextField textField;
public SwingTextfields(){
    label=new JLabel("" );
    textField=new JTextField("Type Text Here");
    JFrame frame=new JFrame("using textfileds");
    frame.setLayout(new FlowLayout());
    frame.setSize(500,250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    textField.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
                label.setText(textField.getText());
            }

    });

    frame.add(textField);
    frame.add(label);
    frame.setVisible(true);
}
public static void main(String[]args){
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new SwingTextfields();
        }
    });
}
}
