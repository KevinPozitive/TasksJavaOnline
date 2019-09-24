package by.epam.boscd.brunch;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double f;
        f = (x<=3) ? Math.sqrt(x)-3*x+9:1/(Math.sqrt(x)+6);
        System.out.println(f);
    }
}
