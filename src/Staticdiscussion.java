public class Staticdiscussion {

    public static void main(String[] args) {

//object creation is create connection between same class & other class.where anything outside of main method you can use that

//        non to static
        Staticdiscussion rf = new Staticdiscussion();
        rf.n1();

        System.out.println(rf.c);

        m4();
        System.out.println(d);


    }



    //default non-static(if we don't write anything that is non static & not return type.
//    main method is access modifier(public),static non static(static), return type(void) & name(main)
//    n1 is method & constructor is same name of class name
    void n1() {

        System.out.println("Bangladesh");
        System.out.println(d);

    }

    //whenever we  write static that method belong to the class or other class even in the main method.we dont need
// object creation
    static void m4() {


        System.out.println("india");
    }


    //    default non-static
    int c = 44;
    static int d = 6;



//    Staticdiscussion  k() {
//
//        System.out.println("this is constructor");
//    }











}
