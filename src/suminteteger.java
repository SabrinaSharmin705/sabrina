public class suminteteger {
    //display sum of all the integers 0 to 50
    public static void main(String[] args) {
//        int sum=0;
//        for(int i=1;i<=50;i++){
//            sum=sum+i;
//        }            System.out.println(sum);


//        Add all the numbers and print sum of 342, - 231, 432, 997, 765,  - 715, 234, 265,

        int n[] = {342, -231, 432, 997, 765, -715, 234, 265, 322};

        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
            System.out.println(sum);


//        for (int a : n) {
//            sum = sum + a;
//
//        }
//        System.out.println(sum);


//         Print odd numbers from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322
//
//      odd numbers. we can != for odd numbers too
//        if(x%2==1)
//        if(x%2==1||x%2==-1)
            for (int x : n) {
                if (x % 2 != 0) {
                    System.out.println(x);
                }
            }

//   print even numbers. we
            for (int x : n) {
                if (x % 2 == 0) {
                    System.out.println(x);
                }


            }
        }
    }






