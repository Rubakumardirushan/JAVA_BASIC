import java.util.Scanner;

public class user{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
  System.out.println("Enter your name");
 String name= input.NextLine();
  System.out.println("Enter your age");
  int age=input.NextInt();// after intger input you get string or char value put dammy NextLine();
  input.NextLine();
  System.out.println("Enter youe E-Mail ");
 String email= input.NextLine();


  System.out.println("your name is"+name);
  System.out.println("your age is"+age);
  System.out.println("your E-Mail is"+email);
  





}







}
