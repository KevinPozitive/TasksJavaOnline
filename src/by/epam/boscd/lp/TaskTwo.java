package by.epam.boscd.lp;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double x = (b + Math.sqrt(b * b + 4 * a * c))/(2*a) - a*a*a*c + 1.0 / (b*b);
        System.out.println(x);
    }

}
