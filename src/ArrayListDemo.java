
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> m = new ArrayList<String>();

        m.add("volvo");//0
        m.add("Bmw");//1
        m.add("Ford");//3
        m.add("Honda");//4
        System.out.println(m);

        System.out.println(m.get(1));
        System.out.println(m.get(3));
        System.out.println(m.size());

        m.remove(1);
        System.out.println(m);
        System.out.println(m.size());
        ArrayList<String> n = new ArrayList<String>();
        n.add("Bmw");
        n.removeAll(n);
        System.out.println(n);



    }
}
