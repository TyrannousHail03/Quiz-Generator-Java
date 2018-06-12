import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Multiple Answer Question Driver */
public class MAQD
{
   public static void MAQD(BaseFile input)
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("Enter Answers Here");
      f.setSize(250, 300);
      f.setLocationRelativeTo(null);
      f.setContentPane(new MAQP(input));
      f.setVisible(true);
   }
}