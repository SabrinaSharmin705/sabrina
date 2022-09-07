package Exception;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {


//        try {
//            int i[] = {4, 2, 3, 7};
//            System.out.println(i[6]);
//        } catch (Exception e) {
//            System.out.println("There is Array Index  out of bound exception");
//            System.out.println(e);
//        }

        Scanner s =new Scanner(System.in);
        System.out.println("Give me a random number");
//        int a =s.nextInt();
//        System.out.println(a);

        try {
            int a =s.nextInt();
            System.out.println(a);
        }catch (Exception e){
            System.out.println("The input is invalid try to find a number");


        }




        }
    }
