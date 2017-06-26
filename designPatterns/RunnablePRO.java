import java.util.logging.Level;
import java.util.logging.Logger;


public class RunnablePRO implements Runnable {
	
	   @Override
       public void run(){
		   
		   final NotificationTest test = new NotificationTest();
           try {
               test.shouldGo();
           } catch (InterruptedException ex) {
               Logger.getLogger(NotificationTest.class.getName()).
                      log(Level.SEVERE, null, ex);
           }
           System.out.println(Thread.currentThread() + " finished Execution");
       }
   

}
