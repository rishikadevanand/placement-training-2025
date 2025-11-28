interface shapes
{
    double area();
    double perimeter();
}
class circle implements shapes
{
    private double r;
    circle(double r)
    {
      this.r=r;
    }
    double area ()
    {
        return MATH.PI*r*r;
    }
    double perimeter()
    {
        return 2*MATH.PI*r;
    }
}
class rectangle implements shapes
{
   int l;
   int b;
   rectangle(int l,int b)
   {
    this.l=l;
    this.b=b;
   }
   double area()
   {
    return l*b;
   }
   double perimeter()
   {
    return 2*l*b;
   }
}
public class Problem_04
{
    public static void main(String[] args) {
        circle c = new circle(5);
        c.area();
        c.perimeter();
        rectangle r = new rectangle(10,5)
        r.area();
        r.perimeter();
    }
}
