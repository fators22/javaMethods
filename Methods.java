/**
 *  Do not use any of these methods to solve other methods.
 *  Do not create any other methods to solve these methods.
 *  Do not change the method headers (return type, name, parameters) of these methods.
 *  Do not delete the comments from the starter code
 *  Do not use if-statements or loops to solve these problems.
 *
 *  Remember: Comments describe the method that comes after them.
 */
public class Methods
{
  /** The starting point of this program.
   *
   *  Write code here to test the methods you write.
   *
   *  @param String[] args Commandline arguments.
   */
  public static void main(String[] args)
  {
    // You need to test your work! Follow this example of how to test a method:

    // This statement invokes the hello method and stores its response in the answer variable
    String answer = hello("World");

    // This statement outputs the value of the answer variable to the console
    System.out.println( answer );

    // When you run this code it will call the hello method and output the results.
    // Since the hello method is being passed the value "World" you should expect
    // the answer to be "Hello World" (see the comment of the hello method below)
    // When you run this program you should look at the output and verify that it is correct!
    // If it is not correct, then the method is not correct and you should keep working on it.

    // You should change this code, or add additional code to this method to test each
    // method as you write it. Follow this pattern:
    //  1. Call the method you want to test and store its return value in a variable
    //  2. Use System.out.println to output that variable

    // Note: Make sure you declare the variable correctly. Its type should match the return type of the method.

    // If you are getting compile errors for your test code in this method then check these things:
    //  - Did you write the method name correctly?
    //    Try copying and pasting the method name from the method header.
    //  - Are the arguments you are passing to the method correct?
    //    Look at how many parameters the method has and the types of those variables.
    //  - Is the type of your answer variable correct?
    //    Look at the return type of the method, this should match the type of your answer variable.
  }

  /**  Use the distance formula to calculate the distance between (x1, y1) and (x2, y2)
   *
   *  Use the distance formula: https://www.google.com/search?q=distance+formula
   *
   *   Example:
   *     x1      -> 1
   *     y1      -> 2
   *     x2      -> 3
   *     y2      -> 4
   *     return  -> 2.82842712475
   *
   *   @param int x1
   *   @param int y1
   *   @param int x2
   *   @param int y2
   *   @return double The distance between (x1, y1) and (x2, y2)
   */
  public static double calculateDistance(int x1, int y1, int x2, int y2)
  {
    return -1.0;
  }

  /**  Calculate the distance between 16 and x. This will always be a positive number.
   *
   *
   *   Example:
   *     x       -> 5
   *     return  -> 11
   *
   *     x       -> 16
   *     return  -> 0
   *
   *     x       -> 20
   *     return  -> 4
   *
   *   @param int x The value to use when calcualting the distance from 16
   *   @return int The distance between x and 16
   */
  public static int distanceFrom16(int x)
  {
    return -999;
  }

  /**  Say "Hello [name]"
   *
   *   Example:
   *     name    -> "Tacocat"
   *     return -> "Hello Tacocat"
   *
   *   @param String name The name to say hello to
   *   @return String "Hello [name]"
   */
  public static String hello(String name)
  {
    return null;
  }

  /**  Return a new string that repeats str 3 times
   *
   *   Example:
   *     str    -> "tacos"
   *     return -> "tacostacostacos"
   *
   *   @param String str The string to repeat 3 times
   *   @return String str repeated three times
   */
  public static String triple(String str)
  {
    return null;
  }

  /**  Find the index of needle in haystack or return -1 if needle is not in haystack
   *
   *   Example:
   *     needle     -> "aco"
   *     haystack   -> "tacos"
   *     return     -> 1
   *
   *   @param String needle The string to find in haystack
   *   @param String haystack The string to find where needle is located
   *   @return String The index of needle in haystack, or -1 if needle is not in haystack
   */
  public static int findNeedle(String needle, String haystack)
  {
    return -999;
  }

  /**  Return the single character that is located at the specified index
   *
   *   Example:
   *     str     -> "tacos"
   *     index   -> 2
   *     return  -> "c"
   *
   *   @param String str The string to isolate a character from
   *   @param int index The index of the character to isolate
   *   @return String The single character located at specific index
   *
   *   Precondition: index >= 0 and index <= str.length()
   */
  public static String isolateCharacterAtIndex(String str, int index)
  {
    return null;
  }

