

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;



// add the following numbers into arrayList [321,84,966,465,5,4,78,7], remove numbers 4 and 465. Print the whole arraylist and print last index of the array
public class ArraylistDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(321);//0
        Numbers.add(84);//1
        Numbers.add(966);//2
        Numbers.add(465);//3
        Numbers.add(5);//4
        Numbers.add(4);//5
        Numbers.add(78);//6
        Numbers.add(70);//7
        System.out.println(Numbers);

        Numbers.remove(3);
        System.out.println(Numbers);
        Numbers.remove(4);
        System.out.println(Numbers);

        System.out.println(Numbers.get(5));


//        Print all numbers 342, 432, 765, 234, 265, 322
        ArrayList<Integer> f = new ArrayList<Integer>();

        f.add(342);//0
        f.add(432);//1
        f.add(765);//2
        f.add(234);//3
        f.add(265);//4
        f.add(322);//5
        System.out.println(f);


//        Find the lowest number from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322

//        int a[] = {342, -231, 432, 997, 765, -715, 234, 265, 322};
//        int min = a[0];
//        for (int j = 1; j < a.length; j++) {
//            if (a[j] < min) {
//                min = a[j];
//            }
//        }
//        System.out.println(min);


//        Find the biggest number from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322

//        int b[] = {342, -231, 432, 997, 765, -715, 234, 265, 322};
//        int biggest = a[0];
//        for (int j = 1; j < a.length; j++) {
//            if (b[j] > biggest) {
//                biggest = b[j];
//            }
//        }
//        System.out.println(biggest);


//



                f.sort(Comparator.naturalOrder());

                System.out.println(f);

                int min = f.get(0);
                System.out.println(min);


                int max = f.get(f.size() - 1);
                System.out.println(max);


//       another way of doing sort is Collectios

//        Collections.sort(f);
//        System.out.println(f);


            }
        }






