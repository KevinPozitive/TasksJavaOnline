package by.epam.algorithmization.one_dimensional_array;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        double a[]=new double[size];
        Random rand = new Random();
        for(int i = 0;i<a.length;i++)
        {
//            a[i] = rand.nextGaussian()*1000;
            a[i] = in.nextDouble();
        }
        for(int i = 0;i<a.length;i++) {
            if(a[i]>i)
            {
                System.out.println(a[i]);
            }
        }
    }
}