  /**  Remove the character at index from str
   *
   *   Example:
   *     needle    -> "tacos"
   *     index     -> 2
   *     return    -> "taos"
   *
   *   @param String str The string to remove a character from
   *   @param int index The index of the character to remove
   *   @return String str with the character at index removed
   *
   *   Precondition: index >= 0 and index <= str.length()
   */
  public static String removeCharacter(String str, int index)
  {
    return null;
  }

  /**  Insert needle into haystack at the specified index
   *
   *   Example:
   *     needle    -> "CHEESE"
   *     haystack  -> "tacos"
   *     index     -> 2
   *     return    -> "taCHEESEcos"
   *
   *   @param String needle The value to insert into haystack
   *   @param String haystack The string to insert needle into
   *   @param int index The index where needle should be inserted into haystack
   *   @return String The result of inserting needle into haystack
   *
   *   Precondition: index >= 0 and index <= haystack.length()
   */
  public static String insertNeedle(String needle, String haystack, int index)
  {
    return null;
  }

  /**  Return the index that comes after the end of needle in haystack
   *
   *   Example:
   *     needle     -> "aco"
   *     haystack   -> "tacos"
   *     return     -> 4
   *
   *   @param String needle The string to locate in haystack
   *   @param String haystack The string that contains needle
   *   @return int The index that comes after the needle
   *
   *   Precondition: needle is contained within haystack
   */
  public static int findEndOfNeedle(String needle, String haystack)
  {
    return -999;
  }

   /**  Remove the needle from the haystack
    *
    *   Example:
    *     needle    -> "co"
    *     haystack  -> "tacos"
    *     return    -> "tas"
    *
    *   @param String needle The value to remove from haystack
    *   @param String haystack The string to remove the needle from
    *   @return String The result of removing needle from haystack
    */
   public static String removeNeedle(String needle, String haystack)
   {
     return null;
   }

   /**  Given a string in the format "I like X", identify the value of X
    *
    *   Example:
    *     needle    -> "I like tacos"
    *     return    -> "tacos"
    *
    *     needle    -> "I like writing code"
    *     return    -> "writing code"
    *
    *   @param String str A string that says "I like X"
    *   @return String The value X from the string "I like X"
    *
    *   Precondition: str starts with "I like "
    */
   public static String whatILike(String str)
   {
     return null;
   }

   /**  Return the first N characters from str
    *
    *   Example:
    *     needle    -> "tacos"
    *     n         -> 2
    *     return    -> "ta"
    *
    *   @param String str The string to get the characters from
    *   @param int n The number of characters to return from str
    *   @return String The first N characters of str
    *
    *   Precondition: n >=0 and n <= str.length()
    */
   public static String getFirstNCharacters(String str, int n)
   {
     return null;
   }

   /**  Remove the first N characters from str
    *
    *   Example:
    *     needle    -> "tacos"
    *     n         -> 2
    *     return    -> "cos"
    *
    *   @param String str The string to remove characters from the beginning of
    *   @param int n The number of characters to remove from str
    *   @return String The string str with the first n characters removed
    *
    *   Precondition: n >=0 and n <= str.length()
    */
   public static String removeFirstNCharacters(String str, int n)
   {
     return null;
   }

   /**  Return the last N characters from str
    *
    *   Example:
    *     needle    -> "tacos"
    *     n         -> 2
    *     return    -> "os"
    *
    *   @param String str The string to get the characters from
    *   @param int n The number of characters to return from str
    *   @return String The last N characters of str
    *
    *   Precondition: n >=0 and n <= str.length()
    */
   public static String getLastNCharacters(String str, int n)
   {
     return null;
   }

   /**  Remove the last N characters from str
    *
    *   Example:
    *     needle    -> "tacos"
    *     n         -> 2
    *     return    -> "tac"
    *
    *   @param String str The string to remove characters from the end of
    *   @param int n The number of characters to remove from str
    *   @return String The string str with the last n characters removed
    *
    *   Precondition: n >=0 and n <= str.length()
    */
   public static String removeLastNCharacters(String str, int n)
   {
     return null;
   }

   /**  Swap the fisrt and last characters of a string
    *
    *   Example:
    *     str    -> "tacos"
    *     return -> "sacot"
    *
    *   @param String str The string to swap the first and last characters of
    *   @return String str with the first and last characters swapped
    */
   public static String reverse(String str)
   {
     return null;
   }
}
