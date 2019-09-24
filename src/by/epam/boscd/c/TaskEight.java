package by.epam.boscd.c;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();


        for(int i = a; i>0;i/=10)
        {
            int numb_1 = i % 10;
            int amount = 0;
            for(int j = a, k = 0;j > 0;j/=10 , k++)
            {
                int numb_2 = j % 10;
                if(numb_1 == numb_2)
                {
                    amount++;
                    if(amount!=1) {
                        a -= numb_1 * Math.pow(10, k);
                        int nextNumb = (int) (a / Math.pow(10, k + 1));
                        a -= nextNumb * Math.pow(10, k + 1);
                        a += nextNumb * Math.pow(10, k);
                        k--;
                    }
                }
            }
        }
        System.out.println(a);
        for(int i = b;i > 0;i/=10)
        {
            int numb_1 = i % 10;
            for(int j = a;j>0;j/=10)
            {
                int numb_2 = j % 10;
                if(numb_1==numb_2)
                {
                    System.out.println(numb_2);
                }
            }
        }
    }
}
