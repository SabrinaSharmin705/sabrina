public class GrandChild extends Child {



    void x(){
        System.out.println();
    }


        void Y(){
            System.out.println();
        }


        void b(){
            System.out.println("b from gp");

        }




    void f() {
        this.b();
        super.b();
    }
}

