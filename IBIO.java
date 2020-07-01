/* A set of input-output helper functions created by IBO. Here they
   are packaged into a class for convenient use. In IB exams, these
   functions are assumed to be callable without a classname. To
   achieve this, add this file into your project, and add the line

   import static IBIO;

   into your program files which use these functions */

class IBIO
{
  static void output (String info) { System.out.println (info); }
  static void output (char info) { System.out.println (info); }
  static void output (byte info) { System.out.println (info); }
  static void output (int info) { System.out.println (info); }
  static void output (long info) { System.out.println (info); }
  static void output (double info) { System.out.println (info); }
  static void output (boolean info) { System.out.println (info); }

  static String input (String prompt)
  {
    String inputLine = "";
    System.out.print(prompt);
    try
    {
      inputLine = (new java.io.BufferedReader (
                     new java.io.InputStreamReader (System.in))).readLine ();
    }
    catch (Exception e)
    {
      String err = e.toString ();
      System.out.println (err);
      inputLine = "";
    }
    return inputLine;
  }
  
  static char inputChar (String prompt)
  {
    char result = (char) 0;
    try
    {
      result = input (prompt).charAt (0);
    }
    catch (Exception e) { result = (char) 0; }
    return result;
  }
  
  static byte inputByte (String prompt)
  {
    byte result=0;
    try
    {
      result = Byte.valueOf (input (prompt).trim ()).byteValue ();
    }
    catch (Exception e) { result = 0; }
    return result;
  }
  
  static int inputInt (String prompt)
  {
    int result=0;
    try
    {
      result = Integer.valueOf (input (prompt).trim ()).intValue ();
    }
    catch (Exception e) { result = 0; }
    return result;
  }
  
  static long inputLong (String prompt)
  {
    long result=0;
    try
    {
      result = Long.valueOf (input(prompt).trim()).longValue ();
    }
    catch (Exception e) { result = 0; }
    return result;
  }
  
  static double inputDouble (String prompt)
  {
    double result=0;
    try
    {
      result = Double.valueOf (input (prompt).trim ()).doubleValue ();
    }
    catch (Exception e){ result = 0; }
    return result;
  }
  
  static boolean inputBoolean (String prompt)
  {
    boolean result=false;
    try
    {
      result=Boolean.valueOf (input (prompt).trim ()).booleanValue ();
    }
    catch (Exception e) { result = false; }
    return result;
  }

  static String inputString (String prompt) { return input (prompt); }
  static String input () { return input (""); }
  static int inputInt () { return inputInt (""); }
  static double inputDouble () { return inputDouble (""); }
}
