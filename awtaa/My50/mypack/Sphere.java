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

public class Sphere extends Frame implements WindowListener,ActionListener
{
    Label l1,l2,l3;
    TextField tf1,tf2;
    Button b1,b2,b3;
    public Sphere()
    {
        this.setVisible(true);
        
        this.setTitle("Sphere");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.gray);
        this.setLayout(null);
        l1=new Label("Enter Radius :");
        l1.setBounds(100,50,150,40);
        this.add(l1);

        l3 = new Label();
        l3.setBounds(150,230,70,30);
        this.add(l3);
        
        tf1 = new TextField();
        tf1.setBounds(300,60,70,30);
        this.add(tf1);
        
        b1 = new Button("Volume");
        b1.setBounds(100,150,50,30);
        this.add(b1);

        
        b3=new Button("Clear");
        b3.setBounds(360,150,70,30);
        this.add(b3);
      
        
        b1.addActionListener(this);
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
        String x = tf1.getText();
        int l = Integer.parseInt(x);
        double c = 0;
        if(e.getSource()==b1)
        {
             c =1.33*3.14*l*l*l;
            String s = Double.toString(c);
            l3.setText(s);
        }
        else if(e.getSource()==b3)
        {
           tf1.setText("");
        }
          
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}
