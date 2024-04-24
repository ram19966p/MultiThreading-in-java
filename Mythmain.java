class Mythmain
{
   public static void main(String arg[])
    {
    System.out.println("Main thred start ");
     MyTh  ob1, ob2;
   ob1 = new MyTh(9,"Water");
   ob2= new MyTh(9,"Lime water ");
       ob1.suru();
       ob2.suru();
         try
  	{ 
       		Thread.sleep(100);
         } catch(InterruptedException   e)
            {

            }
         ob1.ruk();
         ob2.ruk();
 System.out.println(ob1.nm+"total step"+ob1.count) ;
System.out.println(ob2.nm+"total step"+ob2.count);
}
}   
   
  
       