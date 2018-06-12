import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Confirmation Panel base codee */
public class QGC_Panel extends JPanel
{
   private QuestionGen_Driver start;
   public QGC_Panel()
   {
      //Initial Text
      JLabel lb1 = new JLabel("Are you sure you want to exit?");
      add(lb1);
      setVisible(true);
      
      //Initiates Yes Button
      JButton yes = new JButton("Yes");
      yes.addActionListener(new yesListener());
      add(yes);
      
      //Initiates Multiple Answer Button
      JButton no = new JButton("No");
      no.addActionListener(new noListener());
      add(no);
   }
   /** User confirms they want to quit, program quits. */
   private class yesListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   /** User does not want to quit, program goes back to main menu */
   private class noListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         start.QuestionGen_Driver();
      }
   }
}