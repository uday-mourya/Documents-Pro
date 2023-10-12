package pack1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ArmStrome extends Frame implements WindowListener,ActionListener{
    Label lb1,lb2,lb3;
    TextField txf;
    Button bt1,bt2;
    public ArmStrome(){
        this.setVisible(true);
        this.setBounds(100, 80, 400, 280);
        this.setTitle("ArmStrome");
        this.addWindowListener(this);
        this.setBackground(Color.lightGray);

        this.setLayout(null);

        lb1=new Label(" Enter Number : ");
        lb1.setBounds(70, 60, 90, 30);
        lb1.setBackground(Color.white);
        this.add(lb1);

        txf=new TextField(20);
        txf.setBounds(200,60,124,30);
        txf.setBackground(Color.white);
        this.add(txf);
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

        lb3=new Label(" Result");
        lb3.setBackground(Color.white);
        lb3.setBounds(70,120,90,30);
        this.add(lb3);

        bt1=new Button("Sumbit");
        bt1.setBounds(70,180,90,30);
        bt1.setBackground(Color.white);
        this.add(bt1);

        bt2=new Button("Clear");
        bt2.setBounds(200,180,124,30);
        bt2.setBackground(Color.white);
        this.add(bt2);

        lb2=new Label();
        lb2.setBounds(200, 120, 124, 30);
        lb2.setBackground(Color.white);
        this.add(lb2);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
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
        int a,rev=0;

        if(e.getSource()==bt1){
            a = Integer.parseInt(txf.getText());
            int count=0,m=a,sum=0;
    
            while(m>0)
            {
              m=m/10;
              count++;
            }
            m=a;
            while(m>0)
            {
              int r=m%10;
              int pow=1;
                for(int i=1;i<=count;i++)
                {
                  pow=pow*r;
                }
              sum=sum+pow;
              m=m/10;
              
            }
            if(sum==a)
            {
              lb2.setText("Armstrome number");
            }
            else
            {
              lb2.setText("Not Armstrome number");
            }
        }
        else if(e.getSource()==bt2){
            txf.setText("");
            lb2.setText("");
        }

    }
}

