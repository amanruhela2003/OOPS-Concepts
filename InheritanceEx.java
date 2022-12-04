// SOLID-O-OPEN CLOSE PRINCIPLE
//OPEN FOR EXTENSION CLOSE FOR MODIFICATION-----FINAL CLASS
class Shape
{ int area;
    void calculate_area()
    {
        System.out.println("nhi hai kuch");
    }
    void print_area()
    {
        System.out.println("Area " + area);
    }
    
}

class Rectangle extends Shape
{
  int x,y;
  //overside both function in reactangle class
  void calculate_area(int x,int y)
  {
    area=x*y;
  }
  void print_area()
    {
        System.out.println("Area of Rectangle : " + area);
    }
}

class Triangle extends Shape
{ int x,y;
  void calculate_area(int x,int y)
  {
    area=(x*y)/2;
  }
}
class square extends Shape
{
    int x;
  void calculate_area(int x)
  {
    area=x*x;
  }
}

public class InheritanceEx{

  void caller(Shape aakar)
  {
    if(aakar instanceof Rectangle) {
      ((Rectangle) aakar).calculate_area(10, 20);

    }
    else if(aakar instanceof square){
      ((square) aakar).calculate_area(10);

    }
    else if(aakar instanceof Triangle){
      ((Triangle) aakar).calculate_area(10, 20);
      
    }

    aakar.print_area();
  }
public static void main(String[] args) {
    InheritanceEx obj=new InheritanceEx();
    obj.caller(new Rectangle());//rectangle area
    obj.caller(new square());//square area
    obj.caller(new Triangle());//triangle area
  
}
}
