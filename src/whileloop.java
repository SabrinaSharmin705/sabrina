public class whileloop {

    //    Create a while loopthat returns back the multiple of3 &5 untill 100
    public static void main(String[] args) {

        int i = 0;
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}

