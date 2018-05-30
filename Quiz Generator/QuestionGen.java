/** Class for Quiz Generator generation of question code
    @author TyrannousHail03
    @version 0.0.0 */
public class QuestionGen
{
   /** Acts as a way to store how many answers a specific Multiple Choice Question has.*/
   int NUMITEMS = 0;
   /** Generates the code for prompting the user for a Single Answer Question.*/
   public void SingleAnswer()
   {
      //Generates the code for a Single Answer Question in a Quiz
   }
   /** Generates the code for prompting a user with a Multiple Choice Question. 
       @param x Defines NUMITEMS: How many answers a question has.*/
   public void MultiAnswer(int x)
   {
      //Generates the code for a Multiple Answer Question in a Quiz
      NUMITEMS = x; //Sets global NUMITEMS to that for MultiAnswerX()
   }
   /** Returns the number of answers the last written Multiple Choice Question has. 
       @return NUMITEMS */
   public int MultiAnswerX()
   {
      //Provides a method of finding what X is for the Multiple Answer Question in a program
      NUMITEMS = NUMITEMS;
      return NUMITEMS;
   }
}