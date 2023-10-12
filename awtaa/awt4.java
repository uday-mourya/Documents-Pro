import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Test
{
   public static void main(String args[])
   {
      Frame f=new Frame("MyFrame");

      Button b=new Button("Click Here");

      b.setBounds(80,100,64,30);

      f.add(b);

      f.setSize(300,300);
      
      f.setLayout(null);
     
      f.setVisible(true);
      
      f.addWindowListener(new WindowAdapter()
      {   
          @Override
          public void windowClosing(WindowEvent e)
          {
              System.exit(0);
          }
      });

   }
}