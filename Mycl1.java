class Mycl1
{
public static void main(String arg[])
 {
    javax.swing.JOptionPane.showMessageDialog(null,"main thread start ");

for(int v=1; v<= 10 ; v=v+1)
   {
    
 System.out.println(v);
       try
    { 
       Thread.sleep(1000);
    }catch(InterruptedException e)
        {
            System.out.println("Some problem");
         }
    }
    javax.swing.JOptionPane.showMessageDialog(null,"Main Thread stop ");
}
}