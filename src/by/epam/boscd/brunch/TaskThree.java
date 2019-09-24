package by.epam.boscd.brunch;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Ax = in.nextDouble(), Ay = in.nextDouble();
        double Bx = in.nextDouble(), By = in.nextDouble();
        double Cx = in.nextDouble(), Cy = in.nextDouble();
        double vec_1x,vec_1y;
        double vec_2x,vec_2y;

        vec_1x = Bx - Ax;
        vec_1y = By - Ay;

        vec_2x = Cx - Ax;
        vec_2y = By - Ay;

        if(vec_1x/vec_2x == vec_1y/vec_2y) {
            System.out.println("All points on the same line");
        }
        else {
            System.out.println("One point on another line");
        }
    }
}
