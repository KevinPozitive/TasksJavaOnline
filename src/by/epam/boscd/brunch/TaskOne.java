package by.epam.boscd.brunch;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        if(a+b >= 180)
            System.out.println("You haven't triangle");
        else if (a+b==90 || a==90 || b==90)
            System.out.println("You have right triangle");
        else
            System.out.println("You have triangle");
    }
}
