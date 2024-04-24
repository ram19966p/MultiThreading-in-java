class MyTh implements Runnable
{
Thread th;
 public  MyTh( String s)
{
  th = new Thread(this,s);
   th.start();
   
}

public void run()
{
  mywork();
}
public void mywork()
{
System.out.println(th.getName()+"=====Start");

 for(int d=10;d>=1; d=d-1)
{
  System.out.println(d+" "+th.getName());
 try 
   {
    switch(th.getName())
{
case
System.out.println("My first thread");
     Thread.sleep(500);
break ;

default:
   Thread.sleep(200);
     break;
} 
}catch(InterruptedException e)

        {
            System.out.println("Some problem");
         }
   

}
 System.out.println(th. getName()+"  ====end");
}

}