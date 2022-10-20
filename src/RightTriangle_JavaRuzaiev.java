/**
 * Right triangle
 * Трикутник прямокутний
 */

public class RightTriangle_JavaRuzaiev {

    public static void main(String[] args) {

        int height = 0, space = 0, star = 0;

        height = 8;

        System.out.println("Right triangle without space");
        height = 3;
//      *
//      ***
//      *****

        space = height;
        star = 1;

        for (int i = 1; i <= height; i++) {
            for (int і = 1; і <= star; і++) {
                System.out.print("*");
            }
            for (int і = 1; і < space; і++) {
                System.out.print(" ");
            }
            space = space - 1;
            star = star + 2;

            System.out.print("\n");
        }
        System.out.print("\n");


        System.out.println("Right triangle with space");
        height = 3;
//      *
//      *  *
//      *  *  *

        space = height;
        star = 1;

        for (int i = 1; i <= height; i++) {
            for (int і = 1; і <= star; і++) {
                System.out.print("*" + " " + " ");
            }
            for (int і = 1; і < space; і++) {
                System.out.print(" ");
            }
            space = space - 1;
            star = star + 1;

            System.out.print("\n");
        }
        System.out.print("\n");

    }
}