public class Execution {

    public static void main(String[] args) {

        Parent ref1=new Parent();
        ref1.a();
        Child ref2=new Child();
        ref2.c();
        GrandChild ref3=new GrandChild();
        ref3.c();
        ref3.f();

    }
}
