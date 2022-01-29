package test;

public class ReversalExamples {

    public static void main(String[] args) {

        //reverse String
        //reversal of Array
        //reversal of number

        String str1 = "Clean India Green India";
        String revStr1 = "";

        for(int index=str1.length()-1; index>=0; index--){
            revStr1 = revStr1 + str1.charAt(index);
        }
        System.out.println("Reversed String " + revStr1);

        //Number of vowels

        int result = 0;
        for(int index=0; index<str1.length(); index++){
            if(str1.charAt(index)=='a' || str1.charAt(index)=='e' || str1.charAt(index)=='i' || str1.charAt(index)=='o' || str1.charAt(index)=='u'){
                result++;
            }
        }

        //reversal of array

        int[] array1 = {20,30,40,50,60};

        for(int index=array1.length-1; index>=0; index--){
            System.out.println(array1[index]);
        }

        //reversal of number

        int num5 = 452356;
        int rev = 0;

        while(num5>0) {
            int remainder = num5 % 10;
            rev = rev*10 + remainder;
            num5 = num5 / 10; //45235
        }
        System.out.println("The reversed value is " + rev);
    }
}
