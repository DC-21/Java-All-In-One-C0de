public class Exception {
    public static void main(String[] args) {
        try {
            int x=10,y=0;
            int result = x/y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
