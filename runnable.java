class MyTh1 implements Runnable
{

    Thread th;
  
   public  MyTh1()
{
        
    th = new Thread();
    
   th.start();
}
public void run()
{
  mywork();
}
public void mywork()
{
 for(int d=10;d>=1; d=d-1)
{
  System.out.println(d+" __________");
 try 
   {
     Thread.sleep(1000);
   }catch(InterruptedException e)
     {
        System.out.println("Same problem");
     }
}
}
}

