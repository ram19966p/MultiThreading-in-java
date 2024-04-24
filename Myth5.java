class MyTh implements Runnable
{
Thread th;
 public  MyTh( String s)
{
  th = new Thread(this,s);//this keyword ka use kiya gaya hai, jo Runnable interface //implement karne wale class ke object ko refer karta hai. 
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
if(th.getName().equals("My first thread"))
{
     Thread.sleep(500);
}
else
{
   Thread.sleep(200);
} 
}
catch(InterruptedException e)

        {
            System.out.println("Some problem");
         }
   

}
 System.out.println(th. getName()+"  ====end");
}

}