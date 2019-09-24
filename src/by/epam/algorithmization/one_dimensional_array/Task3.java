package by.epam.algorithmization.one_dimensional_array;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int PositiveValue = 0;
        int NegativeValue = 0;
        int ZeroValue = 0;

        double a[];
        int n = in.nextInt();
        a = new double[n];
        Random rand = new Random();

        for(int i = 0;i<n;i++) {
            a[i] = rand.nextGaussian()*1000;
        }
        for(int i = 0;i<n;i++){
            if(a[i] == 0)
                ZeroValue++;
            else if(a[i]>0)
                PositiveValue++;
            else
                NegativeValue++;
        }
        System.out.println("ZeroValue:"+ZeroValue+"\nPositiveValue:" + PositiveValue
               + "\nNegativeValue:" + NegativeValue);
    }
}
