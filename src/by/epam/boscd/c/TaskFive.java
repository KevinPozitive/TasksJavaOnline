package by.epam.boscd.c;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double e = in.nextDouble();
        double sum = 0;
        double an = 2;
        int i=0;

        if(e>2)
            System.out.println("sum = 0");
        else if(e < 2 && e > 0)
        {

            while(an>=e){
                an = Math.pow(2, -i) + Math.pow(3, -i);
                sum += an;
                i++;
            }
        }
        else {
            System.out.println("Sum = 0");
        }
        System.out.println(sum + " " + i);
    }
}
