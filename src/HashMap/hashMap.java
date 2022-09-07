package HashMap;
//It provides the basic implementation of the Map interface of Java.
// It stores the data in (Key, Value) pairs, and you can access them
// by an index of another type (e.g. an Integer). One object is used
// as a key (index) to another object (value). If you try to insert the duplicate key,
// it will replace the element of the corresponding key.
//when we have to store data with key & value pair
import java.util.HashMap;

public class hashMap {
//    String name = "sabrina";
//    int age = 32;
//    int a[]={4,3,9};

    String username = "Sabrina";
    int password = 12456;

    public static void main(String[] args) {


        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("username",12456);
        hm.put("sabrina",356677);
        hm.put("shamim",35566);
        System.out.println(hm);
        hm.remove("shamim");
        System.out.println(hm.containsKey("shamim"));
        System.out.println(hm);
        hm.replace("username",65444);
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

    }
}



