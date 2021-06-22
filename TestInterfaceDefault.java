interface Printable
{
 void print();
default void msg()
  {
 System.out.println("default massage");
}
}
  class Rectangle implements Printable
     {
  public void print()
     {
   System.out.println("Draw Rectangle");
     }
     }
   class TestInterfaceDefault
     {
     public static void main(String args[])
       {
    Rectangle d=new Rectangle();
     d.print();
     d.msg();
}
}
    
    