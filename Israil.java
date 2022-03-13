import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Israil {
    private JTextField output;
    private JButton b3;
    private JButton b2;
    private JButton bplus;
    private JButton bminus;
    private JButton b6;
    private JButton b5;
    private JButton b4;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bmul;
    private JButton b0;
    private JButton bequal;
    private JButton bdiv;
    private JButton bdot;
    private JButton b1;
    private JPanel panel1;

    public Israil() {
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s= output.getText();
                if(s.startsWith("0")) output.setText("0");
                else output.setText(s+"0");

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=output.getText();
                if(s.startsWith("0")) output.setText("1");
                else output.setText(s+"1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=output.getText();
                if(s.startsWith("0")) output.setText("2");
                else output.setText(s+"2");

            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s= output.getText();
                if(s.startsWith("0")) output.setText("3");
                else output.setText(s+"3");


            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("4");
            else output.setText(s+"4");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("5");
            else output.setText(s+"5");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("6");
            else output.setText(s+"6");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             String s=output.getText();
             if(s.startsWith("0")) output.setText("7");
             else output.setText(s+"7");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("8");
            else output.setText(s+"8");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("9");
            else output.setText(s+"9");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Israil");
        frame.setContentPane(new Israil().panel1);//panelname
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
