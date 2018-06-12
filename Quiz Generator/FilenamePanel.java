import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/** Filename Panel - Initial GUI Panel */
public class FilenamePanel extends JPanel
{
   BaseFile quiz = new BaseFile();
   JTextField answerField = new JTextField(20);
   /** Serves as the panel where the user names their quiz file. */
   public FilenamePanel()
   {  
      //Initial Text
      JLabel lb1 = new JLabel("What would you like to name the Quiz File");
      add(lb1);
      setVisible(true);
      
      //Initiates Text Field for User Input
      add(answerField);
      
      //Confirm Button - Takes input in JTextField and runs it through code gen process, then calls the MAGP
      JButton next = new JButton("Next");
      next.addActionListener(new nextListener());
      add(next);
      
      //Initiates Single Answer Button
      JButton exit = new JButton("Exit Program");
      exit.addActionListener(new exitListener());
      add(exit);
   
   }
   /** Kills program when clicked. */
   private class exitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   /** Takes user input, processes it, and moves on to the next panel. */
   private class nextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input = answerField.getText();
         try
         {
            quiz.start(input);
         }
         catch(IOException event)
         {
            event.printStackTrace();
         }
         //Will go to Question GUI
         QG_Driver driver = new QG_Driver();
         driver.QG_Driver(quiz);
      }
   }
}