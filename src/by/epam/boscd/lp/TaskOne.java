package by.epam.boscd.lp;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double z = ((a - 3)*b/2)+c;
        System.out.println(z);
    }
}
