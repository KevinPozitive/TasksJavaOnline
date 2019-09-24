package by.epam.boscd.lp;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double R = in.nextDouble();
        int fractional;
        int integer;
        integer = (int)R;
        fractional = (int) (R*1000%1000);
        System.out.println(fractional + "." +integer);

    }
}
