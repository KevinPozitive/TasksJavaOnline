package by.epam.boscd.brunch;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();

        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        if(x<A){
            if(y<B)
                System.out.println("Passing");
                else if(z<B)
                    System.out.println("Passing");
        }
        else if(y<A){
            if(x<B)
                System.out.println("Passing");
                else if(z<B)
                    System.out.println("Passing");
        }
            else if(z<A){
                if(x<B)
                    System.out.println("Passing");
                    else if(y<B)
                    System.out.println("Passing");
            }
            else
                System.out.println("No passing");
    }
}
