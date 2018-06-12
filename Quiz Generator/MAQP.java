import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/** Multiple Answer Question Panel */
public class MAQP extends JPanel
{
   private BaseFile intake;
   JTextField answerField = new JTextField(20);
   JTextField answerField2 = new JTextField(20);
   JTextField answerField3 = new JTextField(20);
   JTextField answerField4 = new JTextField(20);
   String input1, input2, input3, input4;
   public MAQP(BaseFile input)
   {  
      intake = input;
      //Initial Text
      JLabel lb1 = new JLabel("What are the answers to your question?");
      add(lb1);
      
      //Textbox 1 Text
      JLabel lb2 = new JLabel("Answer 1:");
      add(lb2);
      
      //Initiates Text Field for User Input
      add(answerField);
      
      //Textbox 2 Text
      JLabel lb3 = new JLabel("Answer 2:");
      add(lb3);
      
      //Initiates Text Field for Second Question
      add(answerField2);
      
      //Textbox 3 Text
      JLabel lb4 = new JLabel("Answer 3:");
      add(lb4);
      
      //Initiates Text Field for Third Question
      add(answerField3);
      
      //Text 4 Text
      JLabel lb5 = new JLabel("Answer 4:");
      add(lb5);
      
      //Initiates Text Field for Third Question
      add(answerField4);
      
      //Confirm Button - Takes input in JTextField and runs it through code gen process, then calls the MAGP
      JButton next = new JButton("Next");
      next.addActionListener(new nextListener(input));
      add(next);
      
      //Initiates Single Answer Button
      JButton exit = new JButton("Exit Program");
      exit.addActionListener(new exitListener());
      add(exit);

   }
   /** Kills program when pressed. */
   private class exitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        System.exit(0);
      }
   }
   /** Processes entered data and moves on to next Panel */
   private class nextListener implements ActionListener
   {
      private BaseFile intake;
      public nextListener(BaseFile input)
      {
         intake = input;
      }
      public void actionPerformed(ActionEvent e)
      {
         input1 = answerField.getText();
         input2 = answerField2.getText();
         input3 = answerField3.getText();
         input4 = answerField4.getText();
         try
         {
            intake.MultipleAnswer(input1, input2, input3, input4);
         }
         catch(IOException event)
         {
            event.printStackTrace();
         }

         //Will go to add another question GUI
         MQD mqd = new MQD();
         mqd.MQD(intake);
      }
   }
}