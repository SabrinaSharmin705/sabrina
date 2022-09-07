public class ObjectDemo {
    public static void main(String[] args) {
        //create an object of student class
        //using the constructor we can set the student object value/ properties


        student student1 = new student("Sabrina", "c", 22);

        student student2 = new student("rina", "A", 12);



        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(student1.grade);

        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(student2.grade);


    }
}



