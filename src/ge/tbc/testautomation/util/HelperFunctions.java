package ge.tbc.testautomation.util;

import ge.tbc.testautomation.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles (Rectangle obj1, Rectangle obj2) {
        String result = obj1.getPerimeter() > obj2.getPerimeter() ? "perimeter 1 > perimeter 2" : "perimeter 1 < perimeter2";
        System.out.println(result);
    }
}