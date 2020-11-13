public class Triangle {
 private Point v1, v2, v3;

 // 2 constructors 
public Triangle(Point a, Point b, Point c) 
  {
    v1 = a;
    v2 = b;
    v3 = c;
      
  }

public Triangle(double x1, double y1,double x2, double y2,double x3, double y3)
{
 v1 = new Point (x1, y1);
 v2 = new Point (x2, y2);
 v3 = new Point (x3, y3);
}

// methods


public static double distance(double x1, double y1,
              double x2, double y2) {
    
  return Math.sqrt ((x2 - x1) * (x2 - x1) + (y2-y1) * (y2-y1));}



public double getPerimeter() {
return (distance (v1.getX(),v1.getY(), v2.getX(),v2.getY() ) +
        distance (v2.getX(),v2.getY() ,v3.getX(),v3.getY() ) +
        distance (v3.getX(),v3.getY() ,v1.getX(),v1.getY() ));
  }


                                                       
                                                       
public double getArea() {
                          return (Math.abs(0.5 * (v1.x * (v2.y - v3.y) + v2.x * (v3.y - v1.y) + v3.x * (v1.y - v2.y) )));
}

              
public String classify() 
{          if (distance (v1.getX(),v1.getY(), v2.getX(),v2.getY()) ==
              distance ( v2.getX(),v2.getY() ,v3.getX(),v3.getY()) && 
              distance ( v2.getX(),v2.getY() ,v3.getX(),v3.getY()) ==
              distance ( v3.getX(),v3.getY() ,v1.getX(),v1.getY() ))
              return "equilateral";
          if (distance ( v1.getX(),v1.getY(), v2.getX(),v2.getY()) ==
              distance ( v2.getX(),v2.getY() ,v3.getX(),v3.getY()) ||
              distance ( v2.getX(),v2.getY() ,v3.getX(),v3.getY()) ==
              distance ( v3.getX(),v3.getY() ,v1.getX(),v1.getY()) ||
              distance ( v3.getX(),v3.getY() ,v1.getX(),v1.getY()) ==
              distance ( v1.getX(),v1.getY(), v2.getX(),v2.getY())
              return "isosceles";
              else return "scalene";}

public String toString() 
{ return "v1(" + v1.getX() + ", " + v1.getY() 
     + ") v2(" + v2.getX() + ", " + v2.getY() 
     + ") v3(" + v3.getX() + ", " + v3.getY() + ")";}

public void setVertex(int index, Point newP)
{if (index == 0)
{v1 = newP;}
if (index == 1)
{v2 = newP;}
v3 = newP;}}
