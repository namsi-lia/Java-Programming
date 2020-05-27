import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class scrollpane {
    JLabel label;
    JList list;
    JScrollPane scrollPane;
    String [] mysites;

    public scrollpane(){
        label =new JLabel("" );
        mysites=new String[]{"The Eiffel Tower","The serengeti","The Statue of Liberty","The buckingham palace","The Masai Mara"};
        list=new JList(mysites);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                int index =list.getSelectedIndex();
                if (index !=-1){
                    label.setText("site to visit:"+mysites[index]);

                }
            }
        });
        scrollPane=new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(130,90));
        JFrame frame=new JFrame("Using List");
        frame.setLayout(new FlowLayout());
        frame.setSize(700,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(list);
        frame.add(scrollPane  );
        frame.add(label);
        frame.setVisible(true);
    }
    public static void main (String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new scrollpane();
            }
        });
    }
}

