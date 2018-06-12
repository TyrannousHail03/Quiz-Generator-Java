import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/** Multiple Answer Question Generator Panel */
public class MAQQP extends JPanel
{
   private BaseFile intake;
   JTextField questionField = new JTextField(20);
   public MAQQP(BaseFile input)
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
   private class exitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   private class nextListener implements ActionListener
   {
      private BaseFile intake;
      public nextListener(BaseFile input)
      {
         intake = input;
      }
      public void actionPerformed(ActionEvent e)
      {
         String output = questionField.getText();
         try
         {
            intake.question(output);
         }
         catch(IOException ee)
         {
            ee.printStackTrace();
         }
         //Will go to answer GUI
         MAQD panel = new MAQD();
         panel.MAQD(intake);
      }
   }
}