public class RunTimeExceptionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println("the result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Division by zero is not possible");
        }
    }
}