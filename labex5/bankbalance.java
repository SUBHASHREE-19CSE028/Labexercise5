/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class bankbalance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("WELCOME TO BANKING SERVICES!!");
       int ch;
       do
       {
           System.out.println("====================");
           System.out.println("Press 1 for Bank A:");
           System.out.println("Press 2 for Bank B:");
           System.out.println("Press 3 for Bank C:");
           System.out.println("===================");
           System.out.println("Enter your choice:");
           int choice=obj.nextInt();
           switch(choice)
           {
               case 1:
                   bankA a=new bankA();
                   System.out.println("Balance amount is: "+"$"+a.getBalance());
                   break;
               case 2:
                   bankB b=new bankB();
                   System.out.println("Balance amount is: "+"$"+b.getBalance());
                   break;
               case 3:
                   bankC c=new bankC();
                   System.out.println("Balance amount is: "+"$"+c.getBalance());
                   break;
               default:
                   System.out.println("YOUR CHOICE IS OUT OF LIMIT!!");
                   break;
            
           }
           System.out.println("====================");
           System.out.println("Press 1 to continue!");
           ch=obj.nextInt();
       
       }while(ch==1);
       System.out.println("TRANSACTION COMPLETED!");
    }
    
}
class bank
{
    int getBalance()
    {
      return 0;
    }
}
class bankA extends bank
{
    @Override
    int getBalance()
    {
      return 1000;
    }
}
class bankB extends bank
{
    @Override
    int getBalance()
    {
      return 1500;
    }
}
class bankC extends bank
{
    @Override
    int getBalance()
    {
      return 2000;
    }
}

