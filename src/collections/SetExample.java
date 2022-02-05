package collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<String>();

        set1.add("Rick");
        set1.add("Raj"); //set doesn't allow duplicates
        set1.add("Mira");
        set1.add("Reena"); //there is no order, it can be stored in any order
        set1.add(null); //set allows null
        //set1.add(null); //it will store null once only, it will eliminate duplicates

        System.out.println(set1);

        LinkedHashSet<String> set2 = new LinkedHashSet<>(); //maintains order, it can be stored in an order

        set2.add("Rick");
        set2.add("Raj");
        set2.add("Mira");
        set2.add("Reena");
        set2.add(null);

        System.out.println(set2);


        TreeSet<String> set3 = new TreeSet<>();

        set3.add("Rick");
        set3.add("Raj");
        set3.add("Mira");
        set3.add("Reena");
        //set3.add(null); We can not add null values to tree set

        System.out.println(set3);

    }
}

//This is an assignment.
//I have a String array, there are multiple values.
// String str1 = "Clean World Green World";
//Remove duplicate values in the string. Result String should have something like this - "Clean World Green";

class RemoveDuplicateWordsStringExample {

    public static void main(String[] args) {

        String str = "Clean World Green World";

        System.out.println("Original String: "+str);

        /*
         * Since the words are separated by space,
         * we will split the string by one or more space
         */

        String[] strWords = str.split("\\s+");

        //convert String array to LinkedHashSet to remove duplicates
        LinkedHashSet<String> lhSetWords = new LinkedHashSet<String>(Arrays.asList(strWords));

        //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;

        for(String s : lhSetWords){

            if(index > 0)
                sbTemp.append(" ");

            sbTemp.append(s);
            index++;
        }

        str = sbTemp.toString();

        System.out.println("String after removing duplicate words: "+str);


    }
}

class AssignmentSolutionInClass{

    public static void main(String[] args){

        String str1 = "Clean World Green World";
        HashSet<String> hs1 = new HashSet<String>();
        for (String word : str1.split(" ")){
            hs1.add(word);
        }
        System.out.println(hs1);
    }
}

