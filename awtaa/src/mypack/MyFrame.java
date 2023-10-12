
package mypack;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements WindowListener,ActionListener{
    
     Label lb1,lb2;
     TextField tf1;
     Button btn1;
    
    public MyFrame(){

    this.setVisible(true);
    this.setTitle("My Frame");
    this.setBackground(Color.GREEN);
    this.setBounds(100,50,700,400);
    this.setLayout(null);
    lb1=new Label("Enter your name ");
    lb1.setBounds(10, 50,150,30);
    this.add(lb1);
    tf1=new TextField();
    tf1.setBounds(170, 50,150, 30);
    this.add(tf1);
    btn1=new Button("submit");
    btn1.setBounds(40,100,80,40);
    btn1.setBackground(Color.red);
    lb2=new Label();
    lb2.setBounds(150,130,150,30);
    this.add(lb2);
    this.add(btn1);
    btn1.addActionListener(this);
    this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
       dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowIconified(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowActivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // 
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); 
    String s=tf1.getText();
    lb2.setText("your Name : "+s);
    tf1.setText("");
    }
    
}
