class MyTh extends Thread
{
 public  MyTh( String s)
{
   super(s);
   //super();
  start();
}

public void run()
{
  mywork();
}
public void mywork()
{
 for(int d=10;d>=1; d=d-1)
{
  System.out.println(d+" "+getName());
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