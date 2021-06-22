class person
  {
String name;
int id;
person(String name,int id)
   {
this.id=id;
this.name=name;
 }
}
  class Emp extends person
       {
   float salary;
   Emp(String name,int id,float salary)
      {
   super(name,id);
   this.salary=salary;
       }
   void display()
      {
    System.out.println(name+" "+id+" "+salary);
      }
      }
      class TestSuper 
        {
    public static void main(String args[])
        {
    Emp d=new Emp("Ankita",20,45000f);
     d.display();
       }
       }
