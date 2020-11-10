/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author padma
 */
public class exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        try
        {
            System.out.println("Enter the first integer:");
            int n=obj.nextInt();
            System.out.println("Enter the second integer:");
            int j=obj.nextInt();
            int k=n/j;
            k=Integer.parseInt(obj.next());
            System.out.println(k);
            System.out.println("No Exceptions!!!");
        }
        catch(ArithmeticException e)
                {
                 System.out.println("Arithmetic Exception--->"+e);
                } 
        try
        {
            int a[]=new int[5];
            a[11]=7;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException--->"+e);
        }
        try
        {
            System.out.println("Enter the string:");
            String r=obj.next();
            System.out.println("No Exceptions!!!");
            
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException--->"+e);
        }
        
                    
                
                    
        // TODO code application logic here
    }
    
}
