import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Single Answer Question Driver */
public class SAQD
{
   public static void SAQD(BaseFile input)
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("Single Question Input");
      f.setSize(300, 150);
      f.setLocationRelativeTo(null);
      f.setContentPane(new SAQP(input));
      f.setVisible(true);
   }
}