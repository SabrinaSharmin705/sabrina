import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        int a[] =new int[9];
//        System.out.println(a.length);
//        a[0]=10;
//        a[1]=20;
//        a[2]=40;
//        a[3]=70;
//        a[4]=50;
//        a[5]=80;
//        System.out.println(a[1]);
//        System.out.println(a[8]);
//
        int b[]={342,222,245,786,346,755};


        System.out.println(b.length);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);

        for (int i = 0; i < b.length; i++) {

            System.out.println(b[i]);
        }

      System.out.println(Arrays.toString(b));


//        System.out.println(numbers);

//        Print all numbers 342, 432, 765, 234, 265, 322
//        int b[342,432,765,234,265,322];


        Arrays.sort(b);
        System.out.println(Arrays.toString(b));



        String[]names={"New York","Boston","Buffalo","michigan"};

        System.out.println(names[2]);

//        for(int i=0;i< names.length;i++){
//            System.out.println(names[i]);
//        }
        System.out.println(Arrays.toString(names));

        for (String a:names) {
            System.out.println(a);

        }

        String name = "Shamim";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        System.out.println(Arrays.toString(fruits));


        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        System.out.println(fruits.length);

        for (String a:fruits){
            System.out.println(a);


        }






    }
    }


