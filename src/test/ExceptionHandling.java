package test;

public class ExceptionHandling {

    public static void main(String[] args) {

        int num = 10;
        int[] array1 = {5, 67, 234, 78};

        try {
            int result = num / 2;
            System.out.println(array1[10]);

        } catch (ArithmeticException e) {
            System.out.println("inside ArithmeticExcpetion");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("inside ArrayIndexOfBoundsException");
        } catch (Exception e) {
            System.out.println("inside default exception");
        } finally {
            System.out.println("inside finally");
        }
        System.out.println("after try and catch");
    }
}
