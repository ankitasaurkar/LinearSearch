public class TestVoidMethod
{
public static void main(String args[])
 {
 System.out.println("The Grade is");
 printGrade(78.5);
 }
  public static void printGrade(double score)
   {
   if(score<0||score>100)
   {
    System.out.println("Invalid score");
    return;
    }
   if(score>=90.0){
   System.out.println('A');
    }
   else if(score>=80.0){
    System.out.println('B');
    }
   else if(score>=70.0){
    System.out.println('C');
    }
   else{
   System.out.println('D');
    }
  }
}


  