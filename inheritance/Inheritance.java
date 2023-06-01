interface A{
    public void methodA ();
}
interface B{
    public void methodB ();
}
class C implements A,B{
    public void methodA (){
        System.out.println("method A");
    }
    public void methodB (){
        System.out.println("method B");
    }
}

public class Inheritance{
    public static void main(String[] args){
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}