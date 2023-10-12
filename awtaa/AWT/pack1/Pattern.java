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

public class Pattern extends Frame implements WindowListener, ActionListener {
    Label lb1, lb2, lb3;
    TextField txf;
    Button bt1, bt2;

    public Pattern() {
        this.setVisible(true);
        this.setBounds(100, 80, 530, 350);
        this.setTitle("Pattern");
        this.addWindowListener(this);
        this.setBackground(Color.lightGray);

        this.setLayout(null);
        lb1 = new Label(" Enter Number : ");
        lb1.setBounds(70, 60, 110, 30);
        lb1.setBackground(Color.white);
        this.add(lb1);

        txf = new TextField(20);
        txf.setBounds(200, 60, 90, 30);
        txf.setBackground(Color.white);
        this.add(txf);
        txf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        bt1 = new Button("Submit");
        bt1.setBounds(70, 180, 90, 30);
        bt1.setBackground(Color.white);
        this.add(bt1);

        bt2 = new Button("Clear");
        bt2.setBounds(200, 180, 90, 30);
        bt2.setBackground(Color.white);
        this.add(bt2);

        lb2 = new Label();
        lb2.setBounds(300, 120, 150, 200);
        lb2.setBackground(Color.white);
        this.add(lb2);

        lb3 = new Label("Pattern Result:");
        lb3.setBackground(Color.white);
        lb3.setBounds(300, 60, 120, 30);
        this.add(lb3);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            int a = Integer.parseInt(txf.getText());
            String pattern = generatePattern(a);
            lb2.setText(pattern);
        } else if (e.getSource() == bt2) {
            txf.setText("");
            lb2.setText("");
        }
    }

    public String generatePattern(int n) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                pattern.append("*");
            }
            pattern.append("\n");
        }
        return pattern.toString();
    }

    
    
}
class Test{
    public static void main(String[] args) {
        Pattern patternFrame = new Pattern();
}
