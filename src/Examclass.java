import java.util.Arrays;

public class Examclass {


    public static void main(String[] args) {

        int a[] = {3, 2, 7, 8, 4};
        System.out.println(a[0]);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        System.out.println(a[a.length - 1]);


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {

            sum = sum + a[i];

        }
        System.out.println(sum);


        }
    }
