import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/** Single Answer Question Panel */
public class SAQP extends JPanel
{
   JTextField answerField = new JTextField(20);
   public SAQP(BaseFile input)
   {  
      
      //Initial Text
      JLabel lb1 = new JLabel("What is the answer to your question?");
      add(lb1);
      setVisible(true);
      
      //Initiates Text Field for User Input
      add(answerField);
      
      //Confirm Button - Takes input in JTextField and runs it through code gen process, then calls the MAGP
      JButton next = new JButton("Next");
      next.addActionListener(new nextListener(input));
      add(next);
      
      //Initiates Single Answer Button
      JButton exit = new JButton("Exit Program");
      exit.addActionListener(new exitListener());
      add(exit);

   }
   /** Allows user to quit program immediately */
   private class exitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        System.exit(0);
      }
   }
   /** Moves onto next panel */
   private class nextListener implements ActionListener
   {
      private BaseFile intake;
      public nextListener(BaseFile input)
      {
         intake = input;
      }
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            String txtInput = answerField.getText();
            intake.SingleAnswer(txtInput);
         }
         catch(IOException ee)
         {
            ee.printStackTrace();
         }
         //Will go to add another question GUI
         MQD mqd = new MQD();
         mqd.MQD(intake);
      }
   }
}