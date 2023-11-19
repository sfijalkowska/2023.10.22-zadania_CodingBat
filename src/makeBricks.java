/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks
(1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */

public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }
    public static boolean makeBricks(int smallBricks, int bigBricks, int goal){
        if (goal > smallBricks + (bigBricks*5)){
            return false;
        }
        if (goal % 5 > smallBricks){
            return false;
        }
        return true;
    }
}
