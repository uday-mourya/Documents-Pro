
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

public class Form extends Frame implements WindowListener,ActionListener{
    
     Label lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
     TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
     Button btn1;
    
    public Form(){

    this.setVisible(true);
    this.setTitle("My Frame");
    this.setBackground(Color.GREEN);
    this.setBounds(100,50,800,600);
    this.setLayout(null);
    lb1=new Label(" Enter Roll no ");
    lb1.setBounds(10, 50,150,30);
    this.add(lb1);
    tf1=new TextField();
    tf1.setBounds(150, 50,150, 30);
    this.add(tf1);
   
    lb2=new Label(" Name ");
    lb2.setBounds(10, 100, 150, 30);
    this.add(lb2);
    
    tf2=new TextField();
    tf2.setBounds(150, 100,150, 30);
    this.add(tf2);
    
    lb3=new Label(" Farher Name ");
    lb3.setBounds(10, 150, 150, 30);
    this.add(lb3);
    
    tf3=new TextField();
    tf3.setBounds(150, 150,150, 30);
    this.add(tf3);
    
    lb4=new Label(" Mother Name ");
    lb4.setBounds(10, 200, 150, 30);
    this.add(lb4);
    
    tf4=new TextField();
    tf4.setBounds(150, 200,150, 30);
    this.add(tf4);
    
    lb5=new Label("Course");
    lb5.setBounds(450,50 , 150,30);
    this.add(lb5);
    
    tf5=new TextField();
    tf5.setBounds(590, 50,150, 30);
    this.add(tf5);
    
    lb6=new Label("Branch");
    lb6.setBounds(450,100 , 150,30);
    this.add(lb6);
    
    tf6=new TextField();
    tf6.setBounds(590, 100,150, 30);
    this.add(tf6);
    
    lb7=new Label("Semester");
    lb7.setBounds(450,150 , 150,30);
    this.add(lb7);
    
    tf7=new TextField();
    tf7.setBounds(590, 150,150, 30);
    this.add(tf7);
    
    lb8=new Label("Year");
    lb8.setBounds(450,200 , 150,30);
    this.add(lb8);
    
    tf8=new TextField();
    tf8.setBounds(590, 200,150, 30);
    this.add(tf8);
 
    btn1=new Button("submit");
    btn1.setBounds(160,350,80,40);
    btn1.setBackground(Color.red);
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
      System.exit(0);
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
