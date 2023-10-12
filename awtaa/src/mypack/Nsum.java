
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

public class Nsum extends Frame implements WindowListener,ActionListener
{
    Label l1,l2;
    TextField tf1;
    Button b1;
    public Nsum()
    {
        this.setVisible(true);
        this.setTitle("N number sum");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        l1=new Label("Enter Any Number:");
        l1.setBounds(20,50,150,40);
        this.add(l1);
        
        l2 = new Label();
        l2.setBounds(110,200,50,30);
        this.add(l2);
        
        tf1 = new TextField();
        tf1.setBounds(170,60,70,30);
        this.add(tf1);
        
        b1 = new Button("Submit");
        b1.setBounds(110,150,70,30);
        this.add(b1);
        this.addWindowListener(this);
        b1.addActionListener(this);
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String p = tf1.getText();
        int n=Integer.parseInt(p);
        int sum=0;
        for(int i=1;i<=n;sum=sum+i,i++);
        String s = Integer.toString(sum);
        l2.setText(s);
        tf1.setText("");
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
