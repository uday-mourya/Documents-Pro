import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements KeyListener,WindowListener,ActionListener,ItemListener
{
       Label l;
       
       Button b;
       
       TextArea area;
       
       Checkbox chkA;
           
       public MyFrame2()
       {
         
          setBackground(Color.GRAY); 
            
          addWindowListener(this);
          
          setTitle("MyFrame");
          
          l=new Label();
          
          area=new TextArea();  
          
          b=new Button("click here");
            
          chkA=new Checkbox("Apple");
          
          b.addKeyListener(this);
          
          b.addActionListener(this);
          
          chkA.setBounds(300, 400,200,40);        
           
          b.setBounds(200,300,150,20);
               
          l.setBounds(20,50,100,20);
          
          area.setBounds(100,200,300,300);       
          
          add(l);
          
          add(b);
          
          add(area);
          
          add(chkA);
          
          setSize(400,400);
          
          setLayout(null);
          
          setVisible(true);
          
       }
       @Override
       public void keyPressed(KeyEvent e)
       {
           l.setText("Key Pressed");
       }
       @Override
       public void keyReleased(KeyEvent e)
       {
           l.setText("Key Relaeased");
       }
       @Override 
       public void keyTyped(KeyEvent e)
       {
          l.setText("Key Typed");
       }
       
    @Override
    public void windowActivated (WindowEvent arg0) {    
    System.out.println("activated");    
    }    
  
 
    public void windowClosed (WindowEvent arg0) {    
    System.out.println("closed");    
    }    
    @Override
    public void windowClosing (WindowEvent arg0) {    
    System.out.println("closing");    
       dispose();    
    }    
  
    @Override
    public void windowDeactivated (WindowEvent arg0) {    
    System.out.println("deactivated");    
    }    
    @Override  
    public void windowDeiconified (WindowEvent arg0) {    
    System.out.println("deiconified");    
    }    
    @Override 
    public void windowIconified(WindowEvent arg0) {    
    System.out.println("iconified");    
    }    
  
    @Override
    public void windowOpened(WindowEvent arg0) {    
    System.out.println("opened");    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    l.setText("Ok Button Clicked.");
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
         area.setText(e.getItem()+" Checkbox: "+ (e.getStateChange()==1?"checked":"unchecked"));         
      }        
}
class Test
{
  public static void main(String args[]) 
  {
          new MyFrame2();       
  }
}
