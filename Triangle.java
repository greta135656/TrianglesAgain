public class Triangle {
 public Point v1, v2, v3;

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
return (distance (v1.x,v1.y,v2.x,v2.y) +
        distance (v2.x,v2.y,v3.x,v3.y) +
        distance (v3.x,v3.y,v1.x,v1.y));
  }


                                                       
                                                       
public double getArea() {
                          return (Math.abs(0.5 * (v1.x * (v2.y - v3.y) + v2.x * (v3.y - v1.y) + v3.x * (v1.y - v2.y) )));
}

              
public String classify() 
{          if (distance (v1.x,v1.y,v2.x,v2.y) ==
              distance ( v2.x,v2.y,v3.x,v3.y) && 
              distance ( v2.x,v2.y,v3.x,v3.y) ==
              distance ( v1.x,v1.y,v3.x,v3.y))
              return "equilateral";
          if (distance ( v1.x,v1.y,v2.x,v2.y) ==
              distance ( v2.x,v2.y,v3.x,v3.y) ||
              distance ( v2.x,v2.y,v3.x,v3.y) ==
              distance ( v1.x,v1.y,v3.x,v3.y) ||
              distance ( v1.x,v1.y,v3.x,v3.y) ==
              distance ( v1.x,v1.y,v2.x,v2.y))
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


                                                       
                                                       
public double getArea() {
                          double semi = getPerimeter() / 2.0;
                          return (Math.sqrt(semi - distance(v1.x,v1.y,v2.x,v2.y)) *
                                        (semi - distance(v2.x,v2.y,v3.x,v3.y)) *
                                        (semi - distance(v3.x,v3.y,v1.x,v1.y)));
}

              
public String classify() 
{          if (distance (v1.x,v1.y,v2.x,v2.y) ==
              distance ( v2.x,v2.y,v3.x,v3.y) && 
              distance ( v2.x,v2.y,v3.x,v3.y) ==
              distance ( v3.x,v3.y,v1.x,v1.y))
              return "equilateral";
          if (distance ( v1.x,v1.y,v2.x,v2.y) ==
              distance ( v2.x,v2.y,v3.x,v3.y) ||
              distance ( v2.x,v2.y,v3.x,v3.y) ==
              distance ( v3.x,v3.y,v1.x,v1.y) ||
              distance ( v3.x,v3.y,v1.x,v1.y) ==
              distance ( v1.x,v1.y,v2.x,v2.y))
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

                                                       
                                                       
public double getArea() {
                          double semi = getPerimeter() / 2.0;
                          return (Math.sqrt(semi - distance(v1.x,v1.y,v2.x,v2.y)) *
                                        (semi - distance(v2.x,v2.y,v3.x,v3.y)) *
                                        (semi - distance(v3.x,v3.y,v1.x,v1.y)));
}

              
public String classify() 
{          if (distance (v1.x,v1.y,v2.x,v2.y) ==
              distance ( v2.x,v2.y,v3.x,v3.y) && 
              distance ( v2.x,v2.y,v3.x,v3.y) ==
              distance ( v3.x,v3.y,v1.x,v1.y))
              return "equilateral";
          if (distance ( v1.x,v1.y,v2.x,v2.y) ==
              distance ( v2.x,v2.y,v3.x,v3.y) ||
              distance ( v2.x,v2.y,v3.x,v3.y) ==
              distance ( v3.x,v3.y,v1.x,v1.y) ||
              distance ( v3.x,v3.y,v1.x,v1.y) ==
              distance ( v1.x,v1.y,v2.x,v2.y))
              return "isosceles";
              else return "scalene";}

public String toString() 
{ return "v1(" + v1 + ") " + "v2(" + v2 + ") " + "v3(" + ") "; }

public void setVertex(int index, Point newP)
{if (index == 0)
{v1 = newP;}
if (index == 1)
{v2 = newP;}
v3 = newP;}}
