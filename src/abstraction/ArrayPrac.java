package abstraction;

import java.util.Arrays;
import java.util.Comparator;
//doing in both ways with for loop & arrays
public class ArrayPrac {
    ///sum all the numbers
    public static void main(String[] args) {
        int[] aa = {44435, -4435, 3567, 2456, 5552};
        int sum = 0;

        for (int a : aa) {
            sum = sum + a;
        }
        System.out.println(sum);

        int lowest = aa[0];
        for (int a : aa) {
            if (a < lowest) {
                lowest = a;
            }
        }
        System.out.println(lowest);

        int highest = aa[0];
        for (int a : aa) {
            if (a < highest) {
                lowest = a;
            }
        }
        System.out.println(highest);

        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
        }

        System.out.println(Arrays.toString(aa));

        Arrays.sort(aa);
        System.out.println(Arrays.toString(aa));

        System.out.println(aa[0]);
        System.out.println(aa[1]);

        System.out.println(aa[aa.length - 1]);
        System.out.println(aa[aa.length - 2]);


//        Print odd numbers from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322
//
//      odd numbers. we can != for odd numbers too
//        if(x%2==1)
//        if(x%2==1||x%2==-1)
        int n[] = {342, -231, 432, 997, 765, -715, 234, 265, 322};
        for (int x : n) {
            if (x % 2 !=0) {
                System.out.println(x);
            }
        }

        int min = n[0];
        for (int a : n) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println(min);

        System.out.println(Arrays.toString(n));
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[n.length - 1]);


//        for (int x : n) {
//            if (x % 2 == 1 || x % 2 == -1) {
//                System.out.println(x);


            }
        }


