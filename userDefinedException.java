public class AgeException extends Exception {
    public AgeException (String message){
        super(message);
    }
}

public class userDefinedException{
    public static void main(String[] args){
        try {
            int age = 15;
            if(age<18)
            {throw new AgeException("age must be greater or equal to 18");
            }
            System.out.println("you are eligible");
        }
        catch (AgeException ex){
            System.out.println("exception: " + ex.getMessage());
        }
    }
}