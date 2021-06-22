import java.util.Scanner;
public class Lottery
{
public static void main(String args[])
  {
  int lottery=(int)(Math.random()*100);
  Scanner input=new Scanner(System.in);
  System.out.println("Enter the lottery number(Two digit): ");
  int guess=input.nextInt();
  if(guess==lottery)
   System.out.println("Match all number your win is $10,000");
  else if(guess%10==lottery/10&&guess/10==lottery%10)
   System.out.println("Input match the lottery the win is $3,000");
  else if (guess%10==lottery%10||guess%10==lottery/10||guess/10==lottery/10||guess/10==lottery%10)
   System.out.println("Input one digit match you win is $1000");
   else
   System.out.println("No Match");
  }
}