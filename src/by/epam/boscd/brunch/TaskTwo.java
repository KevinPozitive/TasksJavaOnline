package by.epam.boscd.brunch;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double min_1 = (a<b) ? a:b;
        double min_2 = (c<d) ? c:d;
        double max = (min_1>min_2) ? min_1:min_2;
        System.out.println(max);
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
