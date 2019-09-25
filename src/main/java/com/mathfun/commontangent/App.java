package com.mathfun.commontangent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Circle c1 = new Circle(new Point(0, 0), 5);
        Circle c2 = new Circle(new Point(10, 30), 1);
        Point ext = new Solver().findExtDivPoint(c1, c2);
        System.out.printf( "%f, %f\n", ext.getX(), ext.getY() );
    }
}
