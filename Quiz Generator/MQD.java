import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MQD
{
   public static void MQD(BaseFile input)
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("title");
      f.setSize(400, 75);
      f.setLocationRelativeTo(null);
      f.setContentPane(new MQP(input));
      f.setVisible(true);
   }
}