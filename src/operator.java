public class operator {

    public static void main(String[] args) {
        int income = 40000;
        if (income < 25000) {
            System.out.println("this is low income");
        } else if (income >= 25000 && income <= 78000) {
            System.out.println("this is lower middle income");
        } else if (income > 78000 && income < 187000) {
            System.out.println("this is upper middle income");
        } else {
            System.out.println("this is higher income");
        }

        double a = 344;
        double b = 656;
        double c = 883;
        if (b > a && c < b) {
            System.out.println("this is true");
        } else {
            System.out.println("this is false");
        }

        if (a > b || c > b) {
            System.out.println("this is true");
        } else {
            System.out.println("this is false");
        }
        if (b != 1) {
            System.out.println("this is true");
        } else {
            System.out.println("this is false");
        }
        int i=1;
        while (i<=50){
            System.out.println(i);
            i+=2;
        }


        }
    }
