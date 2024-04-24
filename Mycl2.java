//jo ob dikhta nahi hai uska name Thish hota hai  
class Mycl2
{
public static void main(String arg[])
 {
    System.out.println("main thread start ");

  new MyTh("My first thread" );

 //new MyTh();

for(int v=1; v<= 10 ; v=v+1)
   {
    
 System.out.println("=========>"+v);
       try
    { 
       Thread.sleep(500);
    }catch(InterruptedException e)
        {
            System.out.println("Some problem");
         }
    }
    System.out.println("Main Thread stop ");
}
}