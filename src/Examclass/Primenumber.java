package Examclass;

public class Primenumber {
    public static void main(String[] args) {
//        Find the list of Prime numbers from number 2 to 10,000

        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 2; i <= 10000; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 2 to 10000 are :");
        System.out.println(primeNumbers);

    }
}
