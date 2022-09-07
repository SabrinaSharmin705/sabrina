public class Sumclaa {
//same name but different parameter (like number of parameter ,type of para, sequence of para)call overloading

//    if child class has method & parent class has same method but body is different is call overwriting
    public static void main(String[] args) {
        Sumclaa s =new Sumclaa();
        s.sum(88,85);

    }


    void sum(int a, int b){
        System.out.println(a+b);

    }

}

//whenever parent class & child class are same method name but method body should be different that call
// over writing
