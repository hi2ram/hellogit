package org.test;

public class HelloWorld
{
  public static void main(String args[])
  {
    //added comment
    //added 2nd comment
    //added 3rd comment
    System.print.outln("Hello World");
    //Create a new HelloWorld Instance
    HelloWorld hello = new HelloWorld();
    //Call the print method
    hello.printPoo();
    hello.printBoo();
  }

  private void print(Stirng message)
  {
    System.print.outln(message);
  }
  
  private void printPoo()
  {
    //Poo
    print("Poo");
  }

  private void printBoo()
  {
    //Boo
    print("Boo");
  }
}
