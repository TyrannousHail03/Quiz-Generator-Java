import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**Runs the Confirmation GUI Window */
public class QG_Driver
{
   public static void QG_Driver(BaseFile input)
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("Select a Question Type");
      f.setSize(400, 100);
      f.setLocationRelativeTo(null);
      f.setContentPane(new QG_Panel(input));
      f.setVisible(true);
   }
}