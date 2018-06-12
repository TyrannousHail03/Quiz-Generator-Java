import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MAQQD
{
   public static void MAQQD(BaseFile input)
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("Multiple Question Input");
      f.setSize(250, 125);
      f.setLocationRelativeTo(null);
      f.setContentPane(new MAQQP(input));
      f.setVisible(true);
   }
}