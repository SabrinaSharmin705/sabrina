public class forloop {
    public static void main(String[] args) {

        for (int d = 0; d <= 100; d++) {
            if (d % 3 == 0 && d % 5 == 0) {
                System.out.println(d);
            }
        }
//        for (int e = 1; e <= 5; e++) {
//            System.out.println(e);
//        }
//        int sum = 0;
//        for (int q = 1; q <= 50; q++) {
//            sum = sum + q;
//        }


        int score = 100;
        if (score >=90 && score <= 100) {
            System.out.println("grade is A");
        } else if (score >=80 && score<=89) {
            System.out.println("Grade is B");
        } else if (score>=70 && score<=79) {
            System.out.println("Grade is c");
            
        } else if (score>=60 && score<=69) {
            System.out.println("Grade is d");
            
        } else if (score >=0 && score <=59) {
            System.out.println("grade is f");
            
        }




    }
}


