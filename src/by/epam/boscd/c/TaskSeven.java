package by.epam.boscd.c;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int rez;
        if(m < n) {
            int temp;
            temp = m;
            m=n;
            n=temp;
        }

        for(;n<=m;n++)
        {
                System.out.println(n + "del:");
                for(int j=(int)Math.sqrt(n);j>=2;j--)
                {
                    if(n%j==0)
                    {
                        if(j*j!=n)
                            System.out.println(j + "," + n/j);
                        else
                            System.out.println(j);
                    }
                }
        }
    }
}
