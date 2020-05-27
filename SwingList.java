import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class SwingList {
    JLabel label;
    JList list;
    String[] naisites;

    public SwingList(){
        label =new JLabel("" );
        naisites=new String[]{"The railway Museum","The Kenya National Museum","The kicc","The Kenya National Archives"};
        list=new JList(naisites);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                int index =list.getSelectedIndex();
                if (index !=-1){
                    label.setText("site to visit:"+naisites[index]);

                }
            }
        });
        JFrame frame=new JFrame("Using List");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(list);
        frame.add(label);
        frame.setVisible(true);
    }
    public static void main (String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingList();
            }
        });
    }
}
