import java.util.Arrays;

public class alimur {
//print the natural number
    public static void main(String[] args) {

//        int a = 0;
//        for (int i=0;i<=10;i++){
//            a+=i;
//            System.out.println(a);
//        }
        int a[] = {3, 5, -5, 10, 20, 35, 60, 15, 2,};

        int b = a.length;
        Arrays.sort(a);
        System.out.println(a[b - 1]);
        System.out.println(b);
//        System.out.println(a[b+1]);

    }
}

