package com.mathfun.commontangent;

/**
 * Solver
 *
 */
public class Solver
{
    public static Point findExtDivPoint(Circle c1, Circle c2)
    {
        float antecedent = c1.getRadius();
        float consequent = c2.getRadius();

        float x = oneDimExtSectional(
                antecedent, consequent, c1.getCenter().getX(), c2.getCenter().getX());
        float y = oneDimExtSectional(
                antecedent, consequent, c1.getCenter().getY(), c2.getCenter().getY());
        return new Point(x, y);
    }
    private static Float oneDimExtSectional(
            float antecedent, float consequent, float p1, float p2)
    {
        float numerator = (antecedent * p2) - (consequent * p1);
        float denominator = antecedent - consequent;
        return numerator / denominator;
    } 
}
