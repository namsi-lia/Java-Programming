import javax.swing.*;

public class SwingExample {
    //create a constructor
    SwingExample() {
        JFrame frame = new JFrame("first Swing example");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("this is interesting");
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingExample();

            }
        });
    }
}
