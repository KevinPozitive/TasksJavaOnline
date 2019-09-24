package by.epam.boscd.c;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        int a = 0;
        int c;
        for(int i = 1;i<=100;i++)
        {
            a = a + i * i;
        }
        System.out.println(a);

        c = (100 * 101* 201)/6;
        System.out.println(c);
    }
}
