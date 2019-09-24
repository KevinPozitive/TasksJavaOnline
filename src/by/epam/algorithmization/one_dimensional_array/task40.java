package by.epam.algorithmization.one_dimensional_array;

import java.util.Scanner;

public class task40 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int size = in.nextInt();
        int m = (size*(size*size+1))/2;
        int[] numbs = new int[size*size];
        for(int i=0;i<size;i++)
        {
            numbs[i]=i;
        }
        int[][]sqv = new int[size][size];
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++)
            {
                for(int k = 0;k<numbs.length;k++)
                {

                }
            }
        }
    }
}
