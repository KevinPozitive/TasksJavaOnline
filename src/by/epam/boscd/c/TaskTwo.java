package by.epam.boscd.c;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();
        double x = a;
        while(x<=b) {
            System.out.println( x<=2 ? -x : x );
            x = x+h;
        }
    }
}
