class Myth extends Thread
{
    MyPrintSty mps;
    String msg ;
 public  Myth(String s, MyPrintSty nps)
   {
     super();
     mps=nps;
     msg=s;
     start();
}
public void run()
{
   mps.msgPrint(msg);
}
}
   
