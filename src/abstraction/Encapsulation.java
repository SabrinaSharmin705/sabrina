package abstraction;
// Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data
//(methods) together as a single unit. In encapsulation, the variables of a class will be hidden from
//other classes, and can be accessed only through the methods of their current class.
// Therefore, it is also known as data hiding.

// we don't know the internal implementation but we can access the functions through the methods
public class Encapsulation {

    public static void main(String[] args) {
        Student3 ss =new Student3();

        ss.setName("sabrina");
        System.out.println(ss.getName());
        ss.setAge(32);
        System.out.println(ss.getAge());
        ss.setRollNumber(1);
        System.out.println(ss.getRollNumber());
        ss.setId(37);
        System.out.println(ss.getId());

    }


}
