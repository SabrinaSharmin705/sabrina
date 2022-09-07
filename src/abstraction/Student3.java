package abstraction;

import javax.lang.model.element.Name;

public class Student3 {
    private String name ;
   private int age;

    public void setName(String newName){
        name = newName;
    }
    public String getName() {
        return name;

    }
    public void setAge(int newAge){
        age = newAge;

    }
    public int getAge (){

        return age;
    }
    private int rollNumber;

    public void setRollNumber(int newRollNumber){
        rollNumber = newRollNumber;
    }

    public int getRollNumber (){
        return rollNumber;
    }


    private int id;

    public void setId(int id1){
        id = id1;

    }
    public int getId(){
        return id;
    }






}
