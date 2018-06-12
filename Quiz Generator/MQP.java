import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/** More Questions Panel */
public class MQP extends JPanel
{
   JTextField answerField = new JTextField(20);
   public MQP(BaseFile input)
   {  
      //Initial Text
      JLabel lb1 = new JLabel("Would you like to add another question?");
      add(lb1);
      setVisible(true);
      
      //Confirm Button 
      JButton confirm = new JButton("Yes");
      confirm.addActionListener(new confirmListener(input));
      add(confirm);
      
      //Initiates Single Answer Button
      JButton exit = new JButton("No");
      exit.addActionListener(new noListener(input));
      add(exit);

   }
   private class noListener implements ActionListener
   {
      private BaseFile intake;
      public noListener(BaseFile input)
      {
         intake = input;
      }
      public void actionPerformed(ActionEvent e)
      {
        try{
            intake.end();
        }
        catch(IOException f)
        {
          f.printStackTrace();
        }
        System.exit(0);
      }
   }
   private class confirmListener implements ActionListener
   {
      private BaseFile intake;
      public confirmListener(BaseFile input)
      {
         intake = input;
      }  
      public void actionPerformed(ActionEvent e)
      {
         //Goes back to question type
         QG_Driver driver = new QG_Driver();
         driver.QG_Driver(intake);
      }
   }
}