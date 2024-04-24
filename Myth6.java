class MyTh extends Thread 
{
   long count =0;
   boolean  s = true ;
  int p ;
 String  nm;
 MyTh(int n, String s)
 {
     super( );
      setPriority(n);
      getName(); 
    nm = s; 
}
 public void suru()
{
   start();
}
public void  run()
{
   while(s)
   {
      count++;
    }
}
public  void ruk()
{
    s= false;
}
}