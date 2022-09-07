public class ReturnTypePrac {

    public static void main(String[] args) {
//if we want to transfer anything we need return type.if we dont do we do void
        ReturnTypePrac ref=new ReturnTypePrac();
        ref.n1();
        ref.n2();
        System.out.println(ref.n1()+ref.n2());

    }



    int n1(){
        int i =5;
        int i1=3;
        System.out.println(i+i1);
        return i+i1;


    }

    int n2(){
        int j=10;
        int j1=11;
        System.out.println(j+j1 );
        return j+j1;

    }
}
