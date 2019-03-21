package cq;

import java.util.Arrays;
import java.util.Random;

public class tt {
    public static void main(String[] args) {
        double a[][]=new double[5][5];
        for(int i=0;i<a.length;i++){
            System.out.println();
            for(int j=0;j<a[i].length;j++){
                a[i][j]= Math.random()*(3)-2;
                System.out.print(a[i][j]+" ");
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println();
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]>0?1:0);
                System.out.print("  ");
            }
        }
    }
}
