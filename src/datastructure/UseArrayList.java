package datastructure;
import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) throws Exception {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> student = new ArrayList<String>();
        student.add("rabah");
        student.add("rachid");
        student.add("jef");
        student.add("akli");
        System.out.println("All values of array = "+student);
        for (int a = 1; a < 3; a++) {
            System.out.println("specified from index to index = "+student.get(a));
        }
        //connect to db




    }

}
