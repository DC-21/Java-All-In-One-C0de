class Thread1 extends Thread{
   public void run() {      
      for(int i=0;i<5;i++){
        System.out.println(getName()+" is running. Time is "+i);
      }
   }
}

public class Multi{   
    public static void main(String[] args) throws InterruptedException {        
       Thread t1 = new Thread1();
       t1.setName("Thread 1");
       Thread t2 = new Thread(t1);
       t2.setName("Thread 2");
       t1.start();
       Thread.sleep(100);       
       t2.start();      
    }       
}