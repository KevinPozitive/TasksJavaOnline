package by.epam.algorithmization.one_dimensional_array;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[];
        a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
            if(a[i]%k==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
