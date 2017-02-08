package exception_test.java;

public class Demo_Throws
{
 static void check() throws ArithmeticException
 {
  System.out.println("Inside check function");
  throw new ArithmeticException("Demo");
 }

 public static void main(String args[])
 {
  try
  {
   check();
  }
  catch(ArithmeticException e)
  {
   System.out.println("caught" + e);
  }
 }
}