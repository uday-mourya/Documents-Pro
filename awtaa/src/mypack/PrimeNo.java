
package mypack;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PrimeNo extends Frame implements WindowListener,ActionListener
{
    Label l1;
    TextField tf1;
    Button b1,b2;
    public PrimeNo()
    {
        this.setVisible(true);
        
        this.setTitle("Prime check");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.gray);
        this.setLayout(null);
        l1=new Label("Enter number :");
        l1.setBounds(100,50,150,40);
        this.add(l1);
        tf1 = new TextField();
        tf1.setBounds(300,60,70,30);
        this.add(tf1);
       
        b1 = new Button("press here");
        b1.setBounds(100,150,70,30);
        this.add(b1);
        
        b2 = new Button("clear");
        b2.setBounds(100,200,50,30);
        this.add(b2);
        
        b2.addActionListener(this);
        b1.addActionListener(this);
        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String first = tf1.getText();
        int a = Integer.parseInt(first);
        int count=0;
        if(e.getSource()==b1)
        {
            for(int i=1;i<=a;i++)
            {
              if(a%i==0){count++;}
            }
            if(count==2){
            tf1.setText("No is prime"); 
            }
            else{
            tf1.setText("Not Prime");
            }
            
            
        }
        else if(e.getSource()==b2){
            tf1.setText("");
        }
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}

