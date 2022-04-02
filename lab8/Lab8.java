import java.util.Scanner;

public class Lab8 {
   
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      getString(keyboard, "Please give me the name of any item");
      getString(keyboard, "Enter a color name");
      getString(keyboard, "Please enter the name of a different color");
      getInt(keyboard, "What is the maximum number of rare giant toenail's can someone have");
      getInt(keyboard, "What is the minimum number of rare giant toenail's can someone have");
      getDouble(keyboard, "What is the maximum price someone might pay for a giant toenail");

      keyboard.close();
   }

   /** Method 1 
     * Gets a String from the keyboard. 
     * @param msg is the text that will be displayed the user to ask them to enter a value.
     * @return Returns a String from the keyboard. 
     */ 
   public static String getString(Scanner keyboard, String msg) {
      String answer = "";
      System.out.println(msg);
      try {
         answer = keyboard.nextLine(); 
      }
      catch (Exception e) {
         System.err.println("Error reading input from user. Ending program.");
         System.exit(-1);
      } 
      
      while (answer.replace(" ", "").equals("")) {
         System.err.println("Error: Missing input.");
         try {
            System.out.println(msg);
            answer = keyboard.nextLine(); 
         }
         catch (Exception e) {
            System.err.println("Error reading input from user. Ending program.");
            System.exit(-1);
         } 
      }
      return answer;            
   }

   /** Method 2
     * Gets an Int from the keyboard. 
     * @param msg is the text that will be displayed the user to ask them to enter a number.
     * @return Returns an int from the keyboard. 
     */  
   public static int getInt(Scanner keyboard, String msg) {
      System.out.println(msg);

      while (!keyboard.hasNextInt()) {
         keyboard.nextLine();
         System.err.println("Invalid integer. Try again.");
      }

      int number = keyboard.nextInt();
      keyboard.nextLine();
      return number;
   }

   /** Method 3 
     * Gets an integer greater than and less than the supplied parameters. 
     * @param msg is the text that will be displayed the user to ask them to enter a value.
     * @param low is the lowest acceptable input value.
     * @param high is the highest acceptable input value.
     * @return Returns an int from the keyboard. 
     */
   public static int getIntBetweenLowAndHigh (
      Scanner keyboard, 
      String msg, 
      String errorMsg, 
      int low, int high) {
         int number = getInt(keyboard, msg);
         while (number < low || number > high) {
            System.err.println(errorMsg);
            number = getInt(keyboard, msg);
      }
         return number;
   }

   /** Method 4
     * Gets a Double from the keyboard. 
     * @param msg is the text that will be displayed the user to ask them to enter a number.
     * @return Returns a double from the keyboard. 
     */ 
   public static double getDouble(Scanner keyboard, String msg) {
      System.out.println(msg);
      while (!keyboard.hasNextDouble()) {
         keyboard.nextLine();
         System.err.println("Invalid number. Try again.");
      }
      double number = keyboard.nextDouble();
      keyboard.nextLine();
      return number;
   }

   /** Method 5 
     * Gets a double greater than and less than the supplied parameters. 
     * @param msg is the text that will be displayed the user to ask them to enter a value.
     * @param low is the lowest acceptable input value.
     * @param high is the highest acceptable input value.
     * @return Returns an int from the keyboard. 
     */
   public static double getDoubleBetweenLowAndHigh (
      Scanner keyboard, 
      String msg, 
      String errorMsg, 
      double low, double high) {
         double number = getDouble(keyboard, msg);
         while (number < low || number > high) {
            System.err.println(errorMsg);
            number = getDouble(keyboard, msg);
      }
         return number;
   }
   
}