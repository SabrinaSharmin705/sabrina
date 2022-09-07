package variable;

public class variable{

    //entry level of java execution
    public static void main(String[] args) {
        //primitive
        //way to set a variable =>datatype name=value
        int a = 3;
        System.out.println(a);
        long b = 567747777;
        System.out.println(b);
        double c = 567747777;
        System.out.println(c);
        char d = 's';
        System.out.println(d);
        float e = 777;
        System.out.println(e);

        // non-primitive

        String f = "my name is sabrina";
        System.out.println(f);


        int k;//variable with no value
        k= 4;
        System.out.println(k);

        int y = 8;
        int z = 4;
        System.out.println(y + z);
        System.out.println(y - z);
        System.out.println(y * z);
        System.out.println(y / z);
        System.out.println(z % y);
        z++;
        System.out.println(z);
        z += 2;
        z--;
        System.out.println(z);


        System.out.println(y == z);
        System.out.println(y != z);
        System.out.println(y > z);
        System.out.println(y < z);
        System.out.println(y >= z);
        System.out.println(y <= z);

        int m = 10;
        int n = 6;
        int o = 3;
        if (n != o) {

            System.out.println("this is true");

        } else {

            System.out.println("this is false");

        }

        if (m < n && n == o) {
            System.out.println("this is true");

        } else {
            System.out.println("this is false");
        }

        if (m < n || n == o) {
            System.out.println("this is true");

        } else {
            System.out.println("this is false");
        }

        if (f=="my name is sabrina") {
            System.out.println("this is true");
        } else {
            System.out.println("this is false");
        }

        int i =0;
        while(i <= 100){
            System.out.println(i);
            i+=3;
        }

        String p="it is not raining";
        if (p=="it is raining"){
            System.out.println("stay home");
        } else{
            System.out.println("go outside");
        }


        boolean val1, val2;
        System.out.println("Boolean Type in Java");
        val1 = true;
        if(val1)
            System.out.println("This is true and will get displayed!");
        val2 = false;
        if(val2)
            System.out.println("This is false and won't get displayed!");

       int j =18;
       if(j<=18){
           System.out.println("we can board");
       }else {
            System.out.println("can not board");
        }


       boolean e1,e2;
       String s="boolean type in java";
       e1=true;
       e2 = false;
       if(e1){
           System.out.println("this is true");
       }else {
           System.out.println("this is false");
       }

       String q ="it is not raining";
       if(q=="it is raining"){
           System.out.println("Stay home");
       }else {
           System.out.println("go outside");
       }


        }



    }



