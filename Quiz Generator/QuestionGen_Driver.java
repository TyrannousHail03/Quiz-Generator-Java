import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Driver for the whole program */
public class QuestionGen_Driver
{
   /** Start method */
   public static void QuestionGen_Driver()
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("Filename");
      f.setSize(275, 125);
      f.setLocationRelativeTo(null);
      f.setContentPane(new FilenamePanel());
      f.setVisible(true);
   }
   /** Starts whole program 
       @param args Part of main method*/
   public static void main(String[] args)
   {
      QuestionGen_Driver();
   }
}