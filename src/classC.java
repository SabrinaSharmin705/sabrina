public class classC {

    public static void main(String[] args) {
        ClassA ref1=new ClassA();
        ClassB ref2=new ClassB();
        ref1.m1();
        ref2.m2();
        System.out.println(ref2.b);

        int sum=ref1.a + ref2.b;

        System.out.println(sum);
        ClassA ref3=new ClassA();
        ref3.n1();
    }
}
