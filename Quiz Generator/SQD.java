import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SQD
{
   public static void SQD(BaseFile input)
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("Single Answer Question");
      f.setSize(400, 100);
      f.setLocationRelativeTo(null);
      f.setContentPane(new SQP(input));
      f.setVisible(true);
   }
}