package by.epam.boscd.c;

import java.math.BigInteger;

public class TaskFour {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(1);

        for(int i = 2;i <= 200; i++)
        {
            System.out.println(a);
            a = a.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(a);

    }
}
