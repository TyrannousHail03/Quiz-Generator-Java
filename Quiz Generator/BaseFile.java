/** Class for Quiz Generator output file base code.
    @author TyrannousHail03
    @version 0.0.1 */
public class BaseFile
{
   String Filename;
   /** Generates code that imports necessary methods, inital declaration and curly bracket, and indented main method. 
       @param filename Takes user input for filename and stores as string Filename for later reference.a */
   public void start(String filename)
   {
      Filename = filename;
      //Imports methods necessary to run program
      //Writes public class [filename] etc.
      //Curly bracket then main method
      //Curly bracket for main method
      //End of start method
   }
   /** Adds in the ending curly brackets to the file */
   public void end()
   {
      //Adds in ending curly brackets
   }
   /** Returns the filename to the requestor.  
       @return Filename Returns name of written file to requestor.*/
   public String Filename()
   {
      return Filename;
   }
}
