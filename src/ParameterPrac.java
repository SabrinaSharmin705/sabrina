public class ParameterPrac {
    public static void main(String[] args) {
//when we combined everything we need parameter
        ParameterPrac ref=new ParameterPrac();
        ref.m1("Asia");
        ref.m2(28);
        ref.m1("America");
        ref.m1("Europe");

    }


    void m1(String name){
//        String name = "Asia";
        System.out.println(name);
    }

    void m2(int age){
//        int age=28;
        System.out.println("age");
    }



}
