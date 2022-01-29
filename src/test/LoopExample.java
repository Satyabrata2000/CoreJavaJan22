package test;

public class LoopExample {

    public static void main(String[] args) {

        //While Loop to print 1 to 10

        int num1 = 1;

        while (num1 <= 10) {

            if (num1 == 5) {
                num1 = num1 + 1;
                continue;
            }
            System.out.println(num1);
            num1 = num1 + 1;

        }

        // For loop to type 1 to 10

        for(int count=1; count<=10; count++){
            if (count == 5) {
                continue;
            }
            System.out.println("inside for loop " + count);
        }


        // Using Break

        for(int count=1; count<=10; count++){
            if (count == 5) {
                break;
            }
            System.out.println("inside for loop " + count);
        }

        //For loop to print from 10 to 1

        for(int count1=10; count1>=1; count1--){

            System.out.println("The count value  " + count1);
        }

        // Arrays with Loop

        int[] array1 = {20,30,40,50,60};
        for(int index=0; index<array1.length;index++){
            System.out.println("Value inside array " + array1[index]);
        }

        for(int value:array1){
            System.out.println(value);
        }
    }
}
