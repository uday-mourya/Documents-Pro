
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

public class Circle extends Frame implements WindowListener,ActionListener
{
    Label l1,l3;
    TextField tf1;
    Button b1,b2,b3;
    public Circle()
    {
        this.setVisible(true);
        
        this.setTitle("Calculator");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.gray);
        this.setLayout(null);
        l1=new Label("Enter Your radius :");
        l1.setBounds(100,50,150,40);
        this.add(l1);
       
        l3 = new Label();
        l3.setBounds(150,230,70,30);
        this.add(l3);
        
        tf1 = new TextField();
        tf1.setBounds(300,60,70,30);
        this.add(tf1);
       
        
        b1 = new Button("Area");
        b1.setBounds(100,150,50,30);
        this.add(b1);
         b2 = new Button("Circum");
        b2.setBounds(180,150,60,30);
        this.add(b2);
         b3 = new Button("diameter");
        b3.setBounds(270,150,60,30);
        this.add(b3);
       
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
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
        int r = Integer.parseInt(first);
        double c=0;
        if(e.getSource()==b1)
        {
             c = 3.14*r*r;
        }
        else if(e.getSource()==b2)
        {
             c = 2*3.14*r;
        }
        else if(e.getSource()==b3)
        {
             c = 2*r;
        }
       
        
            String s = Double.toString(c);
            l3.setText("Result : "+s);
            tf1.setText("");
           
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}
