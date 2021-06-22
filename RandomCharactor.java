public class RandomCharacter
{
 public static void main(String args[])
   {
   final int NUMBERCARS=175;
   final int CARSLINE=25;
   int ch=RandomCharacter;
 for(inti=0;i<NUMBERCARS;i++)
    {
 char ch=RandomCharacter.getRandomLowerCaseLetter();
   if((i+1)%CARSLINE==0)
    System.out.println(ch);
  else
    System.out.print(ch);
    }
  }
}