import java.util.Scanner;
public class ArrayProgram
 {
  public static void main(String args[])
   {
   final int Total=10;
   int[] mylist=new int[Total];
  Scanner input=new Scanner(System.in);
  System.out.println("Enter");
   for(int i=0;i<mylist.length;i++)
       { 
        Total+=mylist[i];
       mylist[i]=input.nextInt();
     System.out.println("Total is : "+Total);
       }
   }
 }