package com.mathfun.commontangent;

/**
 * Circle
 *
 */
class Circle
{
    private Point center;
    private float radius;
    public Circle(Point center, float radius)
    {
        this.center = center;
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    public Point getCenter(){
        return center;
    }
    public boolean isLargerThan(Circle circle){
        return this.radius > circle.radius;
    }
}


class Point
{
    private float x;
    private float y;
    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public float getX()
    {
        return x;
    }
    public float getY()
    {
        return y;
    }
}


class Line
{
    public float m;
    public float b;
    public Line(float m, float b)
    {
        this.m = m;
        this.b = b;
    }
}
