import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QG_Panel extends JPanel
{
   private QGC_Driver confirm;
   private SQD question;
   private MAQQD multi;
   public QG_Panel(BaseFile input)
   {  
      //Initial Text
      JLabel lb1 = new JLabel("What kind of question would you like to create?");
      add(lb1);
      setVisible(true);
      
      //Initiates the Gridlayout for the following Buttons
      
      //Initiates Single Answer Button
      JButton SA = new JButton("Single Answer");
      SA.addActionListener(new SA_Listener(input));
      add(SA);
      
      //Initiates Multiple Answer Button
      JButton MA = new JButton("Multiple Answers");
      MA.addActionListener(new MA_Listener(input));
      add(MA);
      
      //Initiates Exit Button
      JButton Ex = new JButton("Exit");
      Ex.addActionListener(new Ex_Listener());
      add(Ex);
   }
   /** Method for single answer question generation */
   private class SA_Listener implements ActionListener
   {
      private BaseFile intake;
      public SA_Listener(BaseFile input)
      {
         intake = input;
      }
      public void actionPerformed(ActionEvent e)
      {
         question.SQD(intake);
      }
   }
   /** Method for multiple answer question generation */
   private class MA_Listener implements ActionListener
   {
      private BaseFile intake;
      public MA_Listener(BaseFile input)
      {
         intake = input;
      }
      public void actionPerformed(ActionEvent e)
      {
         multi.MAQQD(intake);
      }  
   }
   /** Method for killing program immediately */
   private class Ex_Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         confirm.QGC_Driver();
      }
   }
}