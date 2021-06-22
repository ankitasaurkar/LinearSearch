class Adder
{
static int add(int a,int b){
return a+b;
}
static double add(double a,double b,double c){
return a+b+c;
}
}
class TestOverloading
 {
public static void main(String args[])
   {
System.out.println(Adder.add(5,5));
System.out.println(Adder.add(2.5,1.2,5.0));
   }
}