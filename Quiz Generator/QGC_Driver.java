import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**Runs the Confirmation GUI Window */
public class QGC_Driver
{
   public static void QGC_Driver()
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("Confirm Exit");
      f.setSize(400, 100);
      f.setLocationRelativeTo(null);
      f.setContentPane(new QGC_Panel());
      f.setVisible(true);
   }
}