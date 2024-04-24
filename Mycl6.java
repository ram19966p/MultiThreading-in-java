//jo ob dikhta nahi hai uska name Thish hota hai  
class Mycl6
{
public static void main(String arg[])
 {
    System.out.println("main thread start ");

MyTh ob1= new MyTh("My first thread" );

MyTh ob2= new MyTh("my second thread");

       try
    { 
        System.out.println("Thread  object 1 is"+ob1.th.isAlive());
        System.out.println("Thread object2 is "+ob2.th.isAlive());
       Thread.sleep(1000);
       System.out.println("Thread  object 1 is "+ob1.th.isAlive());
        System.out.println("Thread object2 is "+ob2.th.isAlive());
    }catch(InterruptedException e)
        {
            System.out.println("Some problem");
         }
    
    System.out.println("Main Thread stop ");
}
}