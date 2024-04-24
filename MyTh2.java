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
System.out.println(getName()+"=====Start");

 for(int d=10;d>=1; d=d-1)
{
  System.out.println(d+" "+getName());
 try 
   {
if(getName().equals("My first thread"))
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
 System.out.println( getName()+"  ====end");
}

}