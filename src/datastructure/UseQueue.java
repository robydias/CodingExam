package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> friend= new LinkedList<>();
        friend.add("rachid");
        friend.add("rabah");
        friend.add("jef");
        friend.add("akli");
        friend.add("massi");
        friend.add("maned");
        friend.add("willson");
        friend.add("rachid");
        System.out.println("peek   : "+friend.peek());
        System.out.println("remove : "+friend.remove());
        System.out.println("poll   : "+friend.poll());

        System.out.println("using for loop :");
        for(String x : friend ){
            System.out.println("my friend : "+x);
        }
        System.out.println("using while loop with iterator :");
        Iterator it = friend.iterator();
        while(it.hasNext()){
            System.out.println("my friend : "+it.next());
        }

    }

}
