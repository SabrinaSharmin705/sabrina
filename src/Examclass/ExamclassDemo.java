package Examclass;

public class ExamclassDemo {

    public static void main(String[] args) {

//        For  1-125, if a number can be divided by 5 print buzz, if by 3 print fuzz. If can be by both 3&5 print fuzzBuzz.

        // Let's start by printing out all of the numbers from 1 and 20,
// and let's do it the quick and easy way.
//        for( var i=1; i<21; i++ ) {
//            if( (i%3) == 0 && (i%5) == 0 ) {
//                console.log( "FizzBuzz" );
//            }else if( (i%3) === 0 ) {
//                console.log( "Fizz" );
//            }else if( (i%5) === 0 ) {
//                console.log( "Buzz" );
//            }else{
//                console.log( i );
//            }
//        }


//        int i;
//        for (i=1; i<=100; i++)
//        {
//            // number divisible by 3 and 5 will
//            // always be divisible by 15, print
//            // 'FizzBuzz' in place of the number
//            if (i%15 == 0)
//                printf ("FizzBuzz\t");
//
//                // number divisible by 3? print 'Fizz'
//                // in place of the number
//            else if ((i%3) == 0)
//                printf("Fizz\t");

                // number divisible by 5, print 'Buzz'
                // in place of the number
//            else if ((i%5) == 0)
//                printf("Buzz\t");
//
//            else // print the number
//                printf("%d\t", i);
//
//        }
//
//        return 0;
//    }



       for (int i = 1; i <= 125; i++)
        {
            if (((i / 3) == 0) && ((i / 5) == 0)) // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((i / 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((i / 7) == 0) // Is it a multiple of 7?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 7
        }


//
//        for (int i =1;i<=125;i++){
//            if(i/3==0 && i/5==0){
//                System.out.println("fizzbuzz");
//
//            }
//        }
    }
}
