import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/** Single Question Panel */
public class SQP extends JPanel
{
   private BaseFile intake;
   JTextField questionField = new JTextField(20);
   public SQP(BaseFile input)
   {  
      intake = input;
      //Initial Text
      JLabel lb1 = new JLabel("What is your question?");
      add(lb1);
      setVisible(true);
      
      //Initiates Text Field for User Input
      add(questionField);
      
      //Confirm Button
      JButton next = new JButton("Next");
      next.addActionListener(new nextListener(input));
      add(next);
      
      //Initiates Single Answer Button
      JButton exit = new JButton("Exit Program");
      exit.addActionListener(new exitListener());
      add(exit);

   }
   /** Allows user to immediately kill program */
   private class exitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        System.exit(0);
      }
   }
   /** Allows user to move to next Panel */
   private class nextListener implements ActionListener
   {
      private BaseFile intake;
      public nextListener(BaseFile input)
      {
         intake = input;
      }
      public void actionPerformed(ActionEvent e)
      {
         String input = questionField.getText();
         try
         {
            intake.question(input);
         }
         catch(IOException ee)
         {
            ee.printStackTrace();
         }
         //Will go to answer GUI
         SAQD panel = new SAQD();
         panel.SAQD(intake);
      }
   }
}