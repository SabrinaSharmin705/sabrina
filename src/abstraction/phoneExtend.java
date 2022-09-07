package abstraction;

public  class phoneExtend implements phone {

//    when we do interface to class that time we take all the method.if we do one class to other class with extends that
//
//   time we can take only one method
public static void main(String[] args) {
    phoneExtend p = new phoneExtend();
    p.call();
    p.network();
    p.message();


}

void sara(){
    System.out.println("as");
}


    @Override
    public void call() {
        System.out.println("call me");

    }

    @Override
    public void message() {
        System.out.println("text me");

    }

    @Override
    public void network() {

    }
}

