package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> element = new ArrayList();
        element.add("element1");
        element.add("element2");


        List<String> element0 = new ArrayList();
        element0.add("element3");
       element0.add("element4");


        Map<String, List<String>> map = new HashMap<String,List<String>>();
        map.put("elmt1", element);
        map.put("elmt2", element0);


        System.out.println("using for each loop");
        for(Map.Entry key: map.entrySet()){
            System.out.println(key.getKey()+" "+key.getValue());
        }


        System.out.println("using while loop");
        Iterator it =map.entrySet().iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

    }

}}
