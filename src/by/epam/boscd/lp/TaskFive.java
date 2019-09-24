package by.epam.boscd.lp;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int T = in.nextInt();
        int seconds;
        int minutes;
        int hours;

        seconds = T % 60;
        minutes = T / 60 % 60;
        hours = T / 3600;
        System.out.println(hours + ":" + minutes +":"+ seconds);
    }
}
