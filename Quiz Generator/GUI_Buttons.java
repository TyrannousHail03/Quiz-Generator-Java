public class GUI_Buttons //Class for buttons
{
   public static void ExitButton()
   {
      //Kills the Program if pressed - should typically be called in case user wants to exit
      //Should have a warning after pressed to say:
      // "Exiting now will void all your work. Would you like to continue?"
      //And take appropiate action from there
      //If user kills program prematurely, file should be scrubbed. 
   }
   public static void NextButton()
   {
      //Same effect as enter - should make it so that it brings up the next window
      // Next or -->
   }
   public static void MultipleChoiceButton()
   {
      //When program gets to prompting user for mode - returns MultipleChoice to driver program
   }
   public static void SingleChoiceButton()
   {
      //When program gets to prompting user for mode - returns SingleChoice to driver program
   }
   public static void YesButton()
   {
      //For when program requires it - acts as confirmation
   }
   public static void NoButton()
   {
      //For when program requires it - returns no for program discretion
   }
   public static void HelpButton()
   {
      //Brings up documentation window 
      //Meant to help user learn how to use program if necessary
   }
}