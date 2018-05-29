public class QuestionGen
{
   int NUMITEMS = 0;
   public void SingleAnswer()
   {
      //Generates the code for a Single Answer Question in a Quiz
   }
   public void MultiAnswer(int x)
   {
      //Generates the code for a Multiple Answer Question in a Quiz
      NUMITEMS = x; //Sets global NUMITEMS to that for MultiAnswerX()
   }
   public int MultiAnswerX()
   {
      //Provides a method of finding what X is for the Multiple Answer Question in a program
      NUMITEMS = NUMITEMS;
      return NUMITEMS;
   }
}