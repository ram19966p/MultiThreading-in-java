//jo ob dikhta nahi hai uska name Thish hota hai  
class Mycl7
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
            ob1.th.join();
          ob2.th.join();
       System.out.println("Thread  object 1 is "+ob1.th.isAlive());
        System.out.println("Thread object2 is "+ob2.th.isAlive());
        
    }catch(InterruptedException e)
        {
            System.out.println("Some problem");
         }
    
    System.out.println("Main Thread stop ");
}
}