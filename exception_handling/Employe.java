public class Employe{
    public static void validate(int age, String employeeName){
        if(age>50){
            throw new ArithmeticException("employee age is greater than 50");
        }
        else if(employeeName==""){
            System.out.println("name of employee must be a string");
        }
        else{
            System.out.println("employee is below 50");
        }
    }
    public static void main(String[] args){
            validate(10,"chola");
        }
}