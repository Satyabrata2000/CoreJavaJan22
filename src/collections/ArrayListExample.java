package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> arraylist1 = new ArrayList<>();

        arraylist1.add("Raj"); //0th index
        arraylist1.add("Priya"); //1st index
        arraylist1.add("Reena"); //2nd index
        arraylist1.add("Rohan"); //3rd index

        System.out.println("The size of arraylist is "+arraylist1.size());
        System.out.println(arraylist1);

        System.out.println("The element at 0th index is "+ arraylist1.get(1));
        arraylist1.remove(0);

        System.out.println("The size of arraylist is "+arraylist1.size());
        System.out.println(arraylist1);

        arraylist1.set(1, "Supriya"); //to replace the value at 2nd position
        System.out.println(arraylist1);


        //iterating through array list

        //for loop
        for(int index=0; index<arraylist1.size(); index++){
            System.out.println(arraylist1.get(index));
        }

        //for each loop
        for(String name:arraylist1){
            System.out.println(name);
        }

        //using iterator
        Iterator<String> itr = arraylist1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Collections.sort(arraylist1);
        System.out.println(arraylist1);
    }
}
