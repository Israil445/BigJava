import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JPanel panel;
    private JTextField output;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton plusButton;
    private JButton minusButton;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton mulButton;
    private JButton a0Button;
    private JButton dotButton;
    private JButton equalButton;
    private JButton divButton;
    private JButton clearButton;
    double num1,num2,result,cnt=0;
    String operator,ans;

    public Calculator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=output.getText();
                if(s.startsWith("0")) output.setText("0");
                else output.setText(s+"0");

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String s=output.getText();
               if(s.startsWith("0")) output.setText("1");
               else output.setText(s+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("2");
            else output.setText(s+"2");

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("3");
            else output.setText(s+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           String s=output.getText();
           if(s.startsWith("0")) output.setText("4");
           else output.setText(s+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("5");
            else output.setText(s+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=output.getText();
                if(s.startsWith("0")) output.setText("6");
                else output.setText(s+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           String s=output.getText();
           if(s.startsWith("0")) output.setText("7");
           else output.setText(s+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("8");
            else output.setText(s+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText("9");
            else output.setText(s+"9");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            output.setText("");
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(output.getText());
                output.setText("");
                operator="+";

            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            num1=Double.parseDouble(output.getText());
            output.setText("");
            operator="-";
            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            num1=Double.parseDouble(output.getText());
            output.setText("");
            operator="x";
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            num1=Double.parseDouble(output.getText());
            output.setText("");
            operator="/";
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String s=output.getText();
            if(s.startsWith("0")) output.setText(".");
            else output.setText(s+".");
            }
        });

        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2=Double.parseDouble(output.getText());
                switch (operator){
                    case "+":
                        result=num1+num2;
                        String s1=Double.toString(result);
                        for(int i=0;i<s1.length()-1;i++){
                            if(s1.charAt(i)=='.'){
                                for(int j=i+1;j<s1.length();j++){
                                    if(s1.charAt(j)=='0'){
                                        cnt++;
                                    }
                                    else{
                                        cnt=0;
                                        break;
                                    }
                                }
                            }
                        }
                        if(cnt==0) ans=String.format("%.2f",result);
                        else ans=String.format("%.0f",result);
                        output.setText(ans);
                        break;

                    case "-":
                        result=num1-num2;
                        String s2=Double.toString(result);
                        for(int i=0;i<s2.length()-1;i++){
                            if(s2.charAt(i)=='.'){
                                for(int j=i+1;j<s2.length();j++){
                                    if(s2.charAt(j)=='0'){
                                        cnt++;
                                    }
                                    else{
                                        cnt=0;
                                        break;

                                    }
                                }
                            }
                        }
                        if(cnt==0)ans=String.format("%.2f",result);
                        else  ans=String.format("%.0f",result);
                        output.setText(ans);
                        break;
                    case "x":
                        result=num1*num2;
                        String s3=Double.toString(result);
                        for(int i=0;i<s3.length()-1;i++){
                            if(s3.charAt(i)=='.'){
                                for(int j=i+1;j<s3.length();j++){
                                    if(s3.charAt(j)=='0'){
                                        cnt++;
                                    }
                                    else{
                                        cnt=0;
                                        break;

                                    }
                                }
                            }
                        }
                        if(cnt==0)ans=String.format("%.2f",result);
                        else  ans=String.format("%.0f",result);
                        output.setText(ans);
                        break;
                    case "/":
                        result=num1/num2;
                        String s4=Double.toString(result);
                        for(int i=0;i<s4.length()-1;i++){
                            if(s4.charAt(i)=='.'){
                                for(int j=i+1;j<s4.length();j++){
                                    if(s4.charAt(j)=='0'){
                                        cnt++;
                                    }
                                    else{
                                        cnt=0;
                                        break;

                                    }
                                }
                            }
                        }
                        if(cnt==0)ans=String.format("%.2f",result);
                        else  ans=String.format("%.0f",result);
                        output.setText(ans);
                        break;



                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
