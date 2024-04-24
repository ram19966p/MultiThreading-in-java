class MyPrintSty
{
  public void msgPrint(String m)
    {
          System.out.println("["+m);
            try 
                {
                  Thread.sleep(1000);
                 }catch(InterruptedException e)
                   {
                      System.out.println(" ****" );
                    }
                      System.out.println("]");
                      }
                      } 
                  