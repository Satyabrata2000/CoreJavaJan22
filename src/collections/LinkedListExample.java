package collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<String>();

        list1.add("John");
        list1.add("Donald");
        list1.add("Jack");
        list1.add("Jack");
        list1.addFirst("Rick");

        System.out.println(list1);

        for(int index=0; index<list1.size();index++){
            System.out.println(list1.get(index));
        }

    }
}
