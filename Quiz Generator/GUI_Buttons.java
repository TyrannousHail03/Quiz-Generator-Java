/** Class for Quiz Generator GUI buttons
    @author TyrannousHail03
    @version 0.0.1 */

public class GUI_Buttons {
   /** Confirms if the user wants to kill the program. If the user inputs "Yes", the program is killed.*/
   public static void ExitButton()
   {
      //Kills the Program if pressed - should typically be called in case user wants to exit
      //Should have a warning after pressed to say:
      // "Exiting now will void all your work. Would you like to continue?"
      //And take appropiate action from there
      //If user kills program prematurely, file should be scrubbed. 
   }
   /** Allows program to progress to next input window. */
   public static void NextButton()
   {
      //Same effect as enter - should make it so that it brings up the next window
      // Next or -->
   }
   /** Input button for the Multiple Choice Question mode. */
   public static void MultipleChoiceButton()
   {
      //When program gets to prompting user for mode - returns MultipleChoice to driver program
   }
   /** Input button for the Single Answer Question mode. */
   public static void SingleChoiceButton()
   {
      //When program gets to prompting user for mode - returns SingleChoice to driver program
   }
   /** Confirms that a user wants to do something. */
   public static void YesButton()
   {
      //For when program requires it - acts as confirmation
   }
   /** Confirms that a user does not want to do something.*/
   public static void NoButton()
   {
      //For when program requires it - returns no for program discretion
   }
   /** Brings up documentation window. */
   public static void HelpButton()
   {
      //Brings up documentation window 
      //Meant to help user learn how to use program if necessary
   }
}
