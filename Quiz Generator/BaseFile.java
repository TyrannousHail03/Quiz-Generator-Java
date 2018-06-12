import java.io.*;
/** Class for Quiz Generator Output Methods*/
public class BaseFile
{
   private int count;
   public String filename;
   public String question1;
   /** Generates code that imports necessary methods, inital declaration and curly bracket, and indented main method. 
       @param name Takes user input for filename, stores it, and writes the code declaring the program.
       @throws IOException Failsafe method*/
   public void start(String name)throws IOException
   {
      //Generates File with user inputted filename
      filename = name + ".java";
      File file = new File("" + filename);
      FileOutputStream stream = new FileOutputStream(filename);
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));

      //Sets up basic code:
      writer.write("import java.util.*;");
      writer.newLine();
      writer.write("public class " + name + "{");
      writer.newLine();
      writer.write("public static void main(String[] args){");
      writer.newLine();
      writer.close();
   }
   /** Writes the code for a question for the quiz. 
       @param input User input for question
       @throws IOException Failsafe method*/
   public void question(String input)throws IOException
   {
      //Generates code for the program question based on input
      FileOutputStream stream1 = new FileOutputStream(filename, true);
      BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(stream1));
      question1 = "question" + count;
      writer1.write("String " + question1  + " = " + '"' + input + '"' + ";");
      writer1.newLine();
      writer1.write("System.out.println(" + '"' + input + '"' + ");");
      writer1.newLine();
      writer1.close();
      filename = filename;
   } 
   /** Adds in the ending curly brackets to the file
       @throws IOException Failsafe method */
   public void end() throws IOException
   {
      //Adds in ending curly brackets
      FileOutputStream stream2 = new FileOutputStream(filename, true);
      BufferedWriter writer2 = new BufferedWriter(new OutputStreamWriter(stream2));
      writer2.write("}");
      writer2.newLine();
      writer2.write("}");
      writer2.newLine();
      writer2.close();
      filename = filename;
   }
   /** Returns the filename to the requestor.  
       @return Filename Returns name of written file to requestor.*/
   public String Filename()
   {
      return filename;
   }
    /** Generates the code for a single answer for a single question answer.
        @param input User input to be processed by method   
        @throws IOException Failsafe method*/
   public void SingleAnswer(String input) throws IOException
   {
      FileOutputStream stream = new FileOutputStream(filename, true);
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));
      writer.write("String answer" + count + " = " + '"' + input + '"' + ";"); 
      writer.newLine();
      writer.write("Scanner scanner" + count + " = " + "new Scanner(System.in);");
      writer.newLine();
      writer.write("String input" + count + " = scanner" + count + ".nextLine();");
      writer.newLine();
      writer.write("if(answer" + count + ".equals(" + "input" + count + "))");
      writer.newLine();
      writer.write("System.out.println(" + '"' + "Correct" + '"' + ");");
      writer.newLine();
      writer.write("else");
      writer.newLine();
      writer.write("System.out.println(" + '"' + "Incorrect" + '"' + ");");
      writer.newLine();
      writer.close();
      count = count + 1;
   }
   /**Generates code for multiple answers (in an array) for a multiple answer question
      @param input1 First Answer
      @param input2 Second Answer
      @param input3 Third Answer
      @param input4 Fourth Answer 
      @throws IOException Failsafe method*/
   public void MultipleAnswer(String input1, String input2, String input3, String input4) throws IOException
   {
      FileOutputStream stream = new FileOutputStream(filename, true);
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));
      writer.write("String answer" + count + "[] " + "= new String[]{" + '"' + input1 + '"' + ", " + '"' + input2 + '"' + ", " + '"' + input3 + '"' + ", " + '"' + input4 + '"' + "};"); 
      writer.newLine();
      writer.write("Scanner scanner" + count + " = " + "new Scanner(System.in);");
      writer.newLine();
      writer.write("String input" + count + " = scanner" + count + ".nextLine();");
      writer.newLine();
      writer.write("if(" + "input" + count + ".equals(answer" + count + "[0]) || input" + count + ".equals(answer" + count + "[1]) || input" + count + ".equals(answer" + count + "[2]) || input" + count + ".equals(answer" + count + "[3]))");
      writer.newLine();
      writer.write("System.out.println("+ '"' + "Correct" + '"' + ");");
      writer.newLine();
      writer.write("else");
      writer.newLine();
      writer.write("System.out.println(" + '"' + "Incorrect" + '"' + ");");
      writer.newLine();
      writer.close();
      count = count + 1;
   }
}
