package by.epam.boscd.lp;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        boolean answer = ((x >= -4 && x <= 4)
                && y<= 0 && y >= -4)
                || (x <= 2 && x >= -2 && y >= 0
                && y <= 4);
        System.out.println(answer);
    }
}
