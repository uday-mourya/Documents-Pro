
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

public class calcu1 extends Frame implements WindowListener,ActionListener
{
    Label l1,l2,l3;
    TextField tf1,tf2;
    Button b1,b2,b3,b5,b6,b7;
    public calcu1()
    {
        this.setVisible(true);
        
        this.setTitle("Calculator");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.CYAN);
        this.setLayout(null);
        l1=new Label("Enter Your First number :");
        l1.setBounds(100,50,150,40);
        this.add(l1);
        l2 = new Label("Enter Your Second number :");
        l2.setBounds(100, 90,150, 40);
        this.add(l2);
        l3 = new Label();
        l3.setBounds(100,230,150,30);
        l3.setBackground(Color.MAGENTA);
        l3.setForeground(Color.WHITE);
        this.add(l3);
        
        tf1 = new TextField();
        tf1.setBounds(300,60,70,20);
        this.add(tf1);
        tf2 = new TextField();
        tf2.setBounds(300,100,70,20);
        this.add(tf2);
        
        b1 = new Button("Add");
        b1.setBounds(100,150,50,30);
        this.add(b1);
         b2 = new Button("Subtract");
        b2.setBounds(180,150,60,30);
        this.add(b2);
         b3 = new Button("Multiply");
        b3.setBounds(270,150,60,30);
        this.add(b3);
       
         b5 = new Button("Modulus");
        b5.setBounds(100,190,60,30);
        this.add(b5);
         b6 = new Button("Division");
        b6.setBounds(180,190,60,30);
        this.add(b6);
        
         b7 =new Button("Clear");
         b7.setBounds(270,190,60,30);
         this.add(b7);      
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
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
        String x = tf1.getText();
        String y = tf2.getText();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c=0;
        if(e.getSource()==b1)
        {
             c = a+b;
        }
        else if(e.getSource()==b2)
        {
             c = a-b;
        }
        else if(e.getSource()==b3)
        {
             c = a*b;
        }
        else if(e.getSource()==b5)
        {
             c = a%b;
        }
        else if(e.getSource()==b6)
        {
             c = a/b;
        }
        else if(e.getSource()==b7)
        {
            tf1.setText("");
            tf2.setText("");
            l3.setText("");
        }
            String r = Double.toString(c);
            l3.setText("Answer : "+r);

            
        
       
    }
            
}
