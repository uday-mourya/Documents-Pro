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

public class AreaTrapezium extends Frame implements WindowListener,ActionListener
{
    Label l1,l2,l3,l4;
    TextField tf1,tf2,tf3;
    Button b1,b2,b3;
    public AreaTrapezium()
    {
        this.setVisible(true);
        
        this.setTitle("Area Trapezium");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.green);
        this.setLayout(null);
        l1=new Label("Enter length :");
        l1.setBounds(100,50,150,40);
        this.add(l1);
        
        l2=new Label("Enter height :");
        l2.setBounds(100,100,150,40);
        this.add(l2);
        
        l4=new Label("Enter Breadth :");
        l4.setBounds(100,150,150,40);
        this.add(l4);
        
        l3 = new Label();
        l3.setBounds(150,230,70,30);
        this.add(l3);
        
        tf1 = new TextField();
        tf1.setBounds(300,60,70,30);
        this.add(tf1);
        
        tf2 = new TextField();
        tf2.setBounds(300,110,70,30);
        this.add(tf2);
        
        tf3 = new TextField();
        tf3.setBounds(300,160,70,30);
        this.add(tf3);
                
        b1 = new Button("CSA");
        b1.setBounds(100,210,50,30);
        this.add(b1);

        
        b3=new Button("Clear");
        b3.setBounds(300,210,70,30);
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
        String y = tf2.getText();
        String z=  tf3.getText();
        int l = Integer.parseInt(x);
        int h = Integer.parseInt(y);
        int b=  Integer.parseInt(z);

        double c = 0;
        if(e.getSource()==b1)
        {
             c =2*h*(l+b);
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
