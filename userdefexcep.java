package lab9;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author padma
 */
public class userdefexcep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name:");
        String s=obj.next();
        System.out.println("*******************************************************");
        System.out.println("Enter the age:");
        int age=obj.nextInt();
        System.out.println("*******************************************************");
        System.out.println("Enter the email:");
        String email=obj.next();
        
        
        try
        {
            person info=new person(s);
            info.verify();
            
        }
        catch(Exception n)
        {
            
            System.out.println(n.getMessage());
        }
        // TODO code application logic here
    }
    
}
class person
{
  String name;
  int age;
  String email;
  person(String n)
  {
      name=n;
  }
  void verify() throws Exception
  {
      for(int i=0;i<name.length();i++)
      {
          if(((name.charAt(i)>=97)&&(name.charAt(i)<=122))||((name.charAt(i)<=90)&&(name.charAt(i)>=65)))
          {
              System.out.println(" ");
          }
          else
          {
              System.out.println("***************************************************");
              throw new Exception("NameIncorrectFormatException->"+name);
          }
      }
  }
      class NameIncorrectFormatException extends Exception
      {
          NameIncorrectFormatException(String s)
          {
              super(s);
          }
      }
  
}