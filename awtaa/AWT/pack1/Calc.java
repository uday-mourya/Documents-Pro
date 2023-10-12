package pack1;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class Calc extends Frame implements WindowListener,ActionListener{
    Label lb1,lb2,lb3,lb4;
    TextField txf,txf2;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;
    public Calc(){
        this.setVisible(true);
        this.setBounds(100, 80, 590, 300);
        this.setTitle("Calculator");
        this.addWindowListener(this);
        this.setBackground(Color.black);
        Font myFont = new Font("Ink Free",Font.PLAIN,20);
        Font mFont1=new Font("Ink Free",Font.PLAIN,13);
        this.setLayout(null);

        lb1=new Label("Enter First Number : ");
        lb1.setBounds(40, 60, 144, 30);
        lb1.setFont(mFont1);
        lb1.setBackground(Color.white);
        this.add(lb1);

        lb2=new Label("Enter Second Number : ");
        lb2.setBounds(40, 120, 144, 30);
        lb2.setFont(mFont1);
        lb2.setBackground(Color.white);
        this.add(lb2);

        lb3=new Label("           Result");
        lb3.setBounds(40, 180, 144, 30);
        lb3.setFont(mFont1);
        lb3.setBackground(Color.white);
        this.add(lb3);

        txf=new TextField(20);
        txf.setBounds(220,60,140,30);
        txf.setBackground(Color.white);
        this.add(txf);
        txf.setFont(myFont);
        txf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        this.add(txf);

        txf2=new TextField(20);
        txf2.setBounds(220,120,140,30);
        txf2.setBackground(Color.white);
        this.add(txf2);
        txf2.setFont(myFont);
        txf2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });

        lb4=new Label();
        lb4.setBounds(220,180,140,30);
        lb4.setBackground(Color.white);
        lb4.setFont(myFont);
        this.add(lb4);

        this.add(txf2);
        bt1=new Button("ADD");
        bt1.setFont(myFont);
        bt1.setBounds(400,60,60,30);
        bt1.setBackground(Color.GRAY);
        this.add(bt1);
        bt1.addActionListener(this);

        
        bt2=new Button("Mul");
        bt2.setFont(myFont);
        bt2.setBounds(400,120,60,30);
        bt2.setBackground(Color.GRAY);
        this.add(bt2);
        bt2.addActionListener(this);

        bt3=new Button("Mod");
        bt3.setFont(myFont);
        bt3.setBounds(400,180,60,30);
        bt3.setBackground(Color.GRAY);
        this.add(bt3);
        bt3.addActionListener(this);

        
        bt5=new Button("Sub");
        bt5.setFont(myFont);
        bt5.setBounds(480,60,60,30);
        bt5.setBackground(Color.GRAY);
        this.add(bt5);
        bt5.addActionListener(this);

        bt4=new Button("Div");
        bt4.setFont(myFont);
        bt4.setBounds(480,120,60,30);
        bt4.setBackground(Color.GRAY);
        this.add(bt4);
        bt4.addActionListener(this);

        bt6=new Button("Clr");
        bt6.setFont(myFont);
        bt6.setBounds(480,180,60,30);
        bt6.setBackground(Color.GRAY);
        this.add(bt6);
        bt6.addActionListener(this);

    }

    
    @Override
    public void windowOpened(WindowEvent e) {
       // throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
       // throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
    }
    @Override
    public void windowClosed(WindowEvent e) {
       // throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
    }
    @Override
    public void windowIconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }
    @Override
    public void windowActivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double num1=0,num2=0;
        if(e.getSource()==bt1)
        {
            num1 = Double.parseDouble(txf.getText());
            num2 = Double.parseDouble(txf2.getText());
            lb4.setText(String.valueOf(num1+num2));
        }
        else if(e.getSource()==bt5)
        {
            num1 = Double.parseDouble(txf.getText());
            num2 = Double.parseDouble(txf2.getText());
            lb4.setText(String.valueOf(num1-num2));
        }
        else if(e.getSource()==bt2)
        {
            num1 = Double.parseDouble(txf.getText());
            num2 = Double.parseDouble(txf2.getText());
            lb4.setText(String.valueOf(num1*num2));
        }
        else if(e.getSource()==bt4)
        {
            num1 = Double.parseDouble(txf.getText());
            num2 = Double.parseDouble(txf2.getText());
            lb4.setText(String.valueOf(num1 / num2));
        }
        else if(e.getSource()==bt3)
        {
            num1 = Double.parseDouble(txf2.getText());
           num2 = Double.parseDouble(txf.getText());
           //float  num3 = Float.parseFloat(tf2.getText());
            lb4.setText(String.valueOf(num1 % num2));
        }
        else if(e.getSource()==bt6)
        {
            txf.setText("");
            txf2.setText("");
            lb4.setText("");
        }
    }
}


