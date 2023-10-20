package package50;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Calc extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, lb3;
    TextField tf1, tf2,tf3;
    Button btn1,btn2,btn3,btn4,btn5;

    public Calc() {
        this.setVisible(true);
        //this.setSize(600, 400);
        //this.setLocation(100, 50);
        this.setTitle("Myframe");
        this.setBackground(Color.gray);
        this.setBounds(100, 50, 400, 350);
        this.setLayout(null);

        lb1 = new Label("Enter First Number ");
        lb1.setBounds(50, 100, 110, 20);
        this.add(lb1);

        lb2 = new Label("Enter Second Number");
        lb2.setBounds(50, 140, 120, 20);
        this.add(lb2);

        tf1 = new TextField();
        tf1.setBounds(200, 100, 100, 20);
        this.add(tf1);

        tf2 = new TextField();
        tf2.setBounds(200, 140, 100, 20);
        this.add(tf2);

        btn1 = new Button("+");
        btn1.setBounds(50, 180, 50, 20);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        
        btn2 = new Button("-");
        btn2.setBounds(110, 180, 50, 20);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        
        btn3 = new Button("*");
        btn3.setBounds(170, 180, 50, 20);
        btn3.setBackground(Color.black);
        btn3.setForeground(Color.white);
        
        btn4 = new Button("/");
        btn4.setBounds(230, 180, 50, 20);
        btn4.setBackground(Color.black);
        btn4.setForeground(Color.white);
        
        btn5 = new Button("cancel");
        btn5.setBounds(290, 180, 50, 20);
        btn5.setBackground(Color.black);
        btn5.setForeground(Color.white);
        
        lb3 = new Label("OUTPUT");
        lb3.setBounds(50, 250, 150, 30);
        tf3 = new TextField();
        tf3.setBounds(200, 250, 100, 20);
        this.add(tf3);
        
        
        this.add(lb3);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
                   
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        this.addWindowListener(this);

    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf1.setText("");
        tf2.setText("");
        
    }
}

public class Calculator {

    public static void main(String[] args) {
        // new Frame();
        new Calc();

    }
}
