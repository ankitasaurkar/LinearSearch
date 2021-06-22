public class CheackEven
{
 public static void main(String args[])
   {
  Scanner reader=new scanner(System.in);
  int num=reader.nextInt();
  System.out.println("Enter a number");
  if(num %2==0)
   System.out.println("This is a even number"+num);
   else
   System.out.println("This is not a even number"+num);
   }
}