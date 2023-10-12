import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Button;
import java.awt.Color;
class MyFrame extends Frame implements WindowListener
{
    public MyFrame()
    {
       addWindowListener(this);  
       this.setVisible(true);
       this.setTitle("MyFrame");
       this.setBackground(Color.GRAY);
       this.setBounds(100,50,700,400);
        
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
    

}
class Test
{
    public static void main(String args[])
    {
        new MyFrame();        
    }
}
