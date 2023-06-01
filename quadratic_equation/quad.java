import java.util.Scanner;

public class quad{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter coefficients (a,b,c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b* b - 4 * a * a;

        if(discriminant>0){
            System.out.println("roots are real and different");
            double root1 = (-b + Math.sqrt(discriminant))/(2 * a);
            double root2 = (-b - Math.sqrt(discriminant))/(2 * a);
            System.out.println("root1 is :" + root1);
            System.out.println("root2 is :" + root2);
        }

        else if(discriminant==0){
            System.out.println("roots are real and same");
            double root = -b/(2*a);
            System.out.println("root is :"+root);
        }
        else{
            System.out.println("roots are complex and different");
            double realPart = -b/(2*a);
            double imaginaryPart = Math.sqrt(-discriminant)/(2*a);
            System.out.println("Root1 = "+ realPart + "+" + imaginaryPart + "i");
            System.out.println("Root2 = "+ realPart + "-" + imaginaryPart + "i");
        }
    }
}